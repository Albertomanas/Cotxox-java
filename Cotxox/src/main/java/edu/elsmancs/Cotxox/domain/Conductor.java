package edu.elsmancs.Cotxox.domain;

public class Conductor {

    private String nombre = null;       //Propiedades del ejercicio
    private String modelo = null;
    private String matricula = null;
    private double valoracionMedia = 0.0;
    private byte valoracion = 0;
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

    public String getNombre() {
        return this.nombre;
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


}

