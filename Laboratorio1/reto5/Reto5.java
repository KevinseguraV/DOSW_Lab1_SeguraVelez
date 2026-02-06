package Laboratorio1.reto5;

import java.util.*;
import java.util.stream.Collectors;

public class Reto5 {

    // Almacena números en TreeSet y elimina múltiplos de 5
    public static Set<Integer> cargarGuerrerosTreeSet() {

        Set<Integer> guerreros = new TreeSet<>(
                Arrays.asList(12, 3, 25, 10, 7, 30, 18, 4)
        );

        return guerreros.stream()
                
                .filter( n -> n % 5 != 0)
                .collect(Collectors.toSet());
    }

    public static Set<Integer> unirConjuntos(Set<Integer> a, Set<Integer> b) {
        Set<Integer> resultado = new TreeSet<>();
        resultado.addAll(a);
        resultado.addAll(b);
        return resultado;
    }
}
