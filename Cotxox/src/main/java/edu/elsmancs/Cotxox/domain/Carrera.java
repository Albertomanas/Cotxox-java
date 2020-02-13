package edu.elsmancs.Cotxox.domain;

public class Carrera {

    private int tiempoEsperado = 0;
    private int tiempoCarrera = 0;
    private double costeTotal = 0; // double --> tipo de dato de 64bits
    private Conductor[] conductor = null;

    private String tarjetaCredito = null;
    private String origen = null;
    private String destino = null;
    private double distancia = 0;


    public Carrera(String tarjetaCredito) {  //Método constructor
        this.tarjetaCredito = tarjetaCredito;
    }

    public String getTarjetaCredito() {
        return this.tarjetaCredito;
    }

    public String getOrigen() {
        return this.origen;
    }

    public String getDestino() {
        return this.destino;
    }

    public double getDistancia() {
        return this.distancia;
    }

  /*  public Boolean comprobarTarjetaCredito() {
        if (tarjetaCredito.length() != 12)
            return false;
        }
   */
}

