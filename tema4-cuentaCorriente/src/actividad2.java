public class actividad2 {
    public static void main(String[] args) {
        Persona cliente=new Persona("Paco","123789456Q","11/11/2014","Avenida Siempre Viva 123",true,true);
        Cuenta cuentaBancaria = new Cuenta("432552435245243545",2000,cliente);

        cliente.imprimePersona();
        System.out.println();
        cuentaBancaria.imprimeCuenta();
    }
}
