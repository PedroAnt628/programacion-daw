package Animales;

public class ejecutarGranja {
    public static void main(String[] args) {

        //animal animal1 = new animal("Jazinto", 5, "Carne");
        //mamifero mamifero1 = new mamifero("Adri", 18, "Guantazos", 120);

        perro perro1 = new perro("Firulais", 3, "Croquetas", 60, "Labrador");
        animal animal2 = new perro("Max", 4, "Huesos", 58, "Pastor Alemán");

        //System.out.println(animal1.toString());
        //System.out.println(mamifero1.toString());

        System.out.println(perro1.toString());
        System.out.println(animal2.toString());
    }
}
