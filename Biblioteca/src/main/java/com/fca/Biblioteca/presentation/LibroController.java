package com.fca.Biblioteca.presentation;


import com.fca.Biblioteca.data.Libro;
import com.fca.Biblioteca.domain.LibroDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@Controller
public class LibroController {
    @Autowired
    private LibroDomain libroDomain;

    @RequestMapping(value = "/libros", method = RequestMethod.GET)


        public List<Libro> buscarLibroPorTitulo (@RequestParam String titulo, @RequestParam String edicion) {
            return libroDomain.buscarLibroPorTitulo(titulo, edicion);
    }

}
