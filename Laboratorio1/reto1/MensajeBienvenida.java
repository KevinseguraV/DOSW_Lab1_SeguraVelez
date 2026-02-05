package Laboratorio1.reto1;

import java.util.List;

@FunctionalInterface
public interface MensajeBienvenida {
    String generarMensaje(List<Estudiante> estudiantes);
}