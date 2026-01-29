package Animales;

public class main {
    public static void main(String[] args) {


        perro perro1 = new perro("Firulais", 3, "Croquetas", 60, "Labrador");
        animal animal2 = new perro("Max", 4, "Huesos", 58, "Pastor Alemán");

     
        System.out.println(perro1.toString());
        System.out.println(animal2.toString());
    }
}
