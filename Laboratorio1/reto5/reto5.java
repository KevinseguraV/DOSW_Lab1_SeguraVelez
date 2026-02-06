package Laboratorio1.reto5;
import java.util.*;
import java.util.stream.Collectors;

public class reto5 {

    public static Set<Integer> cargarDesdeHashSet() {
        Set<Integer> hashSet = new HashSet<>(
                Arrays.asList(4, 9, 15, 7, 18, 21, 10, 5)
        );

        return hashSet.stream()
                .filter(n -> n % 3 != 0)
                .collect(Collectors.toSet());
    }

    public static Set<Integer> cargarDesdeTreeSet() {
        Set<Integer> treeSet = new TreeSet<>(
                Arrays.asList(12, 3, 25, 10, 7, 30, 18, 4)
        );

        return treeSet.stream()
                .filter(n -> n % 5 != 0)
                .collect(Collectors.toSet());
    }

    public static Set<Integer> unirConjuntos(Set<Integer> a, Set<Integer> b) {
        Set<Integer> resultado = new TreeSet<>();
        resultado.addAll(a);
        resultado.addAll(b);
        return resultado;
    }

    public static void main(String[] args) {

        Set<Integer> equipoA = cargarDesdeHashSet();
        Set<Integer> equipoB = cargarDesdeTreeSet();

        Set<Integer> arena = unirConjuntos(equipoA, equipoB);

        arena.forEach(n ->
                System.out.println("Número en arena: " + n)
        );
    }
}
