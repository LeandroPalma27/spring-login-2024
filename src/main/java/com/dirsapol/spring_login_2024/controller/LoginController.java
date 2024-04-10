package com.dirsapol.spring_login_2024.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    
    @GetMapping("/login")
    public String Login() {
        return "users/login";
    }

}
