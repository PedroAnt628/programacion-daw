public class Main {
    public static void main(String[] args) {
        Fecha fechaNacimiento=new Fecha(2,7,2006);
        Ciudad ciudadNacimiento=new Ciudad(4800,"Albox",3);
        Ciudad ciudadResidencia=new Ciudad(4800,"Albox",3);

        Persona persona=new Persona("teerrtert","Pedro","Moreno",'H');
        persona.setCiudadNacimiento(ciudadNacimiento);
        persona.setCiudadResidencia(ciudadResidencia);
        persona.setFechaNacimiento(fechaNacimiento);


        persona.imprimePesona();}
}
