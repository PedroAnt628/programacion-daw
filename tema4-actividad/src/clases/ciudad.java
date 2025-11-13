package clases;

public class ciudad {
    private String nombre;
    private int indicativo;
    private int codigo;

    public ciudad(){}

    public ciudad(String nombre, int indicativo, int codigo){
        this.nombre=nombre;
        this.indicativo=indicativo;
        this.codigo=codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIndicativo() {
        return indicativo;
    }

    public void setIndicativo(int indicativo) {
        this.indicativo = indicativo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void imprimeCiudad(){
        System.out.println("Nombre de la ciudad: " + this.nombre);
        System.out.println("Indicativo de la ciudad: " + this.indicativo);
        System.out.println("Código de la ciudad: " + this.codigo);
    }
}