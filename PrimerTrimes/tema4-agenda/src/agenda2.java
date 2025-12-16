import java.util.ArrayList;

public class agenda2 {
    public static void main(String[] args) {
        ArrayList<persona> lista = new ArrayList<persona>();
        lista.add(new persona("Pedro", "Calle Falsa 123", "555-1234"));
        lista.add(new persona("Juan", "Calle Falsa 123", "5377-1234"));
        lista.add(new persona("Alvaro", "Calle Falsa 123", "9070-1234"));
        lista.add(new persona("Paco", "Calle Falsa 123", "589785-1234"));
        lista.add(new persona("Fernando", "Calle Falsa 123", "3773-1234"));

        //Ordenar la lista de personas
        lista.sort((p1, p2) -> p1.getNombre().compareToIgnoreCase(p2.getNombre()));

        //Mostar las personas
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).imprimePersona();
        }
    }
    

}
