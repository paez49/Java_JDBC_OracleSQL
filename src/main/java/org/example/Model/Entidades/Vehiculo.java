package org.example.Model.Entidades;

public class Vehiculo {
    protected int idVehiculo;
    protected int idConductor;
    protected String Placa;
    protected boolean Tipo;
    protected int codigoSoat;

    //Constructor
    public Vehiculo(int idVehiculo, int idConductor, String Placa, boolean Tipo, int codigoSoat) {
        this.idVehiculo=idVehiculo;
        this.idConductor=idConductor;
        this.Placa=Placa;
        this.Tipo=Tipo;
        this.codigoSoat=codigoSoat;
    }

    //Setters y Getters

    public int getIdVehiculo() {
        return idVehiculo;
    }
    public void setIdVehiculo (int id) {
        this.idVehiculo=id;
    }

    public int getIdConductor() {
        return idConductor;
    }
    public void setIdConductor (int id) {
        this.idConductor=id;
    }

    public String getPlaca() {
        return Placa;
    }
    public void setPlaca (String placa) {
        this.Placa=placa;
    }

    public boolean getTipo() {
        return Tipo;
    }
    public void setTipo (boolean tipo) {
        this.Tipo=tipo;
    }

    public int getCodigoSoat() {
        return codigoSoat;
    }
    public void setCodigoSoat (int codigo) {
        this.codigoSoat=codigo;
    }

    public void borrarVehiculo(int idVehiculo){
        try {
                 deleteVehiculo = connection.prepareStatement(
                    "DELETE FROM Vehiculo WHERE IdVehiculo =?");
                 deleteVehiculo(idVehiculo);
                 
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            System.exit(1);
        }

        String consulta= "delete from empleado where cedula = ?";
        preparedStatement = conexion.prepareStatement(consulta);
        preparedStatement .setInt(1, cedula);
        preparedStatement .executeUpdate();


    }
}
