package org.example.Controller;

import org.example.Integration.QuerysSITP2;
import org.example.Model.Entidades.*;

import java.util.List;

public class FachadaOCR {
    public List<Conductor> ConsultarConductores() {
        QuerysSITP2 querysSITP2 = new QuerysSITP2();
        return querysSITP2.getAllConductor();

    }
    public List<Conductor>  consultarConductorXCedula(int cedula){

        QuerysSITP2 querysSITP2 = new QuerysSITP2();
        return querysSITP2.getConductorCedula(cedula);
    }
    
    public void  añadirConductor(int idConductor, int Cedula, String Nombre, int codigoLicencia, String tipoLicencia, int Puntaje){

        QuerysSITP2 queryInsertCon = new QuerysSITP2();
        queryInsertCon.InsertarConductor(idConductor, Cedula, Nombre, codigoLicencia, tipoLicencia, Puntaje);
        System.out.println("Fue ingresado exitosamente");
    }

    public void modificarConductor(int Cedula, String Nombre, int codigoLicencia, String tipoLicencia, int Puntaje){

        List<Conductor> lista= new List<Conductor>
        QuerysSITP2 queryModifyCon = new QuerysSITP2();
        lista=queryModifyCon.getConductorCedula(Cedula); 
        int idConductor= lista.get(0); 
        
        queryModifyCon.ModificarConductor(idConductor, Cedula, Nombre, codigoLicencia, tipoLicencia, Puntaje);
        System.out.println("Fue modificado exitosamente");
    }
    public void  eliminarConductor(int idConductor){

        QuerysSITP2 queryDeleteCon = new QuerysSITP2();
        queryDeleteCon.deleteConductor(idConductor);
        System.out.println("Fue eliminado exitosamente");
    }
}
