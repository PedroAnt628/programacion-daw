public class SucursalEmpleado {
    private Sucursal sucursal;
    private Empleado empleado;
    private String dia;
    private String horario;

    public SucursalEmpleado(Sucursal sucursal, Empleado empleado, String dia, String horario) {
        this.sucursal = sucursal;
        this.empleado = empleado;
        this.dia = dia;
        this.horario = horario;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "SucursalEmpleado [sucursal=" + sucursal + 
               "empleado=" + empleado + 
               "dia=" + dia + 
               "horario=" + horario + 
               "]";
    } 
}
