package org.example.View;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import org.example.Controller.FachadaOCR;
import org.example.Model.Libro;

import java.sql.SQLException;
import java.util.List;


public class VistaController {
    @FXML
    private Button botonpro;

    @FXML
    void botonOprimidol(ActionEvent event) throws SQLException {
        FachadaOCR rl = new FachadaOCR();
        List<Libro> libros = rl.ConsultarLibros();
        for (Libro lib : libros) {
            System.out.println("libro:" + lib.toString());
        }
        libros = rl.ConsultarLibrosPorAutor("e", 1);
        for (Libro lib : libros) {
            System.out.println("libro:" + lib.toString());
        }
    }

}
