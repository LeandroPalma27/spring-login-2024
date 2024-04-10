package com.dirsapol.spring_login_2024.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    /**
     * @param {model} Model for pass model data object from DAO
     * @return {String} view name 
     */
    @GetMapping("/home")
    public String Home(Model model) {
        model.addAttribute("Name", "Leandro DIRSAPOL");
        return "home";
    }

}
