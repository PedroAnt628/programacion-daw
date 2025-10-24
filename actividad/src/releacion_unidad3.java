public class releacion_unidad3 {
    public static void main(String[] args) {
        //Crear vector dinamico
        int[] vector=null;
        //Añadir valores al vector
        vector=push(vector,3);
        //Añadir otro valor al vector
        vector=push(vector,5);
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]+" ");
        }
        //Eliminar el ultimo
        int valor=pop(vector);
        System.out.println(valor);

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
    //Funcion pop elimina el ultimo valor del array y devuelve el nuevo array
    public static int pop(int[] array) {
        if (array == null) return -1;
        int valor=array[array.length-1];
        int[] nuevo = new int[array.length - 1];
        for (int i=0;i<nuevo.length;i++){
            nuevo[i]=array[i];
        }
        array=nuevo;
        return valor;
    }
    
}
