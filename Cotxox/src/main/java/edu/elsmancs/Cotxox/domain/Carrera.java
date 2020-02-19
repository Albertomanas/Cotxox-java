package edu.elsmancs.Cotxox.domain;

import edu.elsmancs.Cotxox.domain.*;

public class Carrera {

    private int tiempoEsperado = 0;
    private int tiempoCarrera = 0;
    private double costeTotal = 0; // double --> tipo de dato de 64bits
    private Conductor conductor = null;

    private String tarjetaCredito = null;
    private String origen = null;
    private String destino = null;
    private double distancia = 0;
    private int propina = 0;


    public Carrera(String tarjetaCredito) {  //Método constructor
        this.tarjetaCredito = tarjetaCredito;
    }

    public Carrera() {

    }

    public String getTarjetaCredito() {
        return this.tarjetaCredito;
    }

    public String getOrigen() {
        return this.origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return this.destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getDistancia() {
        return this.distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public int getTiempoCarrera() {
        return this.tiempoCarrera;
    }

    public void setTiempoCarrera(int tiempoCarrera){
        this.tiempoCarrera = tiempoCarrera;
    }

    public double getCosteTotal() {
        return this.costeTotal;
    }

    public int getTiempoEsperado() {
        return this.tiempoEsperado;
    }

    public void setTiempoEsperado(int tiempoEsperado) {
        this.tiempoEsperado = tiempoEsperado;
    }

    public Conductor getConductor() {
        return this.conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

  /*  public Boolean comprobarTarjetaCredito() {
        if (tarjetaCredito.length() != 12)
            return false;
        }
   */

  //Métodos para operar según lo pedido por el enunciado:

    public double getCosteEsperado() {  //GETTER dependiente de los métodos de tarifa
        return Tarifa.getCosteTotalEsperado(this);   //Hace referencia a la carrera procesada
    }

    public void asignarConductor(PoolConductores conductores) {
        setConductor(conductores.asignarConductor());
    }


   public int getPropina() {
       return this.propina = propina;
   }

   public void setPropina(int propina) {
       this.propina = propina;
   }

   public void realizarPago(double pagoCliente) {
        this.costeTotal = pagoCliente;
   }

   public void recibirPropina(int propinaCliente) {
        this.propina = propinaCliente;
   }

   public void liberarConductor() {
        getConductor().setOcupado(false);
        /* Liberar conductor, pasamos parámetro false para indicar que
        * dicho conductor está libre
         */
   }

}

