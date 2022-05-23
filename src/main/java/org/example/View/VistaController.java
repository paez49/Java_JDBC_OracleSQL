package org.example.View;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import org.example.Controller.FachadaOCR;
import org.example.Model.Entidades.Conductor;

import java.sql.SQLException;
import java.util.List;


public class VistaController {
    @FXML
    private Button botonpro;

    @FXML
    void botonOprimidol(ActionEvent event) throws SQLException {
        FachadaOCR rl = new FachadaOCR();
        List<Conductor> conductorList = rl.ConsultarConductores();
        for (Conductor conduc : conductorList) {
            System.out.println("Conductor:" + conduc.toString());
        }
    }

}
