package Laboratorio1.reto2;

import java.util.List;

public class CarreraParalela {

    public static int obtenerMayor(List<Integer> numeros) {
        return numeros.stream()
                .max(Integer::compareTo)
                .orElse(0);
    }
}
