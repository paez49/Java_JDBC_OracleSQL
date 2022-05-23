package org.example.Controller;

import org.example.Integration.QuerysSITP2;
import org.example.Model.Libro;

import java.util.List;

public class FachadaOCR {
    public List<Condcutor> ConsultarConductores() {
        QuerysSITP2 querysSITP2 = new QuerysSITP2();
        return querysSITP2.getAllConductor();
    }
}