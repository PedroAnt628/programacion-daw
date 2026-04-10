package com.example.demo.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class DemoController {

    @GetMapping("/demo") 
    public String home(Model model) {
        model.addAttribute("nombre", "Hola desde Spring Boot"); 
        model.addAttribute("nombres", List.of("Alicia", "Bob", "Maria"));
        return "index"; 
    }

    @GetMapping("/contacto")
    public String contacto() { return "contacto"; }

    @GetMapping("/smr")
    public String smr() { return "smr"; }

    @GetMapping("/asir")
    public String asir() { return "asir"; }

    @GetMapping("/daw")
    public String daw() { return "daw"; }
}