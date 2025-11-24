import prueba.persona;
import prueba.matematicas;

public class actividad1clases {
    public static void main(String[] args) {
        persona p=new persona("Pedro", 19);

    
        double a=5;
        double b=3;
        System.out.println("Suma: "+matematicas.suma(a, b));

        System.out.println(p.getNombre());
        System.out.println(p.nombre);
    }
}
