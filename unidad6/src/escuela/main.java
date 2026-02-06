package escuela;

public class main {

    public static void main(String[] args) {

        // alumno.insertar(1, "Juan", "Pérez", "López", "2005-03-10", "600123123");
        // alumno.insertar(2, "María", "Gómez", "Ruiz", "2006-07-21", "611987987");

        alumno.listar();



        // curso_escolar.insertar(1, 2023, 2024);
        // curso_escolar.insertar(2, 2024, 2025);

        curso_escolar.listar();



        // profesor.insertar(1, "Francisco", "Martínez", "Navarro", "Matemáticas", "622111222");
        // profesor.insertar(2, "Ana", "López", "Santos", "Lengua", "633222333");

        profesor.listar();



        // asignatura.insertar(101, "Matemáticas", 4, 1);
        // asignatura.insertar(102, "Lengua Española", 3, 2); 

        asignatura.listar();



        // se_matricula.insertar(1, 1, 101); 
        // se_matricula.insertar(2, 1, 102);

        se_matricula.listar();
    }
}
