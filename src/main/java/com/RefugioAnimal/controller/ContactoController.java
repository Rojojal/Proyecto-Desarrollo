package com.RefugioAnimal.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class ContactoController {

    @RequestMapping("/contacto")
    public String contacto(Model model) {
        model.addAttribute("attribute", "value");
        return "/Contacto/contactoListado";
    }

}
