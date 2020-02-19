package edu.elsmancs.Cotxox.domain;

import java.util.ArrayList;
import java.util.Random;

public class PoolConductores {

    // Array de longitud que es variable de conductor.
    private ArrayList<Conductor> poolConductores = new ArrayList<>();

    public PoolConductores(ArrayList<Conductor> poolConductores) {
        this.poolConductores = poolConductores;
        /* Array PoolConductores de Conductores
        *   Permite operar con el objeto Conductores
         */
    }

    public ArrayList<Conductor> getPoolConductores() {
        return this.poolConductores;
    }

    public Conductor asignarConductor() {
        Conductor conductor = new Conductor();
        Random random = new Random();
        boolean asignado = false;
        while (!asignado) {  //Sea distinto del valor inicial false
            int index = random.nextInt(getPoolConductores().size());
            /* clase random añade al siguiente de la
             * longitud de la Array PoolConductores
             */
            conductor = getPoolConductores().get(index); //devuelve array actualizada
            if(!conductor.isOcupado()) { //
                conductor.setOcupado(true); //Conductor con cliente
                asignado = true;
            }
        }
        return conductor;
    }

}
