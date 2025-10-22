import java.util.Scanner;

public class App {
    //Crear matriz
        static int [][] matriz={{0,0,0},{0,0,0},{0,0,0}};
        //Variable de turno, por defecto empieza el jugador 1
        static boolean turno=true;
        final static int JUEGO1=1;
        final static int JUEGO2=2;
    public static void main(String[] args) throws Exception {
        Scanner teclado=new Scanner(System.in);
        int posicion;

        // for (int i=0;i<9;i++){
        //     System.out.println("Ingrese posicion entre el 1 y 9: ");
        //     posicion=teclado.nextInt();
        //     jugada(matriz, turno, posicion);
        //     if (comprobarGanador(matriz, turno)){
        //         if (turno==true) System.out.println("El jugador 1 ha ganado");
        //         else System.out.println("El jugador 2 ha ganado");
        //         break;
        //     }
        //     turno = !turno;
        //     imprimirMatriz(matriz);
        // }
        do {
            System.out.println("Ingrese posicion entre el 1 y 9: ");
            posicion=teclado.nextInt();
            jugada(matriz, turno, posicion);
            turno = !turno;
            imprimirMatriz();

        } while (!comprobarGanador(matriz, turno));
        if (turno==true) System.out.println("El jugador 1 ha ganado");
        else System.out.println("El jugador 2 ha ganado");

        teclado.close();

    }
    public static void imprimirMatriz(){
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void jugada(int[][]matriz, boolean turno, int posicion){
        int valor;
        if (turno==true) valor=JUEGO1;
        else {valor=JUEGO2;}
        switch (posicion) {
            case 1:
                matriz[0][0]=valor;
                break;
            case 2:
                matriz[0][1]=valor;
                break;
            case 3:
                matriz[0][2]=valor;
                break;
            case 4:
                matriz[1][0]=valor;
                break;
            case 5:
                matriz[1][1]=valor;
                break;
            case 6:
                matriz[1][2]=valor;
                break;
            case 7:
                matriz[2][0]=valor;
                break;
            case 8:
                matriz[2][1]=valor;
                break;
            case 9:
                matriz[2][2]=valor;
                break;
            
            default:
                System.out.println("Has introducido un valor incorrecto");
                break;
        }

    }

    public static boolean comprobarGanador(int[][]matriz, boolean turno){
    int valor;
    if (turno==true) valor=JUEGO1;
    else {valor=JUEGO2;}

    if (compruebafila(0, valor) || compruebafila(1, valor) || compruebafila(2, valor)) return true;
    else if (compruebacolumna(0, valor) || compruebacolumna(1, valor) || compruebacolumna(2, valor)) return true;
    else if (compruebadiagonal(0, valor) || compruebadiagonal(1, valor)) return true;
    return false;
    }
    public static boolean compruebafila(int fila, int valor){
        for (int j=0;j<3;j++){
            if (matriz[fila][j]!=valor) return false;
        }
        return true;
    }
    public static boolean compruebacolumna(int columna, int valor){
        for (int i=0;i<3;i++){
            if (matriz[i][columna]!=valor) return false;
        }
        return true;
    }
    public static boolean compruebadiagonal(int diagonal, int valor){
        if (diagonal==0){
            for (int i=0;i<3;i++){
                if (matriz[i][i]!=valor) return false;
            }
        } else {
            for (int i=0;i<3;i++){
                if (matriz[i][2-i]!=valor) return false;
            }
        }
        return true;

    }

}
