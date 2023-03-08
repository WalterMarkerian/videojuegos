package com.example.learning.videojuegos.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.learning.videojuegos.domain.Videojuego;

@Service
public class VideojuegoService {
    
    public List<Videojuego> buscarDestacados(){
        List<Videojuego> destacados = new ArrayList<>();

         Videojuego juego = new Videojuego();
         juego.setNombre("Borderlands 3");
         juego.setDescripcion("¡Vuelve el padre de los shooter-looter, con tropecientas mil armas y una aventura caótica!");
         juego.setImagenUrl("https://upload.wikimedia.org/wikipedia/en/a/a3/Official_cover_art_for_Bioshock_Infinite.jpg");
         destacados.add(juego);

         juego = new Videojuego();
         juego.setNombre("Control");
         juego.setDescripcion("Tras la invasión de una agencia secreta de Nueva York por parte de una amenaza de otro mundo, te conviertes en la nueva directora que deberá luchar para recuperar Control.");
         juego.setImagenUrl("https://store-images.s-microsoft.com/image/apps.14118.66496411985646769.c617342d-28e4-4aaf-9b96-89dda9e9d20e.aecf493d-2741-458e-a881-4bc9d8e1dda9");
         destacados.add(juego);

         juego = new Videojuego();
         juego.setNombre("Subnautica");
         juego.setDescripcion("Un juego de aventuras submarinas ambientado en un mundo oceánico alienígena. ¡Te espera un mundo abierto enorme lleno de maravillas y peligros! ");
         juego.setImagenUrl("https://cdn.akamai.steamstatic.com/steam/apps/210970/capsule_616x353.jpg?t=1598383120");
         destacados.add(juego);

         juego = new Videojuego();
         juego.setNombre("Firewatch");
         juego.setDescripcion("Firewatch es un juego de misterio en primera persona para un jugador que se desarrolla en la selva de Wyoming");
         juego.setImagenUrl("https://upload.wikimedia.org/wikipedia/en/6/6a/Braidlogo.jpg");
         destacados.add(juego);

         return destacados;
    }
}
