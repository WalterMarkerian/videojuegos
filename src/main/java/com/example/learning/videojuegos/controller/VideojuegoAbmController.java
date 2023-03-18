package com.example.learning.videojuegos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.learning.videojuegos.domain.Videojuegos;
import com.example.learning.videojuegos.service.DistribuidorService;
import com.example.learning.videojuegos.service.VideojuegoService;


@Controller
public class VideojuegoAbmController {

    private final DistribuidorService distribuidorService;
    private final VideojuegoService videojuegoService;



    public VideojuegoAbmController(DistribuidorService distribuidorService, VideojuegoService videojuegoService) {
        this.distribuidorService = distribuidorService;
        this.videojuegoService = videojuegoService;
    }

    @RequestMapping("/videojuegos/crear")
    public String mostrarFormAlta(Model model) {
        model.addAttribute("distribuidores",distribuidorService.buscarTodos());
        model.addAttribute("videojuego", new Videojuegos());
        return "formVideojuego";
    }

    @PostMapping("/videojuegos/guardar")
    public String guardar(Videojuegos videojuego){
        videojuegoService.guardar(videojuego);
        return "redirect:/";
    }
}
