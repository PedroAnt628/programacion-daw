public class Pais {
    private String nombre;
    private int problacion;
    private double PIB;

    public Pais(String nombre, int problacion, double PIB) {
        this.nombre = nombre;
        this.problacion = problacion;
        this.PIB = PIB;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getProblacion() {
        return problacion;
    }

    public void setProblacion(int problacion) {
        this.problacion = problacion;
    }

    public double getPIB() {
        return PIB;
    }

    public void setPIB(double pIB) {
        PIB = pIB;
    }

    public void imprimePais(){
        int PIBpC;
        PIBpC = (int) ((PIB * 100000) / problacion);
        System.out.println("Pais es " + nombre + " con una poblacion de " + problacion + " y su PIB per capita es "+ PIBpC );
    }

    
}
