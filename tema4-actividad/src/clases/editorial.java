package clases;

public class editorial {
    int codigo;
    String nombre;
    int anyo;

    public editorial(){

    }
    public editorial(int codigo, String nombre, int anyo){
        this.codigo=codigo;
        this.nombre=nombre;
        this.anyo=anyo;
    }

    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
    public int getCodigo(){
        return this.codigo;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setAnyo(int anyo){
        this.anyo=anyo;
    }
    public int getAnyo(){
        return this.anyo;
    }

    public void ImprimeEditorial(){
        System.out.println("Nombre de la editorial: " + this.nombre);
        System.out.println("Año de la editorial: " + this.anyo);
    }
}
