package Laboratorio1.reto5;

import java.util.*;
import java.util.stream.Collectors;

public class reto5 {

    public static Set<Integer> cargarGuerreros() {

        Set<Integer> guerreros = new HashSet<>(
                Arrays.asList(4, 9, 15, 7, 18, 21, 10, 5)
        );

        return guerreros.stream()
                .filter(n -> n % 3 != 0)
                .collect(Collectors.toSet());
    }

  
    public static Set<Integer> unirConjuntos(Set<Integer> a, Set<Integer> b) {
        Set<Integer> resultado = new TreeSet<>();
        resultado.addAll(a);
        resultado.addAll(b);
        return resultado;
    }
}

