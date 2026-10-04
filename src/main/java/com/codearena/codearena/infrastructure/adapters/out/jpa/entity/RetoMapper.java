package com.codearena.codearena.infrastructure.adapters.out.jpa.entity;

import com.codearena.codearena.domain.model.Reto;
import org.springframework.stereotype.Component;

@Component

public class RetoMapper {

    public RetoEntity toEntity(Reto reto){

        if (reto == null) { return null; }



        RetoEntity entity = new RetoEntity();

        entity.setId(reto.getIdentificador());

        entity.setTitulo(reto.getTitulo());

        entity.setDescripcion(reto.getDescripcion());

        entity.setCategoria(reto.getCategoria());

        entity.setDificultad(reto.getDificultad());

        entity.setExperienciaOtorgada(reto.getExperienciaOtorgada());

        entity.setFechaDeCreacion(reto.getFechaDeCreacion());

        entity.setFechaLimite(reto.getFechaLimite());

        entity.setEstado(reto.getEstado());

        return entity;

    }



    public Reto toDomain(RetoEntity entity) {

        if (entity == null) { return null;}

        Reto reto = new Reto();

        reto.setIdentificador(entity.getId());

        reto.setTitulo(entity.getTitulo());

        reto.setDescripcion(entity.getDescripcion());

        reto.setCategoria(entity.getCategoria());

        reto.setDificultad(entity.getDificultad());

        reto.setExperienciaOtorgada(entity.getExperienciaOtorgada());

        reto.setFechaDeCreacion(entity.getFechaDeCreacion());

        reto.setFechaLimite(entity.getFechaLimite());

        reto.setEstado(entity.getEstado());

        return reto;

    }

}