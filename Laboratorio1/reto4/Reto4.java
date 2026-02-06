package Laboratorio1.reto4;

import java.util.*;
import java.util.stream.Collectors;

public class Reto4 {

    public static void main(String[] args) {

        // Lista para HashMap
        List<Map.Entry<String,Integer>> mapaHashMap = List.of(
                Map.entry("oro", 5),
                Map.entry("plata", 3),
                Map.entry("oro", 7),
                Map.entry("diamante", 10)
        );

        // Lista para HashTable
        List<Map.Entry<String,Integer>> mapaHashTable = List.of(
                Map.entry("plata", 8),
                Map.entry("rubí", 4),
                Map.entry("oro", 12),
                Map.entry("esmeralda", 16)
        );

        Map<String,Integer> mapaHM = cargarHashMap(mapaHashMap);
        Map<String,Integer> mapaHT = cargarHashTable(mapaHashTable);

        // Lambda sencilla
        Runnable respuesta = () -> {
            Map<String,Integer> combinado = combinarMapas(mapaHM, mapaHT);
            Map<String,Integer> ordenado = ordenarMapa(combinado);
            imprimirMayusculas(ordenado);
        };

        respuesta.run();
    }

    public static Map<String, Integer> cargarHashMap(List<Map.Entry<String, Integer>> datos) {
        Map<String, Integer> mapa = new HashMap<>();
        for (Map.Entry<String, Integer> entry : datos) {
            mapa.putIfAbsent(entry.getKey(), entry.getValue());
        }
        return mapa;
    }

    public static Map<String, Integer> cargarHashTable(List<Map.Entry<String, Integer>> datos) {
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

    public static void imprimirMayusculas(Map<String, Integer> mapa) {
        mapa.forEach((k, v) ->
                System.out.println("* Clave: " + k.toUpperCase() + " | Valor: " + v)
        );
    }

    public static Map<String, Integer> ordenarMapa(Map<String, Integer> mapa) {
        return mapa.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())   // ascendente por clave
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> a,
                        LinkedHashMap::new
                ));
    }
}

