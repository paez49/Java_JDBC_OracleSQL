package Entidades;

public class Taxi extends Vehiculo{
    private int modelo;
    private String tipoCarro;

    //Setters y Getters

    int getmodelo() {
        return modelo;
    }
    void setmodelo(int modelo) {
        this.modelo=modelo;
    }
    String gettipocar() {
        return tipoCarro;
    }
    void settipo(String tipo) {
        this.tipoCarro=tipo;
    }
    //Constructor
    public Taxi (int modelo, String tipoCarro, int idVehiculo, int idConductor, String Placa, boolean Tipo, int codigoSoat) {
        // TODO Auto-generated constructor stub
        super(idVehiculo, idConductor, Placa, Tipo, codigoSoat);
        this.modelo = modelo;
        this.tipoCarro = tipoCarro;
    }
}
