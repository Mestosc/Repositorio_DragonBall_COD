/**
 * Definicion de personaje de un videojuego
 * @author Oscar Rodriguez
 * @version 1.0
 */
public class Personaje {
    String nombre; // Nombre del personaje
    int vida; // La vida del personaje

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
}
