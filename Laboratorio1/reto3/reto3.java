import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reto3 {

    public static String ecoMisterioso(String mensaje) {

        Function<String, String> repetir = msg ->
                Stream.generate(() -> msg)
                        .limit(3)
                        .collect(Collectors.joining(" "));

        String resultado = repetir.apply(mensaje);

        StringBuilder sb = new StringBuilder(resultado);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(ecoMisterioso("Hola"));
    }
}

