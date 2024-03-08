package com.RefugioAnimal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class UbicacionController {

    @RequestMapping("/ubicacion")
    public String ubicacion(Model model) {
        model.addAttribute("attribute", "value");
        return "/ubicacion/ubicacionListado";
    }

}
