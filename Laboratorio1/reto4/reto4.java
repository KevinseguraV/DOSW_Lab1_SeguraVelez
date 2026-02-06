package Laboratorio1.reto4;

import java.util.*;

public class reto4 {

    public static Map<String, Integer> cargarMapa(List<Map.Entry<String, Integer>> datos) {
        Map<String, Integer> mapa = new HashMap<>();
        for (Map.Entry<String, Integer> entry : datos) {
            mapa.putIfAbsent(entry.getKey(), entry.getValue());
        }
        return mapa;
    }
}

