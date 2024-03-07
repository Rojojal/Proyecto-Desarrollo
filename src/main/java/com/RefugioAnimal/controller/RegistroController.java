//
//package com.RefugioAnimal.controller;
//
//import com.RefugioAnimal.domain.Registro;
//import com.RefugioAnimal.service.RegistroService;
//import com.RefugioAnimal.service.impl.FirebaseStorageServiceImpl;
//import java.util.List;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.multipart.MultipartFile;
//
//
//@Controller
//@RequestMapping("/registro")
//public class RegistroController {
//   
//    
//    RegistroService registroService;
//            
//    @GetMapping("/listado")
//    public String listado(Model model) {
//        List<Registro> lista = registroService.getRegistros(false);
//        model.addAttribute("registro", lista);
//        model.addAttribute("totalRegistros", lista.size());
//        return "/registro/listado";
//    }
//    
//    @GetMapping("/nuevo")
//    public String registroNuevo(Registro registro) {
//        return "/registro/modifica";
//    }
//
//    
//    private FirebaseStorageServiceImpl firebaseStorageService;
//    
//    
//
//    @GetMapping("/eliminar/{idRegistro}")
//    public String registroEliminar(Registro registro) {
//        registroService.delete(registro);
//        return "redirect:/registro/listado";
//    }
//
//    @GetMapping("/modificar/{idRegistro}")
//    public String registroModificar(Registro registro, Model model) {
//        registro = registroService.getRegistro(registro);
//        model.addAttribute("registro", registro);
//        return "/registro/modifica";
//    }
//    
//}
