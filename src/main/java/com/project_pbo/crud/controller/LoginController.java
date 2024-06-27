package com.project_pbo.crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/mahasiswa")
    public String mahasiswa() {
        return "mahasiswa";
    }
}

