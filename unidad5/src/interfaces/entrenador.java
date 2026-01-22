package interfaces;

public class entrenador extends seleccionFutbol {
    private String estrategia;

    public entrenador(int id, String nombre, String apellidos, int edad, String estrategia) {
        super(id, nombre, apellidos, edad);
        this.estrategia = estrategia;
    }

    public void entrenar() {
        System.out.println(nombre + " " + apellidos + " está entrenando al equipo con la estrategia: " + estrategia);
    }

    public void jugarPartido() {
        System.out.println(nombre + " " + apellidos + " está dirigiendo un partido como entrenador.");
    }
    
}
