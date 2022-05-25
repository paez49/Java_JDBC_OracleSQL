package org.example.View;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import org.example.Controller.FachadaOCR;
import org.example.Model.Entidades.Conductor;

import java.io.IOException;
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
    private TextField txtCedula;

    @FXML
    private Button btnQueryConduc;

    @FXML
    private Tab registro_usuario;

    @FXML
    private Button Regresar;

    @FXML
    private Label label_ID;

    @FXML
    private Label label_CC;

    @FXML
    private Label label_codigo_L;

    @FXML
    private Label label_tipo_Li;

    @FXML
    private Button mostrar;

    @FXML
    private Label LabelPuntaje;

    @FXML
    private ListView<?> ListCom;

    @FXML
    private Label Label_nombre;

    @FXML
    private Tab calificar_conductor;

    @FXML
    private CheckBox one;

    @FXML
    private CheckBox two;

    @FXML
    private CheckBox tree;

    @FXML
    private CheckBox four;

    @FXML
    private CheckBox five;

    @FXML
    private Button enviar1;

    @FXML
    private Tab escribir_comentario;

    @FXML
    private TextArea cuadro_comentario;

    @FXML
    private Button enviar2;
    @FXML
    private Label lblID;
    @FXML
    private Label lblCedula;
    @FXML
    private Label lblCodigo;
    @FXML
    private Label lblTipoLicencia;
    @FXML
    private Label lblNombre;
    @FXML
    void fieldCedula(ActionEvent event) {

    }

    @FXML
    void handleButtonAction(ActionEvent event) {

    }

    @FXML
    void handleButtonAction2(ActionEvent event) {

    }

    @FXML
    void handleButtonAction3(ActionEvent event) {

    }

    @FXML
    void handleButtonAction4(ActionEvent event) {

    }

    @FXML
    void consulVehiculoPressed(ActionEvent event) {

    }

    @FXML
    void queryPressed(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("interfazUsuario.fxml"));
            Parent root = loader.load();
            VistaController controlador = loader.getController();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setTitle("Bienvenido");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        }
    @FXML
    void pressedQueryConduc(ActionEvent event) {
    int cedulaBuscar = Integer.parseInt(txtCedula.getText());

    FachadaOCR rl = new FachadaOCR();
       // List<Conductor> conductorList = rl.ConsultarConductores();
       List<Conductor> conductorList = rl.consultarConductorXCedula(cedulaBuscar);
       lblID.setText("ID: "+conductorList.get(0).getIdConductor());
       lblCedula.setText("Cedula: "+conductorList.get(0).getCedula());
       lblCodigo.setText("Codigo licencia: "+conductorList.get(0).getCodigoLicencia());
       lblNombre.setText("Nombre: "+conductorList.get(0).getNombre());
       lblTipoLicencia.setText("Tipo licencia: "+conductorList.get(0).getTipoLicencia());
        System.out.println("Conductor" + conductorList.get(0).getNombre());

    }
}
