package com.RefugioAnimal.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class SobreNosotrosController {

    @RequestMapping("/sobreNosotros")
    public String sobreNosotros(Model model) {
        model.addAttribute("attribute", "value");
        return "/sobreNosotros/sobreNosotrosListado";
    }

}
