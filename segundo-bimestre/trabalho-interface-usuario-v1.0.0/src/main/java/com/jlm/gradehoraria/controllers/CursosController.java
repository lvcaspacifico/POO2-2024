package com.jlm.gradehoraria.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CursosController {

    @GetMapping("inicio/cursos")
    public String index(){
        return "html/cursos.html";
    }

}
