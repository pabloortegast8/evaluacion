package com.evaluacion.cliente.heroe.evaluacionclientecajalosheroes.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.evaluacion.cliente.heroe.evaluacionclientecajalosheroes.entity.EvaluacionClienteEntity;

@Repository
public interface EvaluacionClienteRepository extends CrudRepository<EvaluacionClienteEntity, Long>{

    Optional<EvaluacionClienteEntity> findByRut(Integer rut);

}