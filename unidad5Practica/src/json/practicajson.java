package json;

import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class practicajson {

    public static void main(String[] args) {
        System.out.println(new java.io.File(".").getAbsolutePath());

        try {
            // Leer el fichero JSON
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("./src/json/heroes.json"));

            // Convertir a array
            JSONArray lista = (JSONArray) obj;

            System.out.println("Héroes encontrados: " + lista.size());
            System.out.println("----------------------------------");

            // Recorrer el array
            for (Object o : lista) {
                JSONObject hero = (JSONObject) o;

                String nombre = (String) hero.get("superhero");
                String alter = (String) hero.get("alter_ego");
                String publisher = (String) hero.get("publisher");

                System.out.println("Superhéroe: " + nombre);
                System.out.println("Alter ego: " + alter);
                System.out.println("Publisher: " + publisher);

                // Ejemplo de filtro típico de examen
                if (publisher.equalsIgnoreCase("Marvel Comics")) {
                    System.out.println("Este héroe es de MARVEL");
                }

                System.out.println("----------------------------------");
            }

        } catch (Exception e) {
            System.out.println("Error leyendo JSON: " + e.getMessage());
        }
    }
}
