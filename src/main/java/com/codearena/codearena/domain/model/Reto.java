package com.codearena.codearena.domain.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reto {
    private Long identificador;
    private String titulo;
    private String descripcion;
    private String categoria;
    private Dificultad dificultad;
    private Integer experienciaOtorgada;
    private LocalDateTime fechaDeCreacion;
    private LocalDateTime fechaLimite;
    private String estado;
}


