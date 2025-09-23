package com.fca.Biblioteca.presentation;


import com.fca.Biblioteca.data.Libro;
import com.fca.Biblioteca.domain.LibroDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Controller
public class LibroController {
    @Autowired
    private LibroDomain libroDomain;


    LibroController(LibroDomain libroDomain) {
        this.libroDomain = libroDomain;
    }

    @RequestMapping(value = "/libros-disponibles", method = RequestMethod.GET)
    @ResponseBody
    public List<Libro> buscarLibrosDisponibles
            (@RequestParam String titulo, @RequestParam String edicion) {
        return libroDomain.buscarLibrosDisponibles(titulo,edicion);
    }

    @RequestMapping(value = "/libros", method = RequestMethod.GET)
    public List<Libro> buscarLibros (@RequestParam String titulo, @RequestParam String edicion) {
        return libroDomain.buscarLibros(titulo, edicion);
        @ResponseBody
        public List<Libro> buscarLibros
        (@RequestParam String titulo, @RequestParam String edicion){
            return libroDomain.buscarLibros(titulo, edicion);
        }
    }
}