import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ejercicio3 {

	public static void main(String[] args) throws IOException {
		String rutaArchivo = "./unidad5RelacionEjercicios/alumnos.json";

		JSONParser parser = new JSONParser();
		try {
			JSONObject raiz = (JSONObject) parser.parse(Files.newBufferedReader(Paths.get(rutaArchivo)));
			JSONArray listaAlumnos = (JSONArray) raiz.get("alumnos");

			HashMap<String, Integer> contadorCategorias = new HashMap<>();
			contadorCategorias.put("suspensos", 0);
			contadorCategorias.put("aprobados", 0);
			contadorCategorias.put("notable", 0);
			contadorCategorias.put("sobresalientes", 0);

			for (Object alumnoObj : listaAlumnos) {
				JSONObject alumnoJson = (JSONObject) alumnoObj;
				String nombreAlumno = (String) alumnoJson.get("nombre");
				JSONArray listaNotas = (JSONArray) alumnoJson.get("notas");

				double sumaNotas = 0.0;
				for (Object notaObj : listaNotas) {
					if (notaObj instanceof Number) {
						sumaNotas += ((Number) notaObj).doubleValue();
					}
				}
				double mediaAlumno = listaNotas.size() > 0 ? sumaNotas / listaNotas.size() : 0.0;
				System.out.printf("%s -> media: %.2f%n", nombreAlumno, mediaAlumno);

				if (mediaAlumno < 5.0) {
					contadorCategorias.put("suspensos", contadorCategorias.get("suspensos") + 1);
				} else if (mediaAlumno < 7.0) {
					contadorCategorias.put("aprobados", contadorCategorias.get("aprobados") + 1);
				} else if (mediaAlumno < 9.0) {
					contadorCategorias.put("notable", contadorCategorias.get("notable") + 1);
				} else {
					contadorCategorias.put("sobresalientes", contadorCategorias.get("sobresalientes") + 1);
				}
			}

			System.out.println("\nConteos por categoría:");
			System.out.println(contadorCategorias);

		} catch (ParseException e) {
			System.err.println("Error parseando JSON: " + e.getMessage());
		}
	}

}
