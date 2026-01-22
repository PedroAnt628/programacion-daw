package Identificacion;

import java.util.ArrayList;

public abstract class cliente extends persona{
    private String telefono;
    private ArrayList<vehiculo> vehiculos = new ArrayList<>();

    public cliente(String dNI, String nombre, String pape, String telefono, ArrayList<vehiculo> vehiculos) {
        super(dNI, nombre, pape);
        this.telefono = telefono;
        this.vehiculos = vehiculos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    @Override
    public void identificarte() {
        System.out.println("Soy el cliente " + nombre + " " + pape + " con DNI: " + DNI + " y mi teléfono es: " + telefono);
    }

    
}
