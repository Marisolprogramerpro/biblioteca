package com.fca.Biblioteca.data;

import jakarta.persistence.*;

@Entity
@Table(name="autor")
public class Autor {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "idautor")
    private int idAutor;
    @Column(name = "idpersona")
    private int idPersona;

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }
}
