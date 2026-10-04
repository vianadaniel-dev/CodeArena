package com.codearena.codearena.infrastructure.adapters.out.jpa.repository;

import com.codearena.codearena.domain.model.Dificultad;
import com.codearena.codearena.infrastructure.adapters.out.jpa.entity.RetoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpringDataRetoRepository extends JpaRepository<RetoEntity, Long> {
    List<RetoEntity> findByDificultad(Dificultad dificultad);
    boolean existsByTitulo(String titulo);
}
