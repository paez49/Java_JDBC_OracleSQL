package org.example.Model.Entidades;

public class BiciTaxi extends Vehiculo{
    private int rinCicla;

    //Setters y Getters

    int getrin() {
        return rinCicla;
    }
    void setrin(int rin) {
        this.rinCicla=rin;
    }

    //Constructor
    public BiciTaxi (int rinCicla, int idVehiculo, int idConductor, String Placa, boolean Tipo, int codigoSoat) {
        // TODO Auto-generated constructor stub
        super(idVehiculo, idConductor, Placa, Tipo, codigoSoat);
        this.rinCicla = rinCicla;
    }
}
