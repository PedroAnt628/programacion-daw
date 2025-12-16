// public class Vehiculo {
//     //Datos miembros de la clase
//     boolean useFlag;
//     String model;
//     int numTires;

//     //Constructor
//     public Vehiculo(boolean useF, String modelo, int numT){
//         useFlag=useF;
//         model=modelo;
//         numTires=numT; 
//     }

//     //Metodos de la clase
//     public void Start(){
//         System.out.println("El vehiculo ha arrancado");
//     }

//     public void turnleft(){
//         System.out.println("El vehiculo ha girado a la izquierda");
//     }

//     public void turnright(){
//         System.out.println("El vehiculo ha girado a la derecha");
//     }

//     public void stop(){
//         System.out.println("El vehiculo se ha detenido");
//     }

//     public void forward(int speed){
//         System.out.println("El vehiculo avanza a una velocidad de: " + speed + " km/h");
//     }

//     public static void imprimirDatos(){
//         System.out.println("Estas en un concesionario");
//     }

//     public static void main(String[] args) {
//         System.out.println("Creacion de clase vehiculo y objetos");
//         //Objetos de la clase Vehiculo
//         Vehiculo moto=new Vehiculo(true, "Honda", 2);
//         Vehiculo coche=new Vehiculo(false, "Toyota", 4);
//         //Usando objetos
//         moto.Start();
//         moto.turnleft();
//         moto.forward(100);

//         coche.Start();
//         coche.turnright();
//         coche.forward(120);

//         imprimirDatos();
//     }
// }

class Persona{
    String nombre;
    byte edad;
    double estatura;

    //Constructor por defecto
    public Persona(){
    }
    //Constructor con parametros
    public Persona(String nombre, byte edad, double estatura){
        this.nombre=nombre;
        this.edad=edad;
        this.estatura=estatura;
    }

    public Persona(Persona p){
        this.nombre=p.nombre;
        this.edad=p.edad;
        this.estatura=p.estatura;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setEdad(byte edad){
        this.edad=edad;
    }

    public byte getEdad(){
        return edad;
    }

    public void setEstatura(double estatura){
        this.estatura=estatura;
    }

    public double getEstatura(){
        return estatura;
    }

    public void saludar(){
        System.out.println("Hola a todos, soy "+nombre);

    }

    public void miEdad(){
        System.out.println("Tengo "+edad+" años");
    }

    public void miEstarura(){
        System.out.println("Mido "+estatura+" metros");
    }

    public void imprimirDatos(){
        System.out.println("Te llamas "+nombre+", tienes "+edad+" años y mides "+estatura+" metros");
    }

    public static void main(String[] args) {
        Persona p1=new Persona();
        Persona p2=new Persona();
        Persona p3=new Persona();
        Persona p4=new Persona("Pedro", (byte)19, 1.73);
        Persona p5=new Persona(p4);

        p1.setNombre("Pepa");
        p1.setEdad((byte)18);
        p1.setEstatura(1.87);

        p2.setNombre("Paco");
        p2.setEdad((byte)51);
        p2.setEstatura(1.68);

        p3.setNombre("Miguel");
        p3.setEdad((byte)27);
        p3.setEstatura(1.79);

        p1.saludar();
        p1.miEdad();
        p1.miEstarura();

        p2.saludar();
        p2.miEdad();
        p2.miEstarura();
        
        p3.saludar();
        p3.miEdad();
        p3.miEstarura();

        p1.imprimirDatos();
        p2.imprimirDatos();
        p3.imprimirDatos();
        p4.imprimirDatos();
        p5.imprimirDatos();
    }
}