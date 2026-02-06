package Ejercicio3;

import java.util.HashMap;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        HashMap <String, String> diccionario = new HashMap<>();

        diccionario.put("caliente", "hot");
        diccionario.put("rojo", "red");
        diccionario.put("ardiente", "hot");
        diccionario.put("verde", "green");
        diccionario.put("agujetas", "stiff");
        diccionario.put("abrasador", "hot");
        diccionario.put("hierro", "iron");
        diccionario.put("grande", "big");

        Scanner teclado = new Scanner(System.in);
        System.out.print("\nIntroduce una palabra: ");
        String palabra = teclado.nextLine();

        if (diccionario.containsKey(palabra)){
                System.out.println(palabra + " - " + diccionario.get(palabra));
        }else {
            System.out.println("Palabra no encontrada en el diccionario");
        }
    }

}