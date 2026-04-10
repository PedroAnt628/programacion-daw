package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

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

    @GetMapping("/pokemon")
    public String mostrarPokemon(Model model) {
        Random r = new Random();
        int id = r.nextInt(1025) + 1;
        Pokemon p = service.obtenerPokemon(id);
        if (p != null) {
            p.setImagen("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/" + id + ".png");
        }
        model.addAttribute("pokemons", List.of(p));
        return "pokemon";
    }

    @GetMapping("/pokemon/generacion/1")
    public String gen1(Model model) {
        return obtenerAleatoriosPorRango(1, 151, model);
    }

    @GetMapping("/pokemon/generacion/2")
    public String gen2(Model model) {
        return obtenerAleatoriosPorRango(152, 251, model);
    }

    @GetMapping("/pokemon/generacion/3")
    public String terceraGeneracion() {
        return "error";
    }

    @GetMapping({"/pokemon/{id}"})
    public String mostrarPokemon(@PathVariable(required = true) Integer id, Model model) {
        Pokemon pokemon = service.obtenerPokemon(id);
        if (pokemon == null) {
            model.addAttribute("error", "No se pudo obtener el Pokémon");
            return "error";
        }
        pokemon.setImagen("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/" + id + ".png");
        model.addAttribute("pokemon", pokemon);
        return "pokemonDetalle";
    }

    private String obtenerAleatoriosPorRango(int min, int max, Model model) {
        Set<Integer> idsUnicos = new HashSet<>();
        Random r = new Random();
        int rango = max - min + 1;

        while (idsUnicos.size() < 10) {
            idsUnicos.add(r.nextInt(rango) + min);
        }

        List<Pokemon> pokemons = idsUnicos.stream()
            .map(id -> {
                Pokemon p = service.obtenerPokemon(id);
                if (p != null) {
                    p.setImagen("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/" + id + ".png");
                }
                return p;
            })
            .filter(p -> p != null)
            .collect(Collectors.toList());

        model.addAttribute("pokemons", pokemons);
        return "pokemon";
    }
}