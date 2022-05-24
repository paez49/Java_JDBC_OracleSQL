package org.example.Model.Entidades;

public class Conductor {
    private int idConductor;
    private int Cedula;
    private String Nombre;
    private int codigoLicencia;
    private String tipoLicencia;
    private int Puntaje;
    //Constructor
    public Conductor(){

    }
    public Conductor( int idConductor, int Cedula, String Nombre, int codigoLicencia, String tipoLicencia, int Puntaje) {
        this.Cedula=Cedula;
        this.idConductor=idConductor;
        this.Nombre=Nombre;
        this.codigoLicencia=codigoLicencia;
        this.tipoLicencia=tipoLicencia;
        this.Puntaje=Puntaje;
    }
    public int getIdConductor() {
        return idConductor;
    }
    public void setidConductor(int id) {
        this.idConductor=id;
    }
    public int getcedula() {
        return Cedula;
    }
    public void setcedula(int numero) {
        this.Cedula=numero;
    }
    public String getnombre() {
        return Nombre;
    }
    public void setnombre(String nombre) {
        this.Nombre=nombre;
    }
    public int getcodigoLicencia() {
        return codigoLicencia;
    }
    public void setcodigoLicencia(int codigo) {
        this.codigoLicencia=codigo;
    }
    public String gettipoLicencia() {
        return tipoLicencia;
    }
    public void setTipoLicencia(String tipo) {
        this.tipoLicencia=tipo;
    }
    public int getpuntaje() {
        return Puntaje;
    }
    public void setpuntaje(int puntaje) {
        this.Puntaje=puntaje;
    }
}
