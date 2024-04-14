package com.RefugioAnimal.controller;

import com.RefugioAnimal.domain.Comentario;
import com.RefugioAnimal.service.ComentarioService;
import com.RefugioAnimal.service.impl.FirebaseStorageServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class ComentarioController {
    
    @Autowired
    ComentarioService comentarioService;
    
    @RequestMapping("/comentarios")
    public String comentario(Model model) {
        model.addAttribute("attribute", "value");
        return "/comentarios/comentariosListado";
    }
    
    @GetMapping("/comentarios")
    public String listado(Model model) {
        List<Comentario> lista = comentarioService.getComentarios(false);
        model.addAttribute("comentarios", lista);
        model.addAttribute("totalComentarios", lista.size());
        return "/comentarios/comentariosListado";
    }

    @Autowired
    private FirebaseStorageServiceImpl firebaseStorageService;
    
    @PostMapping("/guardar")
    public String comentarioGuardar(Comentario comentario) {
        comentarioService.save(comentario);
        return "redirect:/comentarios";
    }

}