/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.RefugioAnimal.controller;

import com.RefugioAnimal.domain.Mascota;
import com.RefugioAnimal.domain.Solicitud;
import com.RefugioAnimal.service.SolicitudService;
import com.RefugioAnimal.service.MascotaService;
import com.RefugioAnimal.service.impl.FirebaseStorageServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Extreme
 */

@Controller
@RequestMapping("/solicitudesAdopcion")
public class SolicitudesAdopcionController {
    
    
    @Autowired
    SolicitudService solicitudService;
    @Autowired
    MascotaService mascotaService;
            
    @GetMapping("/listado")
    public String listado(Model model) {
        List<Solicitud> lista = solicitudService.getSolicitudes(false);
        model.addAttribute("solicitud", lista);
        model.addAttribute("totalSolicitudes", lista.size());
        return "/solicitudesAdopcion/listado";
    }
    
    @GetMapping("/nuevo")
    public String solicitudNuevo(Solicitud solicitud) {
        return "/solicitudesAdopcion/modifica";
    }

    @Autowired
    private FirebaseStorageServiceImpl firebaseStorageService;
    
    @PostMapping("/guardar")
    public String solicitudGuardar(Solicitud solicitud) {        
        solicitudService.save(solicitud);
        return "redirect:/solicitudesAdopcion/listado";
    }

    @GetMapping("/eliminar/{idSolicitud}")
    public String solicitudEliminar(Solicitud solicitud, @RequestParam("status") String status) {
        
        solicitud = solicitudService.getSolicitud(solicitud);
        Mascota mascota = mascotaService.getMascota((long) solicitud.getIdMascota());
        
        
        solicitudService.delete(solicitud);
        if (status.equals("aceptado")) mascotaService.delete(mascota);
       
        return "redirect:/solicitudesAdopcion/listado";
    }

   @GetMapping("/info-mascota/{idMascota}")
    public String mascotaModificar(Mascota mascota, Model model) {
        mascota = mascotaService.getMascota(mascota);
        model.addAttribute("mascota", mascota);
        return "/solicitudesAdopcion/datosMascota";
    }
    
    
}


