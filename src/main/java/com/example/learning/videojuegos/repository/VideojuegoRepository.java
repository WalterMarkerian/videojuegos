package com.example.learning.videojuegos.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.learning.videojuegos.domain.Videojuegos;

public interface VideojuegoRepository extends JpaRepository<Videojuegos, Integer> {
    
    @Query("from Videojuegos v order by v.nombre")
    List<Videojuegos> buscarTodos();

    @Query("from Videojuegos v where v.distribuidor.id = ?1 order by v.nombre")
    List<Videojuegos> buscarPorDistribuidor(Integer distribuidorId);
    //List<Videojuegos> findByDistribuidorId(Integer distribuidorId);

    //@Query("from Videojuegos v where v.nombre like %?1%")
    //List<Videojuegos> buscar(String consulta);

    List<Videojuegos> findByNombreContaining(String consulta);


}
