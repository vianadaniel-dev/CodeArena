package com.codearena.codearena.infrastructure.adapters.out.jpa.adapter;

import com.codearena.codearena.application.ports.out.UsuarioRepositoryPort;
import com.codearena.codearena.domain.model.Usuario;
import com.codearena.codearena.infrastructure.adapters.out.jpa.entity.UsuarioEntity;
import com.codearena.codearena.infrastructure.adapters.out.jpa.entity.UsuarioMapper;
import com.codearena.codearena.infrastructure.adapters.out.jpa.repository.SpringDataUsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service // Le dice a Spring que esta clase es un componente que debe gestionar
@RequiredArgsConstructor // Lombok crea un constructor automáticamente para inyectar nuestras dependencias
public class UsuarioPersistenceAdapter implements UsuarioRepositoryPort {

    // Traemos nuestras dos herramientas de infraestructura
    private final SpringDataUsuarioRepository repository;
    private final UsuarioMapper mapper;

    @Override
    public Usuario guardar(Usuario usuario) {
        // 1. Traducir de Dominio a Entity
        UsuarioEntity entity = mapper.toEntity(usuario);

        // 2. Guardar en la base de datos
        UsuarioEntity savedEntity = repository.save(entity);

        // 3. Traducir de Entity a Dominio y retornarlo
        return mapper.toDomain(savedEntity);
    }

    @Override
    public Optional<Usuario> buscarPorId(Long id) {
        return repository.findById(id)
                .map(mapper::toDomain);
    }

    @Override
    public Optional<Usuario> buscarPorCorreo(String correo) {
        return Optional.empty();
    }


    @Override
    public Optional<Usuario> buscarPorUsername(String username) {
        return repository.findByUsername(username)
                .map(mapper::toDomain);
    }

    @Override
    public boolean existePorUsername(String username) {
        return repository.existsByUsername(username);
    }

    @Override
    public boolean existePorCorreo(String correo) {
        return repository.existsByCorreoElectronico(correo);
    }
}

