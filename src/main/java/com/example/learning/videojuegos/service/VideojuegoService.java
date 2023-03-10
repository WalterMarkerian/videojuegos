package com.example.learning.videojuegos.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.learning.videojuegos.domain.Videojuegos;
import com.example.learning.videojuegos.repository.VideojuegoRepository;

@Service
public class VideojuegoService {

    private final VideojuegoRepository videojuegoRepository;

    public VideojuegoService(VideojuegoRepository videojuegoRepository) {
        this.videojuegoRepository = videojuegoRepository;
    }

    public List<Videojuegos> buscarDestacados() {
        
        return videojuegoRepository.buscarTodos();
    }
    
    public List<Videojuegos> buscarPorDistribuidor(Integer distribuidorId) {
        
        return videojuegoRepository.buscarPorDistribuidor(distribuidorId);
    }

    
}
