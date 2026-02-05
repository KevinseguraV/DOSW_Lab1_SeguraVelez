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

     public static Resultado procesarLista(List<Integer> numeros) {
        Resultado r = new Resultado();
        r.setMayor(obtenerMayor(numeros));
        r.setMenor(obtenerMenor(numeros));
        r.setCantidad(cantidadDatos(numeros));
        r.setEsDivisorDe2(2 % r.getMayor() == 0 ? true : false);
        r.setMultiploDe2(r.getMayor() % 2 == 0 ? true : false);
        r.setCantidadImpar(r.getCantidad() % 2 != 0 ? true : false);
        r.setCantidadPar(r.getCantidad() % 2 == 0 ? true : false);
        return r;
    }

    public static int cantidadDatos(List<Integer> numeros) {
        return numeros.size();
    }
}
