package com.estudiantes.estudiantes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class StudentContoller {
    @RequestMapping("/")
    public String principal() {
        return "index";
    }

    @RequestMapping("/login")
    public String iniciarSesion() {
        return "login";
    }

    @RequestMapping("/products")
    public String productos() {
        return "products";
    }

    @RequestMapping("/editar")
    public String editar() {
        return "edit_student";
    }
}
