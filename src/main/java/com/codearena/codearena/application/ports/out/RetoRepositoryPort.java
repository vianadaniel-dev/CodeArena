package com.codearena.codearena.application.ports.out;

import com.codearena.codearena.domain.model.Dificultad;
import com.codearena.codearena.domain.model.Reto;

import java.util.List;
import java.util.Optional;

public interface RetoRepositoryPort {
    Reto guardar(Reto reto);
    Optional<Reto> buscarPorId(Long id);
    List<Reto> buscarPorDificultad(Dificultad dificultad);
    boolean existePorTitulo(String titulo);
}
