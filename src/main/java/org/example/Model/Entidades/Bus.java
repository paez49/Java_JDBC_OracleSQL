package org.example.Model.Entidades;

public class Bus extends Vehiculo{
    private String tipoBus;

    //Constructor
    public Bus (String tipoBus, int idVehiculo, int idConductor, String Placa, boolean Tipo, int codigoSoat) {
        // TODO Auto-generated constructor stub
        super(idVehiculo, idConductor, Placa, Tipo, codigoSoat);
        this.tipoBus = tipoBus;
    }
    //Setters y Getters

        public String getTipoBus() {
            return tipoBus;
        }
        public void setTipoBus(String tipo) {
            this.tipoBus=tipo;
        }
}
