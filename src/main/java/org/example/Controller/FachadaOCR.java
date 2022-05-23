package org.example.Controller;

import org.example.Integration.QuerysSITP2;
import org.example.Model.Entidades.*;

import java.util.List;

public class FachadaOCR {
    public List<Conductor> ConsultarConductores() {
        QuerysSITP2 querysSITP2 = new QuerysSITP2();
        return querysSITP2.getAllConductor();
    }
}