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

    public static Resultado procesarLista(List<Integer> numeros) {
        Resultado r = new Resultado();
        r.setMayor(obtenerMayor(numeros));
        r.setMenor(obtenerMenor(numeros));
        r.setCantidad(cantidadDatos(numeros));
        r.setEsDivisorDe2(2 % r.mayor == 0 ? true : false);
        return r;
    }


}
