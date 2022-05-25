package Entidades;

public class BiciTaxi extends Vehiculo {
    private int rinCicla;

    //Constructor
    public BiciTaxi(int rinCicla, int idVehiculo, int idConductor, String Placa, boolean Tipo, int codigoSoat) {
        // TODO Auto-generated constructor stub
        super(idVehiculo, idConductor, Placa, Tipo, codigoSoat);
        this.rinCicla = rinCicla;
    }

    //Setters y Getters

    int getRin() {
        return rinCicla;
    }

    void setRin(int rin) {
        this.rinCicla = rin;
    }


}
