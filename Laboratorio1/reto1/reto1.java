import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Reto1 {

    public static void main(String[] args) {

        List<Estudiante> estudiantes = new ArrayList<>();

        estudiantes.add(new Estudiante(
                "Kevin Segura", 21,
                "kevin.svelandia@mail.escuelaing.edu.co", 6));

        estudiantes.add(new Estudiante(
                "Juan Pablo Vélez", 22,
                "juan.velez-mu@mail.escuelaing.edu.co", 5));

        MensajeBienvenida mensaje = (lista) -> {

            String descripcion = lista.stream()
                    .map(e -> e.getNombre()
                            + ", estudiante de "
                            + e.getSemestre() + "° semestre de "
                            + e.getEdad() + " años")
                    .collect(Collectors.joining(", y "));

            String correos = lista.stream()
                    .map(Estudiante::getCorreo)
                    .collect(Collectors.joining(" y "));

            return "¡Hola, bienvenidos! Nosotros somos la pareja conformada por "
                    + descripcion
                    + ". Nuestros correos institucionales son "
                    + correos + ".";
        };

        System.out.println(mensaje.generarMensaje(estudiantes));
    }
}
