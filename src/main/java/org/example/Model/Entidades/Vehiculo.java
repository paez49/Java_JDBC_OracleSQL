package Entidades;

public class Vehiculo {
    protected int idVehiculo;
    protected int idConductor;
    protected String Placa;
    protected boolean Tipo;
    protected int codigoSoat;

    //Setters y Getters

    int getidVehiculo() {
        return idVehiculo;
    }
    void setidVehiculo (int id) {
        this.idVehiculo=id;
    }
    int getidConductor() {
        return idConductor;
    }
    void setidConductor (int id) {
        this.idConductor=id;
    }
    String getPlaca() {
        return Placa;
    }
    void setPlaca (String placa) {
        this.Placa=placa;
    }
    boolean gettipo() {
        return Tipo;
    }
    void settipo (boolean tipo) {
        this.Tipo=tipo;
    }
    int getcodigoSoat() {
        return codigoSoat;
    }
    void setcodigoSoat (int codigo) {
        this.codigoSoat=codigo;
    }

    //Constructor
    public Vehiculo(int idVehiculo, int idConductor, String Placa, boolean Tipo, int codigoSoat) {
        this.idVehiculo=idVehiculo;
        this.idConductor=idConductor;
        this.Placa=Placa;
        this.Tipo=Tipo;
        this.codigoSoat=codigoSoat;
    }



}