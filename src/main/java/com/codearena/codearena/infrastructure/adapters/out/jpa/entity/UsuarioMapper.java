package com.codearena.codearena.infrastructure.adapters.out.jpa.entity;

import com.codearena.codearena.domain.model.Usuario;
import org.springframework.stereotype.Component;

@Component // Le decimos a Spring que administre esta clase
public class UsuarioMapper {

    // Convierte un objeto del Dominio a una Entidad de Base de Datos
    public UsuarioEntity toEntity(Usuario usuario) {
        if (usuario == null) {
            return null;
        }
        UsuarioEntity entity = new UsuarioEntity();
        entity.setId(usuario.getIdentificador());
        entity.setNombre(usuario.getNombre());
        entity.setUsername(usuario.getUsername());
        entity.setCorreoElectronico(usuario.getCorreoElectronico());
        entity.setContrasena(usuario.getContrasena());
        entity.setRol(usuario.getRol());
        entity.setNivel(usuario.getNivel());
        entity.setExperienciaAcumulada(usuario.getExperienciaAcumulada());
        entity.setEstado(usuario.getEstado());
        return entity;
    }

    // Convierte una Entidad de Base de Datos a un objeto del Dominio
    public Usuario toDomain(UsuarioEntity entity) {
        if (entity == null) {
            return null;
        }
        Usuario usuario = new Usuario();
        usuario.setIdentificador(entity.getId());
        usuario.setNombre(entity.getNombre());
        usuario.setUsername(entity.getUsername());
        usuario.setCorreoElectronico(entity.getCorreoElectronico());
        usuario.setContrasena(entity.getContrasena());
        usuario.setRol(entity.getRol());
        usuario.setNivel(entity.getNivel());
        usuario.setExperienciaAcumulada(entity.getExperienciaAcumulada());
        usuario.setEstado(entity.getEstado());
        return usuario;
    }
}