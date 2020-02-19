package edu.elsmancs.Cotxox.domain;

import java.util.ArrayList;

public class Conductor {

    private String nombre = null;       //Propiedades del ejercicio
    private String modelo = null;
    private String matricula = null;
    private double valoracionMedia = 0.0;
    private ArrayList<Byte> valoracion = new ArrayList<>();  //Array valoracion
    private Boolean ocupado = false;


    /*Finalidad de crear funcionabilidad de:
    * Añadir una nueva valoración
    * Actualizar la valoración media del conductor
    * abtracción: sacar datos del conductor
    *           nombre, modelocoche, matricula, valoracion(número, añadirValoracion)
     */

    public Conductor(String nombre) {  //Método constructor
        this.nombre = nombre;
    }

    public Conductor() {}

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    //VALORACIÓN
    /* 1.Añadir nueva valoración.
    *  2.Contabilizar valoraciones con la Array.
    *  3.Calcular valoracion media del conductor.
    *  4.Actualizar media del conductor.
     */


    public Double getValoracion() { //1
        return this.valoracionMedia;
    }

    public int getCantidadValoracion() {  //Ponemos int porque esperamos un enter (.size())
        return this.valoracion.size(); // 2
    }

    public double getValoracionMedia() {
        int contadorValoraciones = 0;
        for (byte valoracion : this.valoracion) { //3
            contadorValoraciones += valoracion;
        }
        this.valoracionMedia = (double) contadorValoraciones / this.valoracion.size();
        /*Calcular media, cantidad de valoraciones/ numero de
        * elementos de Array valoraicion.
        */
        return this.valoracionMedia;
    }

    public void setValoracion(byte valoracion) { //byte por el formato del main(Linea 73)
        this.valoracion.add(valoracion); //Añadimos en Array
        this.getValoracionMedia(); //4
    }

    //OCUPADO/LIBRE

    public Boolean isOcupado() {   //DEnominado is porque es Booleano
        return this.ocupado;
    }

    public void setOcupado(Boolean ocupado) {
        this.ocupado = ocupado;
    }
}

