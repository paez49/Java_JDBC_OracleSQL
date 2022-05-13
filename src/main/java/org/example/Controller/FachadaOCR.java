package org.example.Controller;

import org.example.Integration.QuerysSITP2;
import org.example.Model.Libro;

import java.util.List;

public class FachadaOCR {

    public List<Libro> ConsultarLibrosPorAutor(String p_author, int p_rating) {
        QuerysSITP2 repo = new QuerysSITP2();
        return repo.ConsultarLibrosPorAutor(p_author, p_rating);
    }


    public List<Libro> ConsultarLibros() {
        QuerysSITP2 repo = new QuerysSITP2();
        return repo.ConsultarLibros();
    }
}