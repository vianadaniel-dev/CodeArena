package com.codearena.codearena.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
    private Long identificador;
    private String nombre;
    private String username;
    private String correoElectronico;
    private String contrasena;
    private Rol rol;
    private Nivel nivel;
    private Integer experienciaAcumulada;
    private String estado;
}
