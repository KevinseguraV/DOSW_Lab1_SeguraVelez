package Laboratorio1.reto3;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reto3 {

    public static void main(String[] args) {
        String mensajeTransformar = "Este Mensaje será modificado";

        Function<String, String> funcionCombinacion = msg -> bufferInvertirMensaje(builderRepetirTresVeces(msg));

        System.out.println(funcionCombinacion.apply(mensajeTransformar));
    }

    public static String bufferInvertirMensaje(String mensaje) {
        StringBuffer msg = new StringBuffer(mensaje);
        return msg.reverse().toString();
    }

    public static String builderRepetirTresVeces(String mensaje) {
        Function<String, String> repetir = msg ->
                Stream.generate(() -> msg)
                        .limit(3)
                        .collect(Collectors.joining(" "));

        String resultado = repetir.apply(mensaje);

        StringBuilder sb = new StringBuilder(resultado);
        return sb.toString();
    }
}

