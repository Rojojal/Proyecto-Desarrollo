package com.RefugioAnimal.controller;

import com.RefugioAnimal.domain.Visita;
import com.RefugioAnimal.service.VisitaService;
import com.RefugioAnimal.service.impl.FirebaseStorageServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/visita")
public class VisitaController {
    
    @Autowired
    VisitaService visitaService;
            
    @GetMapping("/listado")
    public String listado(Model model) {
        List<Visita> lista = visitaService.getVisitas(false);
        model.addAttribute("visitas", lista);
        model.addAttribute("totalVisitas", lista.size());
        return "/visita/listado";
    }
    
    @GetMapping("/nuevo")
    public String visitaNuevo(Visita visita) {
        return "/visita/modifica";
    }

    @Autowired
    private FirebaseStorageServiceImpl firebaseStorageService;
    
    @PostMapping("/guardar")
    public String visitaGuardar(Visita visita) {

        visitaService.save(visita);
        return "redirect:/visita/listado";
    }

    @GetMapping("/modificar/{idVisita}")
    public String visitaModificar(Visita visita, Model model) {
        visita = visitaService.getVisita(visita);
        model.addAttribute("visita", visita);
        return "/visita/modifica";
    }
    
}