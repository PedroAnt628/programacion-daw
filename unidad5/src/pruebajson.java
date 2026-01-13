import java.io.FileReader;
import java.text.ParseException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class pruebajson {
    public static void main(String[] args) {
        try{
        // Lectura del contenido del fichero JSON
        Object ob = new JSONParser().parse(new FileReader("./unidad5/heroes.json"));
        // Convertir objeto a JSON y procesarlo
        JSONArray listaHeroes = (JSONArray) ob;
        //Leer array dentro del JSON
        for (Object item : listaHeroes) {
            JSONObject data = (JSONObject) item;
            String publisher = (String) data.get("publisher");
            String alter_ego = (String) data.get("alter_ego");
            String superhero = (String) data.get("superhero");

            if (publisher.equals("Marvel Comics")) {
                System.out.println("---- Personaje de Marvel Comics ----");
                System.out.println(alter_ego);
                System.out.println(superhero);
                System.out.println("-------------------------------");
            }
        }
        } catch (Exception e) {
        System.out.println("Algo ha fallado en la lectura de JSON");
        }
        
    }
}
