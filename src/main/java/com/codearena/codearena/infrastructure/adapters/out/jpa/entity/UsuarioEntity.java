package com.codearena.codearena.infrastructure.adapters.out.jpa.entity;

import com.codearena.codearena.domain.model.Nivel;
import com.codearena.codearena.domain.model.Rol;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Equivalente a identificador

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false, unique = true)
    private String username;


    @Column(nullable = false, unique = true)
    private String correoElectronico;

    @Column(nullable = false)
    private String contrasena;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Rol rol;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Nivel nivel;

    @Column(name = "experiencia_acumulada", nullable = false)
    private Integer experienciaAcumulada;

    @Column(nullable = false)
    private String estado;
}
