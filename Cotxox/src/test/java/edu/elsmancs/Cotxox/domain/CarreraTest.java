package edu.elsmancs.Cotxox.domain;

import org.junit.Test;
import static  org.junit.Assert.*;

import edu.elsmancs.Cotxox.domain.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CarreraTest {

    @Test
    public void comprobarTarjetacreditoTest() {
        Carrera carrera = new Carrera("4325625382738289");
        assertEquals(carrera.getTarjetaCredito(),"4325625382738289");
    }

    @Test
    public void setOrigenTest() {
        Carrera carrera = new Carrera();
        String origen = "Aeropuerto Son Sant Joan";
        carrera.setOrigen(origen);
        assertEquals(origen, carrera.getOrigen());
    }

    @Test
    public void setDestinoTest() {
        Carrera carrera = new Carrera();
        String destino = "Magaluf";
        carrera.setDestino(destino);
        assertEquals(destino, carrera.getDestino());
    }

    @Test
    public void setDistanciaTest() {
        Carrera carrera = new Carrera();
        double distancia = 7.75;
        double delta = 0.0001; // Se crea un delta por el margen de erorr.
        carrera.setDistancia(distancia);
        assertEquals(distancia, carrera.getDistancia(), delta);
    }

    @Test
    public void setTiempoEsperadoTest() {
        Carrera carrera = new Carrera();
        int tiempoEsperado = 4;
        carrera.setTiempoEsperado(tiempoEsperado);
        assertEquals(tiempoEsperado, carrera.getTiempoEsperado());
    }

    @Test
    public void setConductorTest() {
        String nombre = "Samantha";
        /* Cremos nombre para pasarle dicho argumento a Carrera
         */
        Carrera carrera = new Carrera();
        Conductor conductor = new Conductor(nombre);
        carrera.setConductor(conductor);
        assertEquals(nombre, carrera.getConductor().getNombre());
        /* Creamos un nuevo Conductor y le pasamos el parámetro de nombre
        *  A continuación, comprobamos que el nombre que recibe getConductor.getNombre
        *   es igual al declarado en este caso test
         */
    }

    @Test
    public void setTiempoCarreraTest() {
        Carrera carrera = new Carrera();
        int tiempoCarrera = 5;
        double delta = 0;
        carrera.setTiempoCarrera(tiempoCarrera);
        assertEquals(tiempoCarrera, carrera.getTiempoCarrera(), delta);
    }

    @Test
    public void setPropinaTest() {
        Carrera carrera = new Carrera();
        int propina = 5;
        double delta = 0;
        carrera.setPropina(propina);
        assertEquals(propina, carrera.getPropina(), delta);
    }

    @Test
    public void asignarConductorTest() {
        Carrera carrera = new Carrera();
        carrera.setConductor(null);
        String nombre = "Samantha";
        Conductor conductor = new Conductor(nombre);
        ArrayList<Conductor> poolConductores = new ArrayList<>();
        poolConductores.add(conductor);
        PoolConductores conductores = new PoolConductores(poolConductores);
        carrera.asignarConductor(conductores);
        assertNotNull(carrera.getConductor());

    }
}
