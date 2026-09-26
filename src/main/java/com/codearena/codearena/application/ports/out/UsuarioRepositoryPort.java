package com.codearena.codearena.application.ports.out;

import com.codearena.codearena.domain.model.Usuario;
import java.util.Optional;


public interface UsuarioRepositoryPort {
    Usuario guardar(Usuario usuario);
    Optional<Usuario> buscarPorId(Long id);
    Optional<Usuario> buscarPorCorreo(String correo);
    boolean existePorUsername(String username);
    boolean existePorCorreo(String correo);
}
