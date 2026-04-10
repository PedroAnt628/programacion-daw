package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.model.Pokemon;
import com.example.demo.service.PokemonService;

@Controller
public class PokemonController {

    @Autowired
    private PokemonService service;

    // INICIO: Solo 1 aleatorio (de las dos primeras gen)
    @GetMapping("/pokemon")
    public String inicio(Model model) {
        Random r = new Random();
        int id = r.nextInt(251) + 1;
        return cargarListaPokemons(List.of(id), model);
    }

    // TAREA GEN 1: 10 aleatorios del 1 al 151
    @GetMapping("/pokemon/generacion/1")
    public String primeraGen(Model model) {
        return cargarVariosAleatorios(1, 151, model);
    }

    // TAREA GEN 2: 10 aleatorios del 152 al 251
    @GetMapping("/pokemon/generacion/2")
    public String segundaGen(Model model) {
        return cargarVariosAleatorios(152, 251, model);
    }

    @GetMapping("/tercera-generacion")
    public String terceraGen(Model model) {
        model.addAttribute("error", "Error 404: La tercera generación no está implementada.");
        return "error";
    }

    @GetMapping("/pokemon/{id}")
    public String detalle(@PathVariable Integer id, Model model) {
        Pokemon p = service.obtenerPokemon(id);
        p.setImagen("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/" + id + ".png");
        model.addAttribute("pokemon", p);
        return "pokemonDetalle";
    }

    // MÉTODOS AUXILIARES (Para no repetir código)
    private String cargarVariosAleatorios(int min, int max, Model model) {
        Random r = new Random();
        Set<Integer> ids = new HashSet<>();
        while (ids.size() < 10) {
            ids.add(r.nextInt(max - min + 1) + min);
        }
        return cargarListaPokemons(new ArrayList<>(ids), model);
    }

    private String cargarListaPokemons(List<Integer> ids, Model model) {
        List<Pokemon> lista = new ArrayList<>();
        for (Integer id : ids) {
            Pokemon p = service.obtenerPokemon(id);
            if (p != null) {
                p.setImagen("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/" + id + ".png");
                lista.add(p);
            }
        }
        model.addAttribute("pokemons", lista);
        return "pokemon";
    }
}