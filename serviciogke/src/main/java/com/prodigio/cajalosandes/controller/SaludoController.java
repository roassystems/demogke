package com.prodigio.cajalosandes.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SaludoController {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
    
	@CrossOrigin(origins = "*")
	@GetMapping("/saludar/{usr}")
    public String saludar(@PathVariable(value = "usr") String nombreASaludar) {
        //logger.info("Saludo solicitado el dia "+sdf.format(new Date()));
        return "Hola Sr(a) "+nombreASaludar+" Desde GCP + GKE, fecha: "+sdf.format(new Date()) ;
    }
}