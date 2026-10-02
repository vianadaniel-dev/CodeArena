package com.codearena.codearena.infrastructure.adapters.out.jpa.repository;

import com.codearena.codearena.infrastructure.adapters.out.jpa.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SpringDataUsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
    // ¡La magia de Spring Data! Solo con nombrar bien el método,
    // Spring genera la consulta SQL por debajo.
    Optional<UsuarioEntity> findByCorreoElectronico(String correoElectronico);
    boolean existsByUsername(String username);
    boolean existsByCorreoElectronico(String correoElectronico);
}
