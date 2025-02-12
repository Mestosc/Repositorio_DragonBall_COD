/**
 * Definicion de personaje de un videojuego
 * @author Oscar Rodriguez
 * @version 1.0
 */
public class Personaje {
    private String nombre; // Nombre del personaje
    private int vida; // La vida del personaje

    /**
     * Constructor de los personajes que permite definir el nombre y la vida por defecto
     * @param nombre el nombre del personaje
     * @param vida la vida del personaje
     */
    public Personaje(String nombre, int vida) {
        this.nombre = nombre; // Igualamos nombre a this.nombre que es el nombre definido en la clase
        this.vida = vida; // Hacemos lo mismo con vida
    }

    /**
     * Constructor que solo define el nombre y tiene la vida predefinida
     * @param nombre el nombre que quieres darle al personaje
     */
    public Personaje(String nombre) {
       this(nombre,100);
    }

    /**
     * Construccion de personaje por defecto
     */
    public Personaje() {
        this.nombre = "Mutenroy";
        this.vida = 1000;
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
    public int perderVida(int dano) {
        if (vida>0) {
            if (dano<0) {
                this.vida += dano;
         } else if (dano>vida) {
            this.vida = 0;
        }
        else if (dano<this.vida) {
            this.vida -= dano;
        }
        }
        else {
            this.vida = 0;
        }
        return vida;
    }
}
