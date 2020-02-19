package edu.elsmancs.Cotxox.domain;

import org.junit.Test;
import static org.junit.Assert.*;

import edu.elsmancs.Cotxox.domain.Tarifa;


public class TarifaTest {


    @Test
    public void comprobarCosteDistanciaTest() {
        Carrera carrera = new Carrera();
        double costeMilla = 1.35;
        double distancia = 7.75;
        double costeEsperado = costeMilla * distancia; // ditancia * costeMilla
        double delta = 0.01;
        assertEquals(costeEsperado, Tarifa.getCosteDistancia(distancia), delta);
    }

    @Test
    public void comprobarCosteTiempoTest() {
        Carrera carrera = new Carrera();
        double costeMinuto = 0.35;
        int minuto = 10;
        double costeEsperadoMinuto = minuto * costeMinuto;
        double delta = 0.01;
        assertEquals(costeEsperadoMinuto, Tarifa.getCosteTiempo(minuto), delta);
    }

    @Test
    public void comprobarCosteTotalEsperado() {
        Carrera carrera = new Carrera();
        carrera.setDistancia(7.75);
        carrera.setTiempoEsperado(10);
        double costeEsperadoDistancia = 1.35 * 7.75;
        double costeEsperadoMinuto = 0.35 * 10;
        double delta = 0.01;
        double costeTotal = costeEsperadoDistancia + costeEsperadoMinuto;
        assertEquals(costeTotal, Tarifa.getCosteTotalEsperado(carrera), delta);
    }

    @Test
    public void comprobarCosteMinimoTest() {
        Carrera carrera = new Carrera();
        carrera.setTiempoEsperado(2);
        carrera.setDistancia(1.5);
        double delta = 0.01;
        assertEquals(5, Tarifa.getCosteTotalEsperado(carrera), delta);
        // Sí o sí delimita el mínimo a 5 a pesar de que el precio sea menor
    }
}
