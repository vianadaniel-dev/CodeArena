package com.codearena.codearena.infrastructure.adapters.out.jpa.repository;

import com.codearena.codearena.infrastructure.adapters.out.jpa.entity.RetoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataRetoRepository extends JpaRepository<RetoEntity, Long> {

}
