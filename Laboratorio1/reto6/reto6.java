package Laboratorio1.reto6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class reto6 {
    private static Map<String, Runnable> comandos = new HashMap<>();

    static {
        comandos.put("SALUDAR", () ->
                System.out.println("La máquina dice: ¡Saludos, viajero del tiempo y del código!")
        );
        comandos.put("DESPEDIR", () ->
                System.out.println("La máquina dice: Que los bits te acompañen, hasta la próxima misión.")
        );
        comandos.put("CANTAR", () ->
                System.out.println("La máquina canta: 01010101")
        );
        comandos.put("DANZAR", () ->
                System.out.println("La máquina gira y emite chispas: Girando en modo fiesta.")
        );
        comandos.put("BROMEAR", () ->
                System.out.println("La máquina ríe: ¿Por qué la RAM rompió con la CPU? Porque necesitaba espacio…")
        );
        comandos.put("GRITAR", () ->
                System.out.println("La máquina grita: ¡¡¡ALERTA DE STACK OVERFLOW!!!")
        );
        comandos.put("SUSURRAR", () ->
                System.out.println("La máquina susurra: Shhh… los bugs están dormidos")
        );
        comandos.put("ANALIZAR", () ->
                System.out.println("La máquina procesa: Analizando datos… resultado: ¡Eres increíble programando!")
        );
    }

    public static void main(String[] args) {

        //Uso del método con switch
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

        //Uso del Map
        ArrayList<String> comandosHash = new ArrayList<>(
                Arrays.asList("SALUDAR", "DESPEDIR", "CANTAR", "DANZAR", "BROMEAR", "GRITAR", "SUSURRAR", "ANALIZAR")
        );

        comandosHash.forEach(cmd -> {
            Runnable accion = comandos.get(cmd);

            if (accion != null) {
                accion.run();
            } else {
                System.out.println("Comando no reconocido.");
            }
        });
    }
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
            case "BROMEAR":
                return () ->
                        System.out.println("La máquina ríe: ¿Por qué la RAM rompió con la CPU? Porque necesitaba espacio…");
            case "GRITAR":
                return () ->
                        System.out.println("La máquina grita: ¡¡¡ALERTA DE STACK OVERFLOW!!!");
            case "SUSURRAR":
                return () ->
                        System.out.println("La máquina susurra: Shhh… los bugs están dormidos");
            case "ANALIZAR":
                return () ->
                        System.out.println("La máquina procesa: Analizando datos… resultado: ¡Eres increíble programando!");
            default:
                System.out.println("Comando no reconocido.");
        }
        return null;
    }
}
