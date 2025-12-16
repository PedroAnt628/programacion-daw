package clases;

public class libro {
    //Atributos
    private String isbn;
    private String titulo;
    private int anyo;
    private double precio;
    private editorial editorial;

    //Constructor
    public libro(){

    }
    public libro(String titulo, int anyo, double precio, String isbn){
        this.isbn=isbn;
        this.titulo=titulo;
        this.anyo=anyo;
        this.precio=precio;
    }

    //Métodos get y set
    public void setIsbn(String isbn){
        this.isbn=isbn;
    }
    public String getIsbn(){
        return this.isbn;
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public void setAnyo(int anyo){
        this.anyo=anyo;
    }
    public int getAnyo(){
        return this.anyo;
    }
    public void setPrecio(double precio){
        this.precio=precio;
    }
    public double getPrecio(){
        return this.precio;
    }
    public void setEditorial(editorial editorial){
        //Referencia
        this.editorial=editorial;
        //Copia
        // this.editorial = new editorial();
        // this.editorial.setCodigo(editorial.getCodigo());
        // this.editorial.setNombre(editorial.getNombre());
        // this.editorial.setAnyo(editorial.getAnyo());
        
    }
    public editorial getEditorial(){
        return this.editorial;
    }
    
    public void imprimeLibro(){
        System.out.println("Título del libro: " + this.titulo);
        System.out.println("Año del libro: " + this.anyo);
        System.out.println("Precio del libro: " + this.precio);
        System.out.println("El isbn es: " + this.isbn);

        if (editorial != null)

        this.editorial.ImprimeEditorial();

    }


}
