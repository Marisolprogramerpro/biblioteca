package com.fca.Biblioteca.data;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.Year;

@Entity
@Table(name="libro")


public class Libro {
        @Id
        @Column(name="idLibro")
        private int idLibro;

        @Column(name="titulo")
        private String titulo;

        @Column(name="aniopublicacion")
        private Year aniopublicacion;

        @Column(name="editorial")
        private String editorial;

        @Column(name="edicion")
        private String edicion;

        @Column(name="isbn")
        private String isbn;

        @Column(name="existencia")
        private int existencia;

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Year getAniopublicacion() {
        return aniopublicacion;
    }

    public void setAniopublicacion(Year aniopublicacion) {
        this.aniopublicacion = aniopublicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }
}
