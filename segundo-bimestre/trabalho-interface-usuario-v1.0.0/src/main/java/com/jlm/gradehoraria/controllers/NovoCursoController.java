package com.lvcaspacifico.gradehoraria.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NovoCursoController {

    @GetMapping("inicio/cursos/novo-curso")
    public String index(){
        return "html/novo-curso.html";
    }

}
