package com.jmeact1_t4.spring.jmeact1_t4.jmeact1_t4.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

@RestController
public class DetallesController {

     // b) Endpoint que regresa información de un objeto o lista simulada
    @GetMapping("/misMaterias")
    public List<String> obtenerMaterias() {
        return List.of("Gestion de proyectos de software", "Programación web", "Diseño e implementación de software con patrones", "Lenguajes y Automatas 2", "Sistemas programables");
    }

    // c) Endpoint adicional que muestra otro tipo de respuesta
    @GetMapping("/estado")
    public Map<String, Object> obtenerEstado() {
        return Map.of(
            "estudiante", "JME",
            "status", "activo",
            "servidor", "local"
        );
    }
}