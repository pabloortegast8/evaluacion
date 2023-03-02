package com.evaluacion.cliente.heroe.evaluacionclientecajalosheroes.model;


public class EvaluacionClienteModel {
    
    private Long id;
    private String nombre;
    private Integer rut;
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
