package Productos;

public class productoDigital extends producto {
    protected String descarga;
    protected String tamañoArchivo;

    public productoDigital(String id, String nombre, double precio, String descarga, String tamañoArchivo) {
        super(id, nombre, precio);
        this.descarga = descarga;
        this.tamañoArchivo = tamañoArchivo;
    }

    public String getDescarga() {
        return descarga;
    }
    public void setDescarga(String descarga) {
        this.descarga = descarga;
    }
    public String getTamañoArchivo() {
        return tamañoArchivo;
    }
    public void setTamañoArchivo(String tamañoArchivo) {
        this.tamañoArchivo = tamañoArchivo;
    }

    
}
