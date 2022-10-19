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

    @RequestMapping("/create")
    public String crear() {
        return "create_shoes";
    }

    @RequestMapping("/update")
    public String actualizar() {
        return "update_shoes";
    }

    @RequestMapping("/sales")
    public String ventas() {
        return "sales";
    }
}
