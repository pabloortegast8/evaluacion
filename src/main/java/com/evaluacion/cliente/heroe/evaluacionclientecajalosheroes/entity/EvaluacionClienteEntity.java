package com.evaluacion.cliente.heroe.evaluacionclientecajalosheroes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name =  "cliente")
public class EvaluacionClienteEntity {
    

        @Id
        @Column(unique = true, nullable = false)
        private Long id;
    
        private String nombre;
        @Column(unique = true, nullable = false)
        private Integer rut;
        @Column(unique = true)
        private String mail;
        private Integer numeroTelefono;
    
        public Long getId() {
            return id;
        }
        public void setId(Long id) {
            this.id = id;
        }
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public Integer getRut() {
            return rut;
        }
        public void setRut(Integer rut) {
            this.rut = rut;
        }
        public String getMail() {
            return mail;
        }
        public void setMail(String mail) {
            this.mail = mail;
        }
        public Integer getNumeroTelefono() {
            return numeroTelefono;
        }
        public void setNumeroTelefono(Integer numeroTelefono) {
            this.numeroTelefono = numeroTelefono;
        }
}
