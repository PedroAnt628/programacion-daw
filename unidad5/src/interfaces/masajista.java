package interfaces;

public class masajista extends seleccionFutbol {
    private String titulacion;
    private int aniosExperiencia;

    public masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public void darMasaje() {
        System.out.println(nombre + " " + apellidos + " está dando un masaje.");
    }
    
}
