package com.codearena.codearena.infrastructure.adapters.out.jpa.repository;

import com.codearena.codearena.infrastructure.adapters.out.jpa.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataUsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
}
