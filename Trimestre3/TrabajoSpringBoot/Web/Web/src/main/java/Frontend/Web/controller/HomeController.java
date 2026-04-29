package Frontend.Web.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import Frontend.Web.model.Libro;

@Controller
public class HomeController {

    @Value("${api.base.url}") 
    private String apiBaseUrl;

    private final RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/")
    public String home(Model model) {
        cargarLibros(model);
        return "index";
    }

   
    private void cargarLibros(Model model) {
        try {
            String url = apiBaseUrl + "/api/libros";
            // Llamamos a la API y guardamos lo que nos mande en una lista de libros.
            Libro[] librosArray = restTemplate.getForObject(url, Libro[].class);
            List<Libro> libros = Arrays.asList(librosArray != null ? librosArray : new Libro[0]);
            model.addAttribute("libros", libros); // Le pasamos esa lista a la página web para que la dibuje.
        } catch (Exception e) {
            // Lista vacía para que la web no se rompa.
            model.addAttribute("libros", new ArrayList<Libro>());
        }
    }
}