package com.RefugioAnimal.controller;

import com.RefugioAnimal.service.CorreoService;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/enviarCorreo")
public class EnviarCorreoController {

    @Autowired
    private CorreoService correoService;

    @GetMapping
    public String mostrarFormulario() {
        return "/Contacto/salidaMensaje";

    }

    @PostMapping("/enviar")
    public String enviarCorreo(Model model, @RequestParam("correo") String correo) {
        try {
            // Definir el asunto y el contenido del correo
            String asunto = "¡Bienvenido!";
            String contenidoHtml = "Gracias por ingresar tu correo electrónico.";

            // Enviar correo electrónico al usuario
            correoService.enviarCorreoHtml(correo, asunto, contenidoHtml);

            model.addAttribute("mensaje", "Correo enviado exitosamente a " + correo);
        } catch (MessagingException e) {
            model.addAttribute("error", "Error al enviar el correo electrónico.");
        }

        return "/Contacto/salidaMensaje";
    }
}