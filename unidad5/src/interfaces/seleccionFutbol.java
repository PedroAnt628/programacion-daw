package interfaces;

public abstract class seleccionFutbol  implements integranteSeleccionFutbol {
    protected int id;
    protected String nombre;
    protected String apellidos;
    protected int edad;

    public seleccionFutbol(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    @Override
    public void concentrarse() {
        System.out.println(nombre + " " + apellidos + " se está concentrando.");
    }

    @Override
    public void viajar() {
        System.out.println(nombre + " " + apellidos + " está viajando.");
    }

    @Override
    public void entrenar() {
        System.out.println(nombre + " " + apellidos + " está entrenando.");
    }

    @Override
    public void jugarPartido() {
        System.out.println(nombre + " " + apellidos + " está jugando un partido.");
    }
    
}
