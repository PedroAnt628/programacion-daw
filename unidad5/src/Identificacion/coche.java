package Identificacion;

public abstract class coche extends vehiculo{
    private int anchura;
    private int altura;
    
    public coche(String matricula, String marca, String modelo, int anchura, int altura) {
        super(matricula, marca, modelo);
        this.anchura = anchura;
        this.altura = altura;
    }


    @Override
    public void identificarte() {
        System.out.println("Soy un coche con matrícula: " + matricula + " Anchura: " + anchura + " Altura: " + altura);
    }

}
