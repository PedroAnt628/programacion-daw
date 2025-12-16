public class Ejercicio4 {
    
    public static void main(String[] args) {
        String palabra1 = "Amor";
        String palabra2 = "Roma";

        if (verificarAnagrama(palabra1) == verificarAnagrama(palabra2)){
            System.out.println("La palabra es anagrama de la otra");
        } else System.out.println("No son anagramas");
    }

    public static boolean verificarAnagrama(String palabra1){



    
        // Convertir el arreglo de caracteres a String para usar métodos de String
        String palabra = new String(palabra1);
        //Pasamos todo a minusculas
        palabra = palabra.toLowerCase();
        //Quitamos los espacios
        palabra = palabra.replace("-", "");
        //Quitamos las tildes si las hay
        palabra = palabra.replace("á", "a")
               .replace("é", "e")
               .replace("í", "i")
               .replace("ó", "o")
               .replace("ú", "u");

        //Invertimos la palabra
        String invertida = new StringBuilder(palabra).reverse().toString();
        //Comparar original con invertida
        return palabra.equals(invertida);

    }
}
