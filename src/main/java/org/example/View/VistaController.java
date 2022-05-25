package org.example.View;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import org.example.Controller.FachadaOCR;

public class VistaController {

    @FXML
    private Tab Tab_vehiculo;

    @FXML
    private Tab Tab_Taxi;

    @FXML
    private TextField txtModeloV;

    @FXML
    private TextField txtTipoCarro;

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
    private TextField txtIDV;

    @FXML
    private TextField txtPlaca;

    @FXML
    private TextField txtCodigo;

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
    private TextField txtIDC;

    @FXML
    private TextField txtCedula;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtCodigoLicencia;

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
    void agregarConductor(ActionEvent event) {
        String auxLicencia ="No licencia";
        FachadaOCR fco = new FachadaOCR();
        if(c1Selected.isSelected()){
            auxLicencia = "C1";
        }else if(c2Selected.isSelected()){
            auxLicencia = "C2";
        }else if(b3Selected.isSelected()){
            auxLicencia = "B3";
        }
        if (txtIDC.getText() == null ){
        System.out.println("ID no puede ser nulo");
    }else{
        fco.añadirConductor(
                Integer.parseInt(txtIDC.getText()),
                Integer.parseInt(txtCedula.getText()),
                txtNombre.getText(),
                Integer.parseInt(txtCodigoLicencia.getText()),
                auxLicencia,
                0
        );
    }
    }
    @FXML
    void consultarCondcutor(ActionEvent event) {

    }

    @FXML
    void eliminarConductor(ActionEvent event) {

    }

    @FXML
    void modificarConductor(ActionEvent event) {

    }

}
