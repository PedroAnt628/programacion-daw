// Crea las clases en JAVA con sus correspondientes
// constructores y funciones necesarias para mostrar información y
// modificar los atributos del siguiente diagrama E-R
public class Viaje {
    public static void main(String[] args) throws Exception {
        Hotel notel1 = new Hotel(1, "Hokkaido", 345345345, 45, "Albox", "avenida");
        Hotel hotel2 = new Hotel(2, "Lozanillo", 345345345, 23, "Caceres", "calle");

        Vuelo vuelo1 = new Vuelo(1, "02/08/2025", 13, "El saliente", "Cerro Gordo", 3);
        Vuelo vuelo2 = new Vuelo(2, "11/02", 22, "Malaga", "Sevilla", 46);

        Sucursal sucursal1 = new Sucursal(1, "sdfsfsdfs", 345345345, "ertert", "almeria");
        Sucursal sucursal2 = new Sucursal(2, "asdasdasd", 46456456, "sdrsdf", "dyddfgd");

        Turista turista1 = new Turista(1, "asfagag", "sdgsdg", "reiysf",34633643);
        Turista turista2 = new Turista(2, "sdgsdgsd", "ryurturt", "weoriwiero", 798794);

        Toma[] toma = new Toma[4];
        Toma toma1 = new Toma(sucursal2, turista2, vuelo2, "Pobre");
        Toma toma2 = new Toma(sucursal1, turista1, vuelo2, "VIP");

        Reserva[] reerva = new Reserva[4];
        Reserva reserva1 = new Reserva(hotel2, turista2, sucursal2, "Mañana", "Hoy", "Calor");

        reserva1.imprimeReserva();
        
    }
}
