package edu.elsmancs.Cotxox.domain;

import java.util.ArrayList;

public class PoolConductores {

    // Array de longitud que es variable de conductor.
    private ArrayList<Conductor> poolConductores = new ArrayList<>();

    public PoolConductores(ArrayList<Conductor> poolConductores) {
        this.poolConductores = poolConductores;
        // Constructor recibe un array de longitud <Conductor>
    }


}
