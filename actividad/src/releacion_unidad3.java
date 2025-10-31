import java.util.Scanner;

public class releacion_unidad3 {
    // public static void main(String[] args) {
       
    // //Ejercicio 1
    // //Crear vector dinamico
    //     int[] vector=null;
    //     //Añadir valores al vector
    //     vector=push(vector,3);
    //     //Añadir otro valor al vector
    //     vector=push(vector,5);
    //     for (int i = 0; i < vector.length; i++) {
    //         System.out.print(vector[i]+" ");
    //     }
    //     //Eliminar el ultimo
    //     int valor=pop(vector);
    //     System.out.println(valor);

    // }
    // //Funcion push añade un valor al array y devuelve el nuevo array
    // public static int[] push(int[] array, int valor) {
    //     int longitud;
    //     if (array == null) longitud = 0;
    //     else longitud = array.length;
    //     //Crear nuevo array con +1
    //     int[] salida = new int[longitud + 1];
    //     //Copiar lo que haya en ese momento
    //     for (int i = 0; i < longitud; i++) {
    //         salida[i] = array[i];
    //     }
    //     salida[longitud] = valor;
    //     return salida;
    // }

    // //Funcion pop elimina el ultimo valor del array y devuelve el nuevo array
    // public static int pop(int[] array) {
    //     if (array == null) return -1;
    //     int valor=array[array.length-1];
    //     int[] nuevo = new int[array.length - 1];
    //     for (int i=0;i<nuevo.length;i++){
    //         nuevo[i]=array[i];
    //     }
    //     array=nuevo;
    //     return valor;
    // }



    //Ejercicio 2
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cuántos números quieres introducir? ");
        int cantidad = teclado.nextInt();

        //Crear el array y meter los números con push
        int[] vector = null;
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            int num = teclado.nextInt();
            vector = push(vector, num);
        }

        //Array original
        System.out.print("Vector original: ");
        mostrarVector(vector);

        //Mayor a menor
        ordenarDescendente(vector);

        //Array ordenado
        System.out.print("Vector ordenado: ");
        mostrarVector(vector);
    }

    
    //Funcion push añade un valor al array y devuelve el nuevo array
    public static int[] push(int[] array, int valor) {
        int longitud;
        if (array == null) longitud = 0;
        else longitud = array.length;
        //Crear nuevo array con +1
        int[] salida = new int[longitud + 1];
        //Copiar lo que haya en ese momento
        for (int i = 0; i < longitud; i++) {
            salida[i] = array[i];
        }
        salida[longitud] = valor;
        return salida;
    }

    // Mostrar el array
    public static void mostrarVector(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Ordenar de mayor a menor
    public static void ordenarDescendente(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
            if (array[j] < array[j + 1]) {
                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
            }
            }
        }
    }





}
