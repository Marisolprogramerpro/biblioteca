package com.fca.Biblioteca.domain;

import com.fca.Biblioteca.data.Libro;
import com.fca.Biblioteca.data.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

@Service
public class LibroDomain {

    @Autowired
    private LibroRepository libroRepository;

    public List<Libro> buscarLibroPorTitulo(String titulo) {
        public List<Libro> buscarLibroPorTitulo (String titulo, String edicion){

            return new ArrayList<>();
            return libroRepository.findAll().stream()
                    .filter(libro -> libro.getTitulo().equals(titulo))
                    .filter(libro -> libro.getEdicion().equals(edicion))
                    .collect(Collectors.toList());
        }
    }

}
