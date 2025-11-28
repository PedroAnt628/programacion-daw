import java.util.*;

public class Batalla {
    //Las listas para guardas los personajes
    private List<Personaje> heroes = new ArrayList<>();
    private List<Personaje> orcos = new ArrayList<>();
    private Scanner teclado = new Scanner(System.in);

    //Funcion para meter los atributos de los personajes
    public void crearPersonaje() {
        System.out.println("Introduce nombre:");
        String nombre = teclado.nextLine();

        System.out.println("Introduce vida:");
        int vida = teclado.nextInt();

        System.out.println("Introduce ataque:");
        int ataque = teclado.nextInt();

        System.out.println("Introduce defensa:");
        int defensa = teclado.nextInt();

        System.out.println("Tipo (1-Caballero, 2-Mago, 3-Orco):");
        int tipo = teclado.nextInt();

        //Elegimos la raza segun el numero
        Raza raza;
        switch(tipo) {
            case 1: raza = Raza.CABALLERO; break;
            case 2: raza = Raza.MAGO; break;
            default: raza = Raza.ORCO;
        }

        Personaje personaje = new Personaje(nombre, vida, defensa, ataque, raza);

        if (raza == Raza.ORCO) {
            orcos.add(personaje);
        } else {
            heroes.add(personaje);
        }
       
    }

    //Funcion para empezar la batalla
    public void iniciaBatalla() {
        //Solo empeiza si las listas no estan vacias
        if (heroes.isEmpty() || orcos.isEmpty()) {
            System.out.println("No hay personajes para iniciar la batalla");
            return;
        }

        System.out.println("Inicia la batalla");

        //Para poder ir recorriendo la lista e ir pillando nuevos personajes
        int i = 0; //Heroes
        int j = 0; //Orcos

        //Pillamos un personaje de cada bando y los mostramos
        while (i < heroes.size() && j < orcos.size()) {
            Personaje heroe = heroes.get(i);
            Personaje orco = orcos.get(j);
            System.out.println("\nCombate: " + heroe.getNombre() + " contra " + orco.getNombre());

            //Si los personajes estan vivos, les calculamos el daño que van a recibir
            while (heroe.estaVivo() && orco.estaVivo()) {
                int danoAOrco = Math.max(0, heroe.getAtaque() - orco.getDefensa());
                orco.recibirDaño(danoAOrco);
                System.out.println(heroe.getNombre() + " ataca a " + orco.getNombre() + " y hace " + danoAOrco + " daño --> " + orco.getNombre() + " vida: " + orco.getVida());
                if (!orco.estaVivo()) break;

                int danoAHeroe = Math.max(0, orco.getAtaque() - heroe.getDefensa());
                heroe.recibirDaño(danoAHeroe);
                System.out.println(orco.getNombre() + " ataca a " + heroe.getNombre() + " y hace " + danoAHeroe + " daño --> " + heroe.getNombre() + " vida: " + heroe.getVida());
            }

            //Comprobamos si ha habido muertos despues de recibir el daño
            boolean heroMuerto = !heroe.estaVivo();
            boolean orcoMuerto = !orco.estaVivo();
            if (heroMuerto && orcoMuerto) {
                System.out.println("Ambos han muerto en el combate");
                i++; j++; 
            } else if (orcoMuerto) {
                System.out.println(orco.getNombre() + " ha muerto. " + heroe.getNombre() + " sigue vivo y pelea contra el siguiente orco");
                j++; 
            } else if (heroMuerto) {
                    System.out.println(heroe.getNombre() + " ha muerto. " + orco.getNombre() + " sigue vivo y pelea contra el siguiente heroe");
                    i++; 
            }
        }

        //Si la i o la j es mayor a su band correspondien significa que no hay mas personajes vivos
        if (i >= heroes.size() && j >= orcos.size()) System.out.println("Empate tecnico");
        else if (i >= heroes.size()) System.out.println("Han ganado los orcos");
        else System.out.println("Han ganao los heroes");
        }

        //El menu principal
        public void mostrarMenu() {
        boolean salir = false;
        while (!salir) {
            System.out.println("\n--- Menu Batalla ---");
            System.out.println("1 - Crear personaje");
            System.out.println("2 - Iniciar batalla");
            System.out.println("3 - Salir");
            System.out.print("Elige una opción: ");

            int opc;
            try {
                opc = Integer.parseInt(teclado.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opcion no valida");
                continue;
            }

            switch (opc) {
                case 1:
                    crearPersonaje();
                    break;
                case 2:
                    iniciaBatalla();
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }

    public static void main(String[] args) {
        new Batalla().mostrarMenu();
    }
    }
   
