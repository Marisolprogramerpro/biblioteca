package com.fca.Biblioteca.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="autor")

public class Autor extends Persona {
    @Id
    @Column(name = "idAutor")
    private int idAutor;
    @Column(name = "idPersona")
    private int idPersona;

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }


}
