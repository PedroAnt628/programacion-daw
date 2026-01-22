package Identificacion;

import java.util.ArrayList;

public class taller {
    private String nombre;
    private String direccion;
    private propietario propietario;
    private ArrayList<cliente> clientes = new ArrayList<>();
    
    public taller(String nombre, String direccion, Identificacion.propietario propietario,
            ArrayList<cliente> clientes) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.propietario = propietario;
        this.clientes = clientes;
    }

    
}
