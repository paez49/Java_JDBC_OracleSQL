package org.example.Integration;

import org.example.Controller.Constantes;
import org.example.Model.Entidades.Conductor;
import org.example.Model.Entidades.Vehiculo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

public class QuerysSITP2 {
    // Conexión a Oracle database
    // private static final String URL =
    // "jdbc:oracle:thin:@orion.javeriana.edu.co:1521/LAB";
    // private static final String USERNAME = "user"
    // private static final String PASSWORD = "pass";

    private Connection connection; // manages connection
    private PreparedStatement selectAllConductor;
    private PreparedStatement selectAllVehiculo;
    private PreparedStatement selectVehiculoPlaca;
    private PreparedStatement selectConductorCedula;
    private PreparedStatement insertNewConductor;
    private PreparedStatement insertNewVehiculo;
    private PreparedStatement updateConductor;
    private PreparedStatement updateVehiculo;
    private PreparedStatement deleteConductor;
    private PreparedStatement deleteVehiculo;

    // constructor
    public QuerysSITP2() {
        try {
            connection = DriverManager.getConnection( Constantes.THINCONN,
                    Constantes.USERNAME,
                    Constantes.PASSWORD);

            // Selecciona todos los conductores
            selectAllConductor = connection.prepareStatement(
                    "SELECT * FROM Conductor "
                            + "ORDER BY IdConductor, Nombre");

            // Selecciona todos los vehiculos
            selectAllVehiculo = connection.prepareStatement(
                    "SELECT * FROM Vehiculo "
                            + "ORDER BY IdVehiculo, Placa");

            // Selecciona vehiculos por placa
            selectVehiculoPlaca = connection.prepareStatement(
                    "SELECT * FROM Vehiculo WHERE Placa LIKE ? " +
                            "ORDER BY IdVehiculo, Placa");

            // Selecciona conductores por cedula
            selectConductorCedula = connection.prepareStatement(
                    "SELECT * FROM Conductor WHERE Cedula = ? " +
                            "ORDER BY IdConductor, Nombre");

            // insertar nuevo conductor
            insertNewConductor = connection.prepareStatement(
                    "INSERT INTO Conductor " +
                            "(IdConductor,Cedula ,Nombre,codigoLicencia,tipoLicencia,puntaje) " +
                            "VALUES (?, ?, ?, ?, ?, ?)");

            // insertar nuevo vehiculo
            insertNewVehiculo = connection.prepareStatement(
                    "INSERT INTO Vehiculo " +
                            "(IdVehiculo,IdConductor ,Placa,Tipo,codigoSoat) " +
                            "VALUES (?, ?, ?, ?, ?)");

            // actualizar conductor
            updateConductor = connection.prepareStatement(
                    "UPDATE Conductor " +
                            "SET Cedula = ?, Nombre = ?, codigoLicencia = ? , tipoLicencia = ?, puntaje = ? "
                            +
                            "WHERE IdConductor = ?");

            // actualizar vehiculo
            updateVehiculo = connection.prepareStatement(
                    "UPDATE Vehiculo " +
                            "SET IdConductor = ?, Placa = ?, Tipo = ? , codigoSoat = ? " +
                            "WHERE IdVehiculo = ?");

            // eliminar conductor
            deleteConductor = connection.prepareStatement(
                    "DELETE FROM Conductor WHERE IdConductor = ?");

            // eliminar vehiculo
            deleteVehiculo = connection.prepareStatement(
                    "DELETE FROM Vehiculo WHERE IdVehiculo = ?");

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            System.exit(1);
        }
    }

    // selecciona todos los conductores
    public List<Conductor> getAllConductor() {
        // executeQuery returns ResultSet containing matching entries
        try (ResultSet resultSet = selectAllConductor.executeQuery()) {
            List<Conductor> results = new ArrayList<Conductor>();

            while (resultSet.next()) {
                results.add(new Conductor(
                        resultSet.getInt("IdConductor"),
                        resultSet.getInt("Cedula"),
                        resultSet.getString("Nombre"),
                        resultSet.getInt("codigoLicencia"),
                        resultSet.getString("tipoLicencia"),
                        resultSet.getInt("puntaje")));
            }

            return results;
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

        return null;
    }

    // selecciona todos los vehiculos
    public List<Vehiculo> getAllVehiculo() {
        // executeQuery returns ResultSet containing matching entries
        try (ResultSet resultSet = selectAllVehiculo.executeQuery()) {
            List<Vehiculo> results = new ArrayList<Vehiculo>();

            while (resultSet.next()) {
                results.add(new Vehiculo(
                        resultSet.getInt("IdVehiculo"),
                        resultSet.getInt("IdConductor"),
                        resultSet.getString("Placa"),
                        resultSet.getBoolean("Tipo"),
                        resultSet.getInt("codigoSoat")));
            }

            return results;
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

        return null;
    }

    // selecciona Conductor por cedula
    public List<Conductor> getConductorCedula(int Cedula) {

        try {
            selectConductorCedula.setInt(1, Cedula); // set Cedula
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            return null;
        }
        // executeQuery returns ResultSet containing matching entries
        try (ResultSet resultSet = selectConductorCedula.executeQuery()) {
            List<Conductor> results = new ArrayList<Conductor>();
            while (resultSet.next()) {
                results.add(new Conductor(
                        resultSet.getInt("IdConductor"),
                        resultSet.getInt("Cedula"),
                        resultSet.getString("Nombre"),
                        resultSet.getInt("codigoLicencia"),
                        resultSet.getString("tipoLicencia"),
                        resultSet.getInt("puntaje")));

            }
            System.out.println(results.get(0).getCedula());
            return results;
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            return null;
        }
    }

    // selecciona vehiculo por placa
    public List<Vehiculo> getVehiculoPlaca(String Placa) {
        try {
            selectVehiculoPlaca.setString(3, Placa); // set Placa
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            return null;
        }

        // executeQuery returns ResultSet containing matching entries
        try (ResultSet resultSet = selectVehiculoPlaca.executeQuery()) {
            List<Vehiculo> results = new ArrayList<Vehiculo>();

            while (resultSet.next()) {
                results.add(new Vehiculo(
                        resultSet.getInt("IdVehiculo"),
                        resultSet.getInt("IdConductor"),
                        resultSet.getString("Placa"),
                        resultSet.getBoolean("Tipo"),
                        resultSet.getInt("codigoSoat")));
            }

            return results;
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            return null;
        }
    }

    // Crear Conductor
    public int InsertarConductor(int IdConductor, int Cedula, String Nombre, int codigoLicencia, String tipoLicencia,
                                 int puntaje) {

        // insert the new entry; returns # of rows updated
        try {
            // set parameters
            insertNewConductor.setInt(1, IdConductor);
            insertNewConductor.setInt(2, Cedula);
            insertNewConductor.setString(3, Nombre);
            insertNewConductor.setInt(4, codigoLicencia);
            insertNewConductor.setString(5, tipoLicencia);
            insertNewConductor.setInt(6, puntaje);

            return insertNewConductor.executeUpdate();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            return 0;
        }
    }

    // Crear Vehiculo
    public int InsertarVehiculo(int IdVehiculo, int IdConductor, String Placa, boolean Tipo, int codigoSoat) {

        // insert the new entry; returns # of rows updated
        try {
            // set parameters
            insertNewVehiculo.setInt(1, IdVehiculo);
            insertNewVehiculo.setInt(2, IdConductor);
            insertNewVehiculo.setString(3, Placa);
            insertNewVehiculo.setBoolean(4, Tipo);
            insertNewVehiculo.setInt(5, codigoSoat);

            return insertNewVehiculo.executeUpdate();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            return 0;
        }
    }

    // Modificar Conductor
    public int ModificarConductor(int IdConductor, int Cedula, String Nombre, int codigoLicencia, String tipoLicencia,
                                  int puntaje) {
        try {
            
            updateConductor.setInt(1, Cedula);
            updateConductor.setString(2, Nombre);
            updateConductor.setInt(3, codigoLicencia);
            updateConductor.setString(4, tipoLicencia);
            updateConductor.setInt(5, puntaje);
            updateConductor.setInt(6, IdConductor);


            return updateConductor.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    // Modificar Vehiculo
    public int ModificarVehiculo(int IdVehiculo, int IdConductor, String Placa, boolean Tipo, int codigoSoat) {
        try {
            updateVehiculo.setInt(1, IdConductor);
            updateVehiculo.setString(2, Placa);
            updateVehiculo.setBoolean(3, Tipo);
            updateVehiculo.setInt(4, codigoSoat);
            updateVehiculo.setInt(5, IdVehiculo);

            return updateVehiculo.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int deleteConductor(int IdConductor) {
        try {
            deleteConductor.setInt(1, IdConductor);

            return deleteConductor.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int deleteVehiculo(int IdVehiculo) {
        try {
            deleteVehiculo.setInt(1, IdVehiculo);

            return deleteVehiculo.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    // close the database connection
    public void close() {
        try {
            connection.close();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}
