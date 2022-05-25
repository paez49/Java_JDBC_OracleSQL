package org.example.Model.Entidades;

public class Taxi extends Vehiculo {
    private int modelo;
    private String tipoCarro;

    //Constructor
    public Taxi(int modelo, String tipoCarro, int idVehiculo, int idConductor, String Placa, boolean Tipo, int codigoSoat) {
        // TODO Auto-generated constructor stub
        super(idVehiculo, idConductor, Placa, Tipo, codigoSoat);
        this.modelo = modelo;
        this.tipoCarro = tipoCarro;
    }

    //Setters y Getters

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getTipoCar() {
        return tipoCarro;
    }

    public void setTipoCar(String tipo) {
        this.tipoCarro = tipo;
    }
}
