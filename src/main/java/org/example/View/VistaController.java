package org.example.View;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import org.example.Controller.FachadaOCR;
import org.example.Model.Entidades.Conductor;

import java.util.List;

public class VistaController {

    @FXML
    private Tab Tab_vehiculo;

    @FXML
    private Tab Tab_Taxi;

    @FXML
    private Tab Tab_Bicitaxi;

    @FXML
    private Tab Tab_Bus;

    @FXML
    private Button Tab_agre;

    @FXML
    private Button Tab_consul;

    @FXML
    private Button Tab_modif;

    @FXML
    private Button Tab_elimi;

    @FXML
    private Tab Tab_Conductor;

    @FXML
    private Button Buttom_Ingr;

    @FXML
    private Button Buttom_modif;

    @FXML
    private Button Button_elim;

    @FXML
    private Button Button_cons;

    @FXML
    void queryPressed(ActionEvent event) {
        FachadaOCR rl = new FachadaOCR();
        List<Conductor> conductorList = rl.ConsultarConductores();
        for (Conductor conduc : conductorList) {
            System.out.println("Conductor:" + conduc.getnombre());
        }
    }
}