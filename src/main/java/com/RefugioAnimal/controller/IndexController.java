package com.RefugioAnimal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    
    @RequestMapping("/")
    public String page(Model model) {
        model.addAttribute("attribute", "value");
        return "index";
    }
    
    //@RequestMapping("/registro")
    //public String registro(Model model) {
      //  model.addAttribute("attribute", "value");
        //return "/registro/fragmentos";
    //}
    
    @RequestMapping("/panel")
    public String panel(Model model) {
        model.addAttribute("attribute", "value");
        return "/administracion/accesoPersonalRefugio";
    }
    
    @RequestMapping("/login")
    public String login(Model model) {
        model.addAttribute("attribute", "value");
        return "/administracion/login";
    }
    
}
