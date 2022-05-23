package org.example.Model.Entidades;

public class Conductor {
    private int idConductor;
    private int Cedula;
    private String Nombre;
    private int codigoLicencia;
    private String tipoLicencia;
    private int Puntaje;

    //Setters y Getters

    int getidConductor() {
        return idConductor;
    }
    void setidConductor(int id) {
        this.idConductor=id;
    }
    int getcedula() {
        return Cedula;
    }
    void setcedula(int numero) {
        this.Cedula=numero;
    }
    String getnombre() {
        return Nombre;
    }
    void setnombre(String nombre) {
        this.Nombre=nombre;
    }
    int getcodigoLicencia() {
        return codigoLicencia;
    }
    void setcodigoLicencia(int codigo) {
        this.codigoLicencia=codigo;
    }
    String gettipoLicencia() {
        return tipoLicencia;
    }
    void settipoLicencia(String tipo) {
        this.tipoLicencia=tipo;
    }
    int getpuntaje() {
        return Puntaje;
    }
    void setpuntaje(int puntaje) {
        this.Puntaje=puntaje;
    }

    //Constructor
    public Conductor( int idConductor, int Cedula, String Nombre, int codigoLicencia, String tipoLicencia, int Puntaje) {
        this.Cedula=Cedula;
        this.idConductor=idConductor;
        this.Nombre=Nombre;
        this.codigoLicencia=codigoLicencia;
        this.tipoLicencia=tipoLicencia;
        this.Puntaje=Puntaje;
    }

}
