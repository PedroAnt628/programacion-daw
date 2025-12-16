public class App {
    public static void main(String[] args) throws Exception {
        Profesor profesor1 = new Profesor(634634663, 38539594, "Antonio", "Ribera Ripipi");
        Profesor profesor2 = new Profesor(547455745,74574574,"Alvaro","Señorio de la Sal");

        Alumno alumno1 = new Alumno("Paco", "Gutierrez", 3, "07/08/1984");
        Alumno alumno2 = new Alumno("Juan", "Fernandez", 2, "08/12/1992");

        Modulo modulo1 = new Modulo(1, "Ciencias");
        Modulo modulo2 = new Modulo(2, "Literatura");

        Cursa[] cursa = new Cursa[4];
        Cursa cursa1 = new Cursa(alumno2, modulo2);
        Cursa cursa2 = new Cursa(alumno1, modulo1);

        System.out.println(cursa1);
    }
}
