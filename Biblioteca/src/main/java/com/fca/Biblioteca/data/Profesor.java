package com.fca.Biblioteca.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "profesor")

public class Profesor extends Persona {
    @Id
    @Column(name = "idProfesor")
    private int idProfesor;
    @Column(name = "idPersona")
    private int idPersona;
    @Column(name = "numeroTrabajador")
    private String numeroTrabajador;

    //Getters y Setters
    public String getNumeroTrabajador() {

        return numeroTrabajador;
    }
    public void setNumeroTrabajador(String numeroTrabajador) {

        this.numeroTrabajador = numeroTrabajador;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }
}
