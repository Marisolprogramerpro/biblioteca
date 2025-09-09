package com.fca.Biblioteca.domain;

import com.fca.Biblioteca.data.Libro;
import com.fca.Biblioteca.data.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
public class LibroDomain {

    @Autowired
    private LibroRepository libroRepository;

    public List<Libro> buscarLibrosDisponibles (String titulo, String edicion) {
        if (titulo == null || edicion == null || titulo.isEmpty() || edicion.isEmpty()) {
            return new ArrayList<>();
        }
        Predicate<Libro> filtroLibro = libro ->
                libro != null &&
                libro.getTitulo().equals(titulo) &&
                        libro.getEdicion().equals(edicion);
        Predicate<Libro> disponible = libro ->
                libro != null &&
                        libro.getExistencia() > 0;
        return libroRepository.findAll()
                //sustituye al for
                .stream()
                //equivale al if
                .filter(filtroLibro.and(disponible))
                .collect(Collectors.toList());

    }

}
