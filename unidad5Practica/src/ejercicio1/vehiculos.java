package ejercicio1;

public abstract class vehiculos {
    protected  String matricula;

    public vehiculos(){

    }

    public vehiculos(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public abstract double calcularConsumo();

    public void mostrarInfo() {
        System.out.println("Matricula: " + matricula);
    }

    
}
