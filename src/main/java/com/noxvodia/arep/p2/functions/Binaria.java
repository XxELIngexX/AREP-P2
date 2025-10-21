package com.noxvodia.arep.p2.functions;

import java.util.List;

public class Binaria {


    public static int binary(List<int[]> coordenadas, int[] tupla) {
        int izquierda = 0;
        int derecha = coordenadas.size() - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;
            int[] actual = coordenadas.get(medio);

            if (actual[0] < tupla[0]) {
                izquierda = medio + 1;
            } else if (actual[0] > tupla[0]) {
                derecha = medio - 1;
            } else {
                if (actual[1] == tupla[1]) {
                    return medio; 
                } else if (actual[1] < tupla[1]) {
                    izquierda = medio + 1;
                } else {
                    derecha = medio - 1;
                }
            }
        }
        return -1;
    }
}
