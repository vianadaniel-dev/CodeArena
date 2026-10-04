package com.codearena.codearena.infrastructure.adapters.out.jpa.adapter;

import com.codearena.codearena.application.ports.out.RetoRepositoryPort;
import com.codearena.codearena.domain.model.Dificultad;
import com.codearena.codearena.domain.model.Reto;
import com.codearena.codearena.infrastructure.adapters.out.jpa.entity.RetoEntity;
import com.codearena.codearena.infrastructure.adapters.out.jpa.entity.RetoMapper;
import com.codearena.codearena.infrastructure.adapters.out.jpa.repository.SpringDataRetoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RetoPersistenceAdapter implements RetoRepositoryPort {

    private final SpringDataRetoRepository repository;
    private final RetoMapper mapper;



    @Override
    public Reto guardar(Reto reto) {

        // 1. Traducir de Dominio a Entity
        RetoEntity entity = mapper.toEntity(reto);

        // 2. Guardar en la base de datos
        RetoEntity savedEntity = repository.save(entity);

        // 3. Traducir de Entity a Dominio y retornarlo
        return mapper.toDomain(savedEntity);
    }

    @Override
    public Optional<Reto> buscarPorId(Long id) {

        return repository.findById(id)
                .map(mapper::toDomain);
    }

    @Override
    public List<Reto> buscarPorDificultad(Dificultad dificultad) {
        return repository.findByDificultad(dificultad)
                .stream()
                .map(mapper::toDomain)
                .collect(java.util.stream.Collectors.toList());
    }

    @Override
    public boolean existePorTitulo(String titulo) {
        return repository.existsByTitulo(titulo);
    }


}
