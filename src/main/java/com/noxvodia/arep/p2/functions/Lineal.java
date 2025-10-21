package com.noxvodia.arep.p2.functions;

import java.util.ArrayList;
import java.util.List;

public class Lineal {

    public static int found(int[] coordenadas, int busqueda) {
        for (int i = 0; i<coordenadas.length; i++){
            if (coordenadas[i] == busqueda) {
                return i;
            }
        }    
        return -1;
    }
}