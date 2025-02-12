
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Dragon Ball!");
        Personaje personaje1 = new Personaje();
        System.out.println("Hola " + personaje1.getNombre());
        Personaje personaje2 = new Personaje("Goku");
        System.out.println(personaje2.getNombre() + personaje2.perderVida(3));
    }
}