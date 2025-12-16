public class Personaje {

     String nombre;
     int vida;
     int defensa;
     int ataque;
     Raza raza;

    
    public Personaje(){

    }
    
    public Personaje(String nombre, int vida, int defensa, int ataque, Raza raza) {
        this.nombre = nombre;
        this.vida = vida;
        this.defensa = defensa;
        this.ataque = ataque;
        this.raza = raza;
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


    public int getDefensa() {
        return defensa;
    }


    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }


    public int getAtaque() {
        return ataque;
    }


    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }


    public Raza getRaza() {
        return raza;
    }


    public void setRaza(Raza raza) {
        this.raza = raza;
    }



    public int atacar(Personaje enemigo) {
        
        int dañoBase = this.ataque;
        int dañoFinal = dañoBase - enemigo.getDefensa();

        enemigo.recibirDaño(dañoFinal);
        return dañoFinal;
    }

    
    public void recibirDaño(int daño) {
        this.vida = this.vida - daño;
        if (this.vida < 0) this.vida = 0; 
    }


    public boolean estaVivo() {
        return this.vida > 0;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + 
                ", tipo=" + raza +
                ", vida=" + vida +
                ", ataque=" + ataque +
                ", defensa=" + defensa +
                '}';
    }
  
}
