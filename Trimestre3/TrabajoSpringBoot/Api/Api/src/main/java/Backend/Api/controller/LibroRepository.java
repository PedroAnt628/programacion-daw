package Backend.Api.controller;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Backend.Api.model.Libro;

/**
 * intermediario entre la aplicación y la base de datos
 */
@Repository
public interface LibroRepository extends JpaRepository<Libro, Integer> {
    
    
    List<Libro> findByTituloContainingIgnoreCase(String titulo);
    
    
    List<Libro> findByAutorContainingIgnoreCase(String autor);
    
    
    List<Libro> findByAnioBetween(Integer minimo, Integer maximo);
}