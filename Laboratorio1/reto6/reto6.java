package Laboratorio1.reto6;


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
    }

    public static void ejecutarComando(String comando) {
        switch (comando) {
            case "SALUDAR":
            case "DESPEDIR":
            case "CANTAR":
            case "DANZAR":
                comandos.get(comando).run();
                break;
            default:
                System.out.println("Comando no reconocido.");
        }
    }
}
