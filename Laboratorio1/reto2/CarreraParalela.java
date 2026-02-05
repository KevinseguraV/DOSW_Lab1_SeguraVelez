package Laboratorio1.reto2;

import java.util.List;

public class CarreraParalela {

    public static int obtenerMayor(List<Integer> numeros) {
        return numeros.stream()
                .max(Integer::compareTo)
                .orElse(0);
    }
    public static int obtenerMenor(List<Integer> numeros) {
        return numeros.stream()
                .min(Integer::compareTo)
                .orElse(0);
    }

    public static int cantidadDatos(List<Integer> numeros) {
        return numeros.size();
    }
}
