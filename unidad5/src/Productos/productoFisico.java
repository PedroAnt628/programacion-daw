package Productos;

public class productoFisico extends producto {
    protected double peso;
    protected double CosteEnvio;

    public productoFisico(String id, String nombre, double precio, double peso, double costeEnvio) {
        super(id, nombre, precio);
        this.peso = peso;
        this.CosteEnvio = costeEnvio;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getCosteEnvio() {
        return CosteEnvio;
    }
    public void setCosteEnvio(double costeEnvio) {
        CosteEnvio = costeEnvio;
    }

    @Override
    public String toString() {
        if (peso > 2){
        return "Producto Fisico [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", precioFinal=" + precioFinal() + ", peso=" + peso + ", CosteEnvio=" + "10" + "]";
        } else {
            return "Producto Fisico [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", precioFinal=" + precioFinal() + ", peso=" + peso + ", CosteEnvio=" + "5" + "]";
        }
    }
    
}
