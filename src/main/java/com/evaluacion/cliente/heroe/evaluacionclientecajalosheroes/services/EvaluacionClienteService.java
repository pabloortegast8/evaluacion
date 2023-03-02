package com.evaluacion.cliente.heroe.evaluacionclientecajalosheroes.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evaluacion.cliente.heroe.evaluacionclientecajalosheroes.entity.EvaluacionClienteEntity;
import com.evaluacion.cliente.heroe.evaluacionclientecajalosheroes.model.EvaluacionClienteModel;
import com.evaluacion.cliente.heroe.evaluacionclientecajalosheroes.repository.EvaluacionClienteRepository;

@Service
public class EvaluacionClienteService {
    @Autowired
    EvaluacionClienteRepository clienteRepository;

    public ArrayList<EvaluacionClienteEntity> obtenerCliente(){
        return (ArrayList<EvaluacionClienteEntity>)clienteRepository.findAll();
    }

    public EvaluacionClienteEntity guardiaCliente(EvaluacionClienteEntity cliente){
           return clienteRepository.save(cliente);
    }

    public Optional<EvaluacionClienteEntity> consultaParticular(Integer rut) {
        return clienteRepository.findByRut(rut);
    }
}
