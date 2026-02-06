package Ejercicio2;

import java.io.FileReader;
import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;

public class main{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try {
            JSONObject ob = (JSONObject) new JSONParser().parse(new FileReader("./src/Ejercicio2/empresas.json"));

            JSONArray empleados = (JSONArray) ob.get("empleados");
            JSONObject direccion = (JSONObject) ob.get("direccion");
            String empresa = (String) ob.get("empresa");

            int opcion;

            do {
                System.out.println("1- Empleados activos");
                System.out.println("2- Empleados administradores");
                System.out.println("3- Datos de la empresa");
                System.out.println("4- Buscar empleado");
                System.out.println("0- Salir");
                System.out.print("Opción: ");
                opcion = Integer.parseInt(teclado.nextLine());

                switch (opcion) {
                    case 1:
                        int activos = 0;
                        System.out.println("Activos:");
                        for (Object x : empleados) {
                            JSONObject e = (JSONObject) x;
                            if ((boolean) e.get("activo")) {
                                activos++;
                                System.out.println("- " + e.get("nombre"));
                            }
                        }
                        System.out.println("Total: " + activos);
                        break;

                    case 2:
                        int admins = 0;
                        for (Object x : empleados) {
                            JSONObject e = (JSONObject) x;
                            JSONArray roles = (JSONArray) e.get("roles");
                            if (roles.contains("admin")) admins++;
                        }
                        System.out.println("Administradores: " + admins);
                        break;

                    case 3:
                        System.out.println("Empresa: " + empresa);
                        System.out.println("Ciudad: " + direccion.get("ciudad"));
                        System.out.println("País: " + direccion.get("pais"));
                        break;

                    case 4:
                        System.out.print("Nombre del empleado: ");
                        String nombre = teclado.nextLine();
                        boolean encontrado = false;

                        for (Object x : empleados) {
                            JSONObject e = (JSONObject) x;
                            if (e.get("nombre").equals(nombre)) {
                                System.out.println("ID: " + e.get("id"));
                                System.out.println("Roles: " + e.get("roles"));
                                System.out.println("Activo: " + e.get("activo"));
                                encontrado = true;
                            }
                        }

                        if (!encontrado) System.out.println("No es empleado.");
                        break;
                }

            } while (opcion != 0);

        } catch (Exception e) {
            System.out.println("No se ha leido el json");
        }
    }
}
