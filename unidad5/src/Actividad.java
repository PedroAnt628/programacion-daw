import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// A partir del fichero heroes.json, vamos a:
// – Leer el fichero para obtener su JSONArray
// – Crear un Map<String, List<Heroe>> como HashMap
// – Mientras se recorren los héroes:
// ● Se obtendrá su nombre y editorial y se creará el Heroe
// ● Se creará un nuevo par clave-valor si no existe la clave
// ● Se añadirá el héroe a la lista correspondiente por clave
// – Se imprimen las listas de héroes de cada editorial por clave

public class Actividad {
    public static void main(String[] args) {
        
        Map<String, List<Heroe>> heroeEdi = new HashMap<>();

        try {
            Object ob = new JSONParser().parse(new FileReader("./unidad5/heroes.json"));
            JSONArray listaHeroes = (JSONArray) ob;

            // Recorrer los heroes
            for (Object item : listaHeroes) {
                JSONObject data = (JSONObject) item;
                String publisher = (String) data.get("publisher");
                String superhero = (String) data.get("superhero");
                // Crear el Heroe
                Heroe heroe = new Heroe(superhero, publisher);

                // Si no existe la clave se crea una nueva lista
                if (!heroeEdi.containsKey(publisher)) {
                    heroeEdi.put(publisher, new ArrayList<>());
                }

                // Añadir el héroe a la lista correspondiente
                heroeEdi.get(publisher).add(heroe);
            }

            // Imprimir listas de heroes por editorial
            for (String editorial : heroeEdi.keySet()) {
                System.out.println("--- Heroes de " + editorial + " ---");
                for (Heroe heroe : heroeEdi.get(editorial)) {
                    System.out.println(heroe.getNombre());
                }
            }

        } catch (Exception e) {
            System.out.println("Algo ha fallado en la lectura de JSON");
        }

    }

}

class Heroe {
    private String nombre;
    private String editorial;

    public Heroe(String nombre, String editorial) {
        this.nombre = nombre;
        this.editorial = editorial;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEditorial() {
        return editorial;
    }
}
