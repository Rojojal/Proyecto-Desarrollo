package com.RefugioAnimal.controller;

import com.RefugioAnimal.domain.Formulario;
import com.RefugioAnimal.service.FormularioService;
import com.RefugioAnimal.service.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class AdoptarController {
    
    @Autowired
    MascotaService mascotaService;
    
    @Autowired
    FormularioService formularioService;
    
    @RequestMapping("/adoptar")
    public String adoptar(Model model) { 
        var listaMascotas = mascotaService.getMascotas(true);
        model.addAttribute("mascotas", listaMascotas);
        return "/adoptar/listado";
    }

    @PostMapping("/guardarFormulario")
    public String guardarFormulario(Formulario formulario) {
        formularioService.save(formulario);
        return "redirect:/adoptar";
    }
    
}
