package edu.elsmancs.Cotxox.domain;

import org.junit.Test;
import static  org.junit.Assert.*;
public class CarreraTest {

    @Test
    public void comprobarTarjetacreditoTest() {
        Carrera carrera = new Carrera("4325625382738289");
        assertEquals(carrera.getTarjetaCredito(),"4325625382738289");
    }
}
