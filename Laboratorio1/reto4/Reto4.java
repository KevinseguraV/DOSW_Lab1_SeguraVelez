package Laboratorio1.reto4;

import java.util.*;
import java.util.stream.Collectors;

public class Reto4 {
    public static void main(String[] args) {

    }

    public static Map<String, Integer> cargarMapaHash(List<Map.Entry<String, Integer>> datos) {
        Map<String, Integer> mapa = new HashMap<>();
        for (Map.Entry<String, Integer> entry : datos) {
            mapa.putIfAbsent(entry.getKey(), entry.getValue());
        }
        return mapa;
    }

    public static Map<String, Integer> cargarMapaTable(List<Map.Entry<String, Integer>> datos) {
        Map<String, Integer> tabla = new Hashtable<>();
        for (Map.Entry<String, Integer> entry : datos) {
            tabla.putIfAbsent(entry.getKey(), entry.getValue());
        }
        return tabla;
    }

    public static Map<String, Integer> combinarMapas(
        Map<String, Integer> hashMap,
        Map<String, Integer> hashTable) {

        Map<String, Integer> resultado = new HashMap<>(hashMap);
        resultado.putAll(hashTable); // prioriza Hashtable
        return resultado;
    }

    public static Map<String, Integer> ordenarMapa(Map<String, Integer> mapa) {
        return mapa.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue()) // orden ascendente por valor
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> a,
                        LinkedHashMap::new
                ));
    }

}

