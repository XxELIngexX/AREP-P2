package com.noxvodia.arep.p2.functions;

import java.util.List;

public class Binaria {


    public static int binary(int[] coordenadas, int tupla) {
        int izquierda = 0;
        int derecha = coordenadas.length - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;
            int actual = coordenadas[medio];
            

            if (actual < tupla) {
                izquierda = medio + 1;
            } else if (actual > tupla) {
                derecha = medio - 1;
            } else {
                return medio;
            }
        }
        return -1;
    }
}
