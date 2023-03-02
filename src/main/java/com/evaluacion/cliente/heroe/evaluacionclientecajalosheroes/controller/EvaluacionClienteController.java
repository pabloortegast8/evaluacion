package com.evaluacion.cliente.heroe.evaluacionclientecajalosheroes.controller;

import java.util.ArrayList;
import java.util.Optional;
import java.util.logging.Logger;

import javax.websocket.server.PathParam;

import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.evaluacion.cliente.heroe.evaluacionclientecajalosheroes.entity.EvaluacionClienteEntity;
import com.evaluacion.cliente.heroe.evaluacionclientecajalosheroes.services.EvaluacionClienteService;

@RestController
@RequestMapping(value = "/cliente")
public class EvaluacionClienteController {
    
    @Autowired
     EvaluacionClienteService evaluacionClienteService;

     @GetMapping()
     public ArrayList<EvaluacionClienteEntity> obtenerClientes(){
        return evaluacionClienteService.obtenerCliente();
     }

     @PostMapping()
     public EvaluacionClienteEntity guardarCliente(@RequestBody EvaluacionClienteEntity cliente){
      try {
            if(cliente == null){
              Logger.getLogger("no viene informacion para guardar al cliente");
            }
      } catch (Exception e) {
            Logger.getLogger(e.getMessage());
      }
           return this.evaluacionClienteService.guardiaCliente(cliente);
     }
     

     @GetMapping(path = "/datos/{rut}")
      public Optional<EvaluacionClienteEntity> consultaParticular(@PathParam("rut") Integer rut ){
             return this.evaluacionClienteService.consultaParticular(rut);
      }
}
