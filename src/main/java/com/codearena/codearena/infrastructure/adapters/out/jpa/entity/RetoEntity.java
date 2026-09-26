package com.codearena.codearena.infrastructure.adapters.out.jpa.entity;


import com.codearena.codearena.domain.model.Dificultad;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;


@Entity
@Table(name = "retos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RetoEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(nullable = false)
        private String titulo;

        @Column(nullable = false, length = 500)
        private String descripcion;

        @Column(nullable = false)
        private String categoria;

        // Guardamos el Enum como un String en la BD
        @Enumerated(EnumType.STRING)
        @Column(nullable = false)
        private Dificultad dificultad;

        @Column(name = "experiencia_otorgada", nullable = false)
        private Integer experienciaOtorgada;

        @Column(name = "fecha_creacion", nullable = false)
        private LocalDateTime fechaDeCreacion;

        @Column(name = "fecha_limite", nullable = false)
        private LocalDateTime fechaLimite;

        @Column(nullable = false)
        private String estado;
    }
