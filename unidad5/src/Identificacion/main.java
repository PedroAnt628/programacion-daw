package Identificacion;

public class main {
    public static void main(String[] args) {
        
        coche c1 = new coche("1234ABC", "Toyota", "Corolla", 180, 140) {};
        moto m1 = new moto("5678DEF", "Honda", "CBR600", false) {};
        cliente client1 = new cliente("12345678A", "Juan", "Pérez", "600123456", null) {};
        propietario p1 = new propietario("87654321B", "Ana", "García", "Calle Falsa 123") {};

        c1.identificarte();
        m1.identificarte();
        client1.identificarte();
        p1.identificarte();

    }
    
}
