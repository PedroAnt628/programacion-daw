import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class tema4_actividades {
    
}

class Persona {
    String nombre;
    LocalDate fechaNacimiento;
    double estatura;
    final String DNI;
    int hijos;
    Persona pareja;


    public Persona(String DNI,String fecha,String nombre, double estatura, int hijos, Persona pareja) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaNacimiento=LocalDate.parse(fecha,fmt);
        this.DNI=DNI;
        this.hijos=2;
        this.pareja=null;
        this.nombre=nombre;
        this.estatura=estatura;
        this.pareja=pareja;
    }



    public void obtenerEdad(){
        Period periodo=Period.between(fechaNacimiento, LocalDate.now());
        System.out.println("Tienes "+periodo.getYears()+" años");
    }
    public void asignaPareja(Persona p){
        this.pareja=p; //Hará referencia a la ya existente
    }

    public void tostring(){
        System.out.println("Te llamas "+this.nombre+" y tu DNI es "+this.DNI);
    }
    public static void main(String[] args) {
        Persona p=new Persona("12345678B","01/07/1987","Juan",1.75,2,null);
        p.obtenerEdad();
        System.out.println("Tienes "+p.hijos+" hijos");
        Persona p2=new Persona("12345678B","01/07/1987","Maria",1.65,1,null);
        p.hijos=3;
        p.asignaPareja(p2);
        p2.asignaPareja(p2);

        p.tostring();
        p2.tostring();
        }

}
