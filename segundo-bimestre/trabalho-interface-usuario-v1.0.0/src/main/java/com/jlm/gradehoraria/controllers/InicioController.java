package com.lvcaspacifico.gradehoraria.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InicioController {

    @GetMapping("inicio")
    public String index() {
        return "html/inicio.html";
    }

}
