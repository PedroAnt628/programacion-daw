import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ejercicio2 {
    public static void main(String[] args) {

        try{
            Object ob = new JSONParser().parse(new FileReader("./unidad5RelacionEjercicios/heroes.json"));
            JSONArray listaHeroes = (JSONArray) ob;

            for (Object item : listaHeroes) {
                JSONObject data = (JSONObject) item;
                String publisher = (String) data.get("publisher");
                String alter_ego = (String) data.get("alter_ego");
                String superhero = (String) data.get("superhero");

            if (publisher.equals("DC Comics") && superhero.startsWith("G") ) {
                System.out.println("---- Personaje de DC Comics ----");
                System.out.println(alter_ego);
                System.out.println(superhero);
                System.out.println("-------------------------------");
                }
            }

        } catch (Exception e){
            System.out.println("Algo ha fallado en la lectura de JSON");
        }
    }
}
