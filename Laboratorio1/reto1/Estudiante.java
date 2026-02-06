package Laboratorio1.reto1;

public class Estudiante {

    private String nombre;
    private int edad;
    private String correo;
    private int semestre;

    public Estudiante(String nombre, int edad, String correo, int semestre) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.semestre = semestre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCorreo() {
        return correo;
    }

    public int getSemestre() {
        return semestre;
    }
}

