package com.iglesiaweb.iglesiaweb.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


//mostrando ao spring que aqui é uma classe controler
@Controller
public class HomeController {

    //o uso do getmapping é pra chamar as paginas da pasta template
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("nome","Kennedy");
        return "home/index";
    }
}
