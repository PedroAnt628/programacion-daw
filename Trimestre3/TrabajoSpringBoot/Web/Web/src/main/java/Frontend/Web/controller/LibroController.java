package Frontend.Web.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import Frontend.Web.model.Libro;

/**
 * Diferencia clave con la API: Este devuelve HTML (con Thymeleaf), no JSON.
 */
@Controller
@RequestMapping("/libros") // Prefijo
public class LibroController {

    @Value("${api.base.url}") // Lee la URL de la API desde application.properties (http://localhost:8080)
    private String apiBaseUrl;

    // RestTemplate es el "cliente HTTP" para llamar a la API
    private final RestTemplate restTemplate = new RestTemplate();

    @GetMapping //Muestra la tabla con todos los libros
    public String listarLibros(Model model) {
        String url = apiBaseUrl + "/api/libros";
        Libro[] librosArray = restTemplate.getForObject(url, Libro[].class);
        List<Libro> libros = Arrays.asList(librosArray);
        model.addAttribute("libros", libros); 
        model.addAttribute("libro", new Libro()); //Libro vacío para que el formulario no de error.
        return "libros";
    }

    @PostMapping //Guardar un libro nuevo.
    public String agregarLibro(@ModelAttribute Libro libro, RedirectAttributes redirectAttributes) {
        String url = apiBaseUrl + "/api/libros";
        // Mandamos los datos del nuevo libro a la API para que lo guarde.
        restTemplate.postForObject(url, libro, Libro.class);
        redirectAttributes.addFlashAttribute("mensaje", "Libro agregado exitosamente");
        return "redirect:/libros";
    }

    @GetMapping("/editar/{id}") //Página para editar
    public String mostrarFormularioEditar(@PathVariable int id, Model model) {
        String url = apiBaseUrl + "/api/libros/" + id;
        Libro libro = restTemplate.getForObject(url, Libro.class);
        model.addAttribute("libro", libro);
        return "editarLibro";
    }

    @PostMapping("/editar/{id}")// Guardar los cambios después de editar
    public String editarLibro(@PathVariable int id, @ModelAttribute Libro libro, RedirectAttributes redirectAttributes) {
        String url = apiBaseUrl + "/api/libros/" + id;
        // Le decimos a la API: "cambia los datos viejos por estos nuevos".
        restTemplate.put(url, libro);
        redirectAttributes.addFlashAttribute("mensaje", "Libro editado exitosamente");
        return "redirect:/libros";
    }

    @GetMapping("/borrar/{id}")// Borrar un libro
    public String borrarLibro(@PathVariable int id, RedirectAttributes redirectAttributes) {
        String url = apiBaseUrl + "/api/libros/" + id;
        restTemplate.delete(url);
        redirectAttributes.addFlashAttribute("mensaje", "Libro borrado exitosamente");
        return "redirect:/libros";
    }

    @GetMapping("/buscar")// Buscar por título o autor
    public String buscarLibros(@RequestParam String termino, @RequestParam String tipo, Model model) {
        String url;
        if ("titulo".equals(tipo)) {
            url = apiBaseUrl + "/api/libros/buscar/titulo?termino=" + termino;
        } else {
            url = apiBaseUrl + "/api/libros/buscar/autor?termino=" + termino;
        }
        Libro[] librosArray = restTemplate.getForObject(url, Libro[].class);
        List<Libro> libros = Arrays.asList(librosArray);
        model.addAttribute("libros", libros);
        model.addAttribute("libro", new Libro());
        model.addAttribute("terminoBusqueda", termino);
        return "libros";
    }

    @GetMapping("/buscar/anios")// Buscar por rango de años
    public String buscarPorAnios(@RequestParam Integer minimo, @RequestParam Integer maximo, Model model) {
        String url = apiBaseUrl + "/api/libros/buscar/anios?minimo=" + minimo + "&maximo=" + maximo;
        Libro[] librosArray = restTemplate.getForObject(url, Libro[].class);
        List<Libro> libros = Arrays.asList(librosArray);
        model.addAttribute("libros", libros);
        model.addAttribute("libro", new Libro());
        return "libros";
    }
}