package Laboratorio1.reto4;

public class Reto4 {
    public static void main(String[] args) {

    }

    public static Map<String, Integer> cargarMapa(List<Map.Entry<String, Integer>> datos) {
        Map<String, Integer> tabla = new Hashtable<>();
        for (Map.Entry<String, Integer> entry : datos) {
            tabla.putIfAbsent(entry.getKey(), entry.getValue());
        }
        return tabla;
    }

    public static Map<String, Integer> combinarMapas(
            Map<String, Integer> mapaHash,
            Map<String, Integer> mapaTable) {

        Map<String, Integer> resultado = new HashMap<>(mapaHash);
        resultado.putAll(mapaTable); // prioriza Hashtable
        return resultado;
    }
}