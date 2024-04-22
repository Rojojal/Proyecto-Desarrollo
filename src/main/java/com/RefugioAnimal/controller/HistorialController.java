/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.RefugioAnimal.controller;

import com.RefugioAnimal.domain.Historial;
import com.RefugioAnimal.domain.HistorialMascota;
import com.RefugioAnimal.domain.Mascota;
import com.RefugioAnimal.service.HistorialMascotaService;
import com.RefugioAnimal.service.HistorialService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Extreme
 */
    @Controller
@RequestMapping("/historial")
public class HistorialController {
        
    @Autowired
    HistorialService historialService;
    @Autowired
    HistorialMascotaService historialMascotaService;
            
    @GetMapping("/listado")
    public String listado(Model model) {
        List<Historial> lista = historialService.getHistorial(true);
        List<HistorialMascota> mascotas = new ArrayList <>();

        
        for (Historial historial : lista){
            
            HistorialMascota mascota = historialMascotaService.getMascota((long) historial.getIdMascota());
            
            mascotas.add(mascota);
        }
        
        model.addAttribute("historial", lista);
        model.addAttribute("totalHistorial", lista.size());
        
        model.addAttribute("mascotas", mascotas);
        model.addAttribute("totalMascotas", mascotas.size());
        return "/historialAdopciones/listado";
    }
}
