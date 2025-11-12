package prueba;

public class persona {
    public String nombre;
    int edad;
 
    public persona() {
    }

    public persona(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }

    public void setNombre (String nombre){
        this.nombre=nombre;
    }

    public String getNombre(){
        return this.nombre;
    } 
    
    public void setEdad (int edad){
        this.nombre=nombre;
    }

    public int getEdad(){
        return this.edad;
    } 

    public void imprimirDatos(){
        System.out.println("Me llamo "+this.nombre+" y tengo "+this.edad);
    }   
}



