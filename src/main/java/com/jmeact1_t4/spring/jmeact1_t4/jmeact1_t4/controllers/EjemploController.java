package com.jmeact1_t4.spring.jmeact1_t4.jmeact1_t4.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

@RestController
public class EjemploController {

    // a) Endpoint que regresa el nombre del proyecto o iniciales para identificar la instancia
    @GetMapping("/proyecto")
    public String obtenerProyecto() {
        return "Proyecto: JMEact1_t4 / Alumno: JME- Jiménez Mendoza Eduardo";
    }

  
}