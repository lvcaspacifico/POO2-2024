package com.jlm.gradehoraria.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VisualizarController {

    @GetMapping("inicio/cursos/visualizar")
    public String index(){
        return "html/visualizar.html";
    }

}
