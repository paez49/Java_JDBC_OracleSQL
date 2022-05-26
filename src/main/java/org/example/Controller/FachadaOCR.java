package org.example.Controller;

import org.example.Integration.QuerysSITP2;
import org.example.Model.Entidades.*;

import java.util.List;

public class FachadaOCR {
    QuerysSITP2 querysSITP2 = new QuerysSITP2();

    public List<Conductor> ConsultarConductores() {

        return querysSITP2.getAllConductor();

    }

    public List<Conductor> consultarConductorXCedula(int cedula) {
        return querysSITP2.getConductorCedula(cedula);
    }

    public void añadirConductor(int idConductor, int Cedula, String Nombre, int codigoLicencia, String tipoLicencia, int Puntaje) {
        querysSITP2.InsertarConductor(idConductor, Cedula, Nombre, codigoLicencia, tipoLicencia, Puntaje);
        System.out.println("Fue ingresado exitosamente");
    }

    public void modificarConductor(int idConductor, int Cedula, String Nombre, int codigoLicencia, String tipoLicencia, int Puntaje) {
        querysSITP2.ModificarConductor(idConductor, Cedula, Nombre, codigoLicencia, tipoLicencia, Puntaje);
        System.out.println("Fue modificado exitosamente");
    }

    public void eliminarConductor(int idConductor) {


        querysSITP2.deleteConductor(idConductor);
        System.out.println("Fue eliminado exitosamente");
    }

    public String consultaView() {
        System.out.println(querysSITP2.getView());
        return querysSITP2.getView();
    }
    public void insertarVehiculo(int idV, int idC, String text, String tipo, int codigoSoat){
    querysSITP2.insertVehiculo(idV, idC, text,tipo,codigoSoat);
        System.out.println("Vehiculo ingresado exitosamente");
    }
}
