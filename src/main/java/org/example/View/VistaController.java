package org.example.View;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;

public class VistaController {

    @FXML
    private Tab Tab_vehiculo;

    @FXML
    private Tab Tab_Taxi;

    @FXML
    private TextField TaxiModeloVehiculo;

    @FXML
    private TextField TaxiTipoCarroTexField;

    @FXML
    private Tab Tab_Bicitaxi;

    @FXML
    private TextField RinBicicletaTextField;

    @FXML
    private Tab Tab_Bus;

    @FXML
    private RadioButton trasmilenioSelected;

    @FXML
    private RadioButton zonalSelected;

    @FXML
    private RadioButton alimentadorSelected;

    @FXML
    private TextField IDVehiculoTextFiel;

    @FXML
    private TextField PlacaTextField;

    @FXML
    private TextField CodigoSoatTextField;

    @FXML
    private Button ButtomAgregar;

    @FXML
    private Button Buttom_Limpiar;

    @FXML
    private Button Buttom_Modificar;

    @FXML
    private Button Buttom_Eliminar;

    @FXML
    private RadioButton motorizadoSelected;

    @FXML
    private RadioButton noMotorizadoSelected;

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
    private ListView<?> ListViewConductor;

    @FXML
    private RadioButton b3Selected;

    @FXML
    private RadioButton c1Selected;

    @FXML
    private RadioButton c2Selected;

    @FXML
    void AgregarVehiculo(ActionEvent event) {

    }

    @FXML
    void CleanVehiculo(ActionEvent event) {

    }





    @FXML
    void EliminarVehiculo(ActionEvent event) {

    }

    @FXML
    void ModificarVehiculo(ActionEvent event) {

    }

    @FXML
    void queryPressed(ActionEvent event) {
        System.out.println(c1Selected.getText());
    }

}
