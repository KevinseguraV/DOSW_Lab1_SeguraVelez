package Laboratorio1.reto6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Reto6 {
    private static Map<String, Runnable> comandos = new HashMap<>();

    public static void main(String[] args) {
        ArrayList<String> comandosProbar = new ArrayList<>(Arrays.asList(new String[]{"SALUDAR", "DESPEDIR", "CANTAR", "DANZAR", "BROMEAR", "GRITAR", "SUSURRAR", "ANALIZAR"}));

        Runnable probarComandos = () -> {
            comandosProbar.forEach(cmd -> {
                Runnable accion = ejecutarComando(cmd);
                if (accion != null) {
                    accion.run();
                }
            });
        };

        probarComandos.run();
    }


    public static Runnable ejecutarComando(String comando) {
        switch (comando) {
            case "SALUDAR":
                return () ->
                        System.out.println("La máquina dice: ¡Saludos, viajero del tiempo y del código!");
            case "DESPEDIR":
                return () ->
                        System.out.println("La máquina dice: Que los bits te acompañen, hasta la próxima misión.");
            case "CANTAR":
                return() ->
                        System.out.println("La máquina canta: 01010101");
            case "DANZAR":
                return () ->
                        System.out.println("La máquina gira y emite chispas: Girando en modo fiesta.");
            default:
                System.out.println("Comando no reconocido.");
        }
        return null;
    }
}
