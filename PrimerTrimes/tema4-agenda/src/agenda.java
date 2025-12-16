public class agenda {
    public static void main(String[] args) throws Exception {

        //int[] numeros = new int[5];

        persona[] lista = new persona[5];
        for (int i = 0; i < lista.length; i++) {
            lista[0] = new persona("Pedro", "Calle Falsa 123", "555-1234");
            lista[1] = new persona("Juan", "Calle Falsa 123", "5377-1234");
            lista[2] = new persona("Alvaro", "Calle Falsa 123", "9070-1234");
            lista[3] = new persona("Paco", "Calle Falsa 123", "589785-1234");
            lista[4] = new persona("Fernando", "Calle Falsa 123", "3773-1234");

        }
        for (int i = 0; i < lista.length; i++) {
            lista[i].imprimePersona();
        }
    }
}
