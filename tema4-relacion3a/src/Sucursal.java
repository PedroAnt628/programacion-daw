public class Sucursal {
    private String codigo;
    private String ciudad;
    private String domicilio;

    public Sucursal(String codigo, String ciudad, String domicilio) {
        this.codigo = codigo;
        this.ciudad = ciudad;
        this.domicilio = domicilio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "Sucursal [codigo=" + codigo + 
               "ciudad=" + ciudad + 
               "domicilio=" + domicilio + 
               "]";
    }

    
}
