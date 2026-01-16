package RPG;

public abstract class personajes {
    protected String nombre;
    protected int vida;

    public personajes(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    abstract int atacar();

    public void recibirDaño(int daño) {
        this.vida = this.vida - daño;
        if (this.vida < 0) this.vida = 0; 
    }
    
    public boolean estaVivo() {
        return this.vida > 0;
    }

    
}
