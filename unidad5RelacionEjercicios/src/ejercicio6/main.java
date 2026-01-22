package ejercicio6;

public class main {
    public static void main(String[] args) {
        
        vertebrados ver1 = new vertebrados("Tigre", "Mamifero", "Selva", "Carnivoro", "Terrestre", 80);
        invertebrados inver1 = new invertebrados("Araña", "Aracnido", "Casa", "Insectos", 8, "Marron");

        System.out.println(ver1);
        System.out.println(inver1);
    }
}