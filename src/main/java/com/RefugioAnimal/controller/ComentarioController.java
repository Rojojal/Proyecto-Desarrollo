package com.RefugioAnimal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ComentarioController {

@RequestMapping("/comentarios")
    public String comentario(Model model) {
        model.addAttribute("attribute", "value");
        return "/comentarios/comentariosListado";
    }

}