package org.example.Model.Entidades;

public class Bus extends Vehiculo{
    private String tipoBus;

    //Setters y Getters

    String gettipoBus() {
        return tipoBus;
    }
    void settipoBus(String tipo) {
        this.tipoBus=tipo;
    }

    public Bus (String tipoBus, int idVehiculo, int idConductor, String Placa, boolean Tipo, int codigoSoat) {
        // TODO Auto-generated constructor stub
        super(idVehiculo, idConductor, Placa, Tipo, codigoSoat);
        this.tipoBus = tipoBus;
    }
}
