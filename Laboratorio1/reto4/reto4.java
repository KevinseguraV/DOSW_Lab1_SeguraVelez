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

    public static Map<String, Integer> combinarMapas(
        Map<String, Integer> hashMap,
        Map<String, Integer> hashTable) {

    Map<String, Integer> resultado = new HashMap<>(hashMap);
    resultado.putAll(hashTable); // prioriza Hashtable
    return resultado;
}
s
}

