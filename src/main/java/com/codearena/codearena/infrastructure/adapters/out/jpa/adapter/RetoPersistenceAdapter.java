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
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RetoPersistenceAdapter implements RetoRepositoryPort {

    private final SpringDataRetoRepository repository;
    private final RetoMapper mapper;

    @Override
    public Reto guardar(Reto reto) {
        RetoEntity entity = mapper.toEntity(reto);
        RetoEntity savedEntity = repository.save(entity);
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
                .collect(Collectors.toList());
    }

    @Override
    public boolean existePorTitulo(String titulo) {
        return repository.existsByTitulo(titulo);
    }
}
