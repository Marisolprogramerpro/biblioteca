package com.fca.Biblioteca.domain;

import com.fca.Biblioteca.data.Libro;
import com.fca.Biblioteca.data.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;

@Service
public class LibroDomain {

    @Autowired
    private LibroRepository libroRepository;

    private List<Libro> PrestarLibroPorTitulo(String titulo){
        return libroRepository.findAll();
    }

}
