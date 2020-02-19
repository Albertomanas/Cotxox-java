package edu.elsmancs.Cotxox.domain;

import edu.elsmancs.Cotxox.domain.Carrera;
public class Tarifa {
    final static private double costeMilla = 1.35;  //Porqué final static(?)
    final static private double costeMinuto = 0.35;
    final static private double costeMinimo = 5.0;
    final static byte porcentajeComision = 20;

    public static double getCosteDistancia(double distancia) {  //Distancia de Carrera
        return distancia * costeMilla;
    }

    public static double getCosteTiempo(double minuto) {  //Multiplicar minuto por el coste de este
        return minuto * costeMinuto;
    }

    public static double getCosteTotalEsperado(Carrera carrera){
        /*Coste esperado de la carrera
        * en función de la distancia esperada y el tiempo esperado  (Linea 23)
        * El costeTotal no puede ser inferior al mínimo (costeTotal>costeMinimo)
        */
       double costeTotal = getCosteDistancia(carrera.getDistancia()) + getCosteTiempo(carrera.getTiempoEsperado());
       return costeTotal >= costeMinimo ? costeTotal : costeMinimo;
       //operador coalescente = || w = x ? y : x = Elvis operator
    }
}
