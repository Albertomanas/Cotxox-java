package edu.elsmancs.Cotxox.domain;


import org.junit.Before;
import org.junit.Test;
import static  org.junit.Assert.*;

import edu.elsmancs.Cotxox.domain.*;
public class ConductorTest {


    @Test
    public void setDatosConductor() {
        Conductor conductor = new Conductor();
        String nombre = "Samantha";
        String modelo = "Chevy Malibu";
        String matricula = "4ABC123";
        conductor.setNombre(nombre);
        conductor.setMatricula(matricula);
        conductor.setModelo(modelo);
        assertEquals(nombre, conductor.getNombre());
        assertEquals(matricula, conductor.getMatricula());
        assertEquals(modelo, conductor.getModelo());
    }

    @Test
    public void comprobarValoracionMedia() { //MIRAR EN PROFUNDIDAD!!!!!
        String nombre = "Samantha";
        Conductor conductor = new Conductor(nombre);
        conductor.setValoracion((byte) 5);  //Valoración 5 estrellas
        assertEquals(1, conductor.getCantidadValoracion(), 0);
        assertEquals(5, conductor.getValoracion(), 0.1);

        int numeroValoraciones = 0;
        for (int valoracion = 0; valoracion <= 5; valoracion++) {
            /*Delimitar valoraciones entre 0 y menor o igual a 5
            * Concatenación valoraciones
             */
            conductor.setValoracion((byte) valoracion);
            numeroValoraciones++;  //Añadimos la valoración en variable numeroValoraciones
        }

        assertEquals(numeroValoraciones + 1, conductor.getCantidadValoracion(), 0);
        /* Comprobar la cantidad de valoraciones que ha recibido el conductor X
         * y por otro lado obtener la valoración media del conductor X
         */
        assertEquals(2.875, conductor.getValoracion(), 0.1);
    }


}
