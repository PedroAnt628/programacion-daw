package Backend.Api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Backend.Api.model.Libro;


@RestController 
@RequestMapping("/api/libros") // Prefijo
public class LibroController {

    @Autowired //instancia de LibroRepository
    private LibroRepository libroRepository;

    @GetMapping 
    public List<Libro> listarTodos() {
        return libroRepository.findAll();
    }

    @PostMapping
    public Libro añadir(@RequestBody Libro libro) {
        return libroRepository.save(libro);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Libro> editar(@PathVariable int id, @RequestBody Libro detallesLibro) {
        Optional<Libro> optionalLibro = libroRepository.findById(id);
        if (optionalLibro.isPresent()) {
            Libro libro = optionalLibro.get();
            libro.setTitulo(detallesLibro.getTitulo());
            libro.setAutor(detallesLibro.getAutor());
            libro.setPrecio(detallesLibro.getPrecio());
            libro.setAnio(detallesLibro.getAnio());
            libro.setImagen(detallesLibro.getImagen());
            return ResponseEntity.ok(libroRepository.save(libro));
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public void borrar(@PathVariable int id) {
        libroRepository.deleteById(id);
    }

    @GetMapping("/buscar/titulo")
    public List<Libro> buscarPorTitulo(@RequestParam String termino) {
        return libroRepository.findByTituloContainingIgnoreCase(termino);
    }

    @GetMapping("/buscar/autor") 
    public List<Libro> buscarPorAutor(@RequestParam String termino) {
        return libroRepository.findByAutorContainingIgnoreCase(termino);
    }

    @GetMapping("/buscar/anios")
    public List<Libro> buscarEntreAnios(@RequestParam Integer minimo, @RequestParam Integer maximo) {
        return libroRepository.findByAnioBetween(minimo, maximo);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Libro> buscarPorId(@PathVariable int id) {
        return libroRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}