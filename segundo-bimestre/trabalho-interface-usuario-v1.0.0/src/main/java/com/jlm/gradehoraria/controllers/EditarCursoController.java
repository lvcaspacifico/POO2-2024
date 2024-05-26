package com.lvcaspacifico.gradehoraria.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EditarCursoController {

    @GetMapping("inicio/cursos/editar-curso")
    public String index(){
        return "html/editar-curso.html";
    }

}
