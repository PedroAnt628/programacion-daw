package interfaces;

public class futbolista extends seleccionFutbol {
    private int dorsal;
    private String demarcacion;

    public futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public void entrenar() {
        System.out.println(nombre + " " + apellidos + " está entrenando como futbolista.");
    }

    public void jugarPartido() {
        System.out.println(nombre + " " + apellidos + " está jugando un partido como futbolista.");
    }
    
}
