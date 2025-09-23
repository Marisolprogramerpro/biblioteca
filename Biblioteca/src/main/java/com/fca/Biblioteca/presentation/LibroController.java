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
    private LibroDomain libroDomain;   //inyeccion de dependencias
    LibroController(LibroDomain libroDomain) {
        this.libroDomain = libroDomain;
    }

    @RequestMapping(value = "/libros-disponibles", method = RequestMethod.GET)
    @ResponseBody
    public List<Libro> buscarLibroPorTitulo
            (@RequestParam String titulo, @RequestParam String edicion) {
        return libroDomain.buscarLibrosDisponibles(titulo,edicion);
    }


    @RequestMapping(value = "/libros", method = RequestMethod.GET)
    @ResponseBody
    public List<Libro> buscarLibro
            (@RequestParam String titulo, @RequestParam String edicion) {
        return libroDomain.buscarLibros(titulo,edicion);
    }
}