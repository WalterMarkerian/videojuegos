package com.example.learning.videojuegos.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.learning.videojuegos.domain.Videojuegos;
import com.example.learning.videojuegos.service.VideojuegoService;

@Controller
public class ListadoController {

    private final VideojuegoService videojuegoService;
    


    public ListadoController(VideojuegoService videojuegoService) {
        this.videojuegoService = videojuegoService;
    }



    @RequestMapping("/")
    public String listarVideojuegos(Model model){
        List<Videojuegos> destacados = videojuegoService.buscarDestacados();
        model.addAttribute("videojuegos", destacados);
        return "listado";
    }

    @RequestMapping("/videojuegosPorDistribuidor")
    public String listarVideojuegosPorDistribuidor(Integer distribuidorId, Model model){
        System.out.println("esto:" +distribuidorId);

        List<Videojuegos> juegos = videojuegoService.buscarPorDistribuidor(distribuidorId);
        model.addAttribute("videojuegos", juegos);
        System.out.println("esto:" +distribuidorId);
        return "listado";
    }
    
}
