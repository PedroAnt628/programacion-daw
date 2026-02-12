package Modelo;

import java.sql.Date;

public class Suministra {
    private int codigoProveedor;
    private int codigoPieza;
    private int cantidad;
    private Date fecha;

    public Suministra(int codigoProveedor, int codigoPieza, int cantidad, Date fecha) {
        this.codigoProveedor = codigoProveedor;
        this.codigoPieza = codigoPieza;
        this.cantidad = cantidad;
        this.fecha = fecha;
    }

    public int getCodigoProveedor() {
        return codigoProveedor;
    }

    public int getCodigoPieza() {
        return codigoPieza;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
