package interfaces;

public class main {
    public static void main(String[] args) {
        futbolista futbolista1 = new futbolista(1, "Axel", "Blaze", 14, 10, "Delantero");
        entrenador entrenador1 = new entrenador(2, "Persival", "Travis", 34, "Juego en el barro");
        masajista masajista1 = new masajista(3, "Nelly", "Raimon", 45, "Gerente", 10);

        futbolista1.concentrarse();
        futbolista1.viajar();
        futbolista1.entrenar();
        futbolista1.jugarPartido();

        entrenador1.concentrarse();
        entrenador1.viajar();
        entrenador1.entrenar();
        entrenador1.jugarPartido();

        masajista1.concentrarse();
        masajista1.viajar();
        masajista1.entrenar();
    }
}