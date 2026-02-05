package Laboratorio1.reto3;

import java.util.function.Function;

public class reto3 {

    public static void main(String[] args) {
        String mensajeTransformar = "Este Mensaje será modificado";

        Function<String, String> funcionCombinacion = msg -> bufferInvertirMensaje(msg);

        System.out.println(funcionCombinacion.apply(mensajeTransformar));
    }

    public static String bufferInvertirMensaje(String mensaje) {
        StringBuffer msg = new StringBuffer(mensaje);
        return msg.reverse().toString();
    }
}
