package com.RefugioAnimal.controller;

import com.RefugioAnimal.service.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class AdoptarController {
    
    @Autowired
    MascotaService mascotaService;
    
    @RequestMapping("/adoptar")
    public String adoptar(Model model) { 
        var listaMascotas = mascotaService.getMascotas(true);
        model.addAttribute("mascotas", listaMascotas);
        return "/adoptar/listado";
    }
    
}
