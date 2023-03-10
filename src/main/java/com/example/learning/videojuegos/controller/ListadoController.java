package com.example.learning.videojuegos.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
        List<Videojuegos> juegos = videojuegoService.buscarPorDistribuidor(distribuidorId);
        model.addAttribute("videojuegos", juegos);
        return "listado";
    }
    
    @RequestMapping("/buscar")
    public String buscar(@RequestParam("q")String consulta, Model model){
        List<Videojuegos> juegos = videojuegoService.buscar(consulta);
        model.addAttribute("videojuegos", juegos);
        return "listado";
    }

}
