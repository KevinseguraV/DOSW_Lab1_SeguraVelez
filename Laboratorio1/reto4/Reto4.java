package Laboratorio1.reto4;

import java.util.*;
import java.util.stream.Collectors;

public class Reto4 {

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

 public static void imprimirMayusculas(Map<String, Integer> mapa) {
        mapa.forEach((k, v) ->
                System.out.println("Clave: " + k.toUpperCase() + " | Valor: " + v)
        );
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

