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
        // Setters Y Getters 
        public int getIdConductor() {
            return idConductor;
        }
        public void setIdConductor(int id) {
            this.idConductor=id;
        }
        public int getcedula() {
            return Cedula;
        }
        public void setCedula(int numero) {
            this.Cedula=numero;
        }
        public String getNombre() {
            return Nombre;
        }
        public void setNombre(String nombre) {
            this.Nombre=nombre;
        }
        public int getCodigoLicencia() {
            return codigoLicencia;
        }
        public void setCodigoLicencia(int codigo) {
            this.codigoLicencia=codigo;
        }
        public String getTipoLicencia() {
            return tipoLicencia;
        }
        public void setTipoLicencia(String tipo) {
            this.tipoLicencia=tipo;
        }
        public int getPuntaje() {
            return Puntaje;
        }
        public void setPuntaje(int puntaje) {
            this.Puntaje=puntaje;
        }
    }
