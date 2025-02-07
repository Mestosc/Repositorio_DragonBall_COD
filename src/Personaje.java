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
        this.nombre = nombre;
        this.vida = vida;
    }

    /**
     * Construccion de personaje por defecto
     */
    public Personaje() {
        this.nombre = "Mutenroy";
        this.vida = 1000;
    }
}
