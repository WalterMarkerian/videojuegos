package com.example.learning.videojuegos.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.learning.videojuegos.domain.Videojuegos;

public interface VideojuegoRepository extends JpaRepository<Videojuegos, Integer> {
    
}
