
public class Main {
    public static void main(String[] args) {
        Personaje personaje1 = new Personaje("Goku",-12);
        Personaje personaje2 = new Personaje("Gokud",1000);
        Personaje personaje3 = new Personaje("Goku",0);
        Personaje personaje4 = new Personaje("Goku",100);
        System.out.println(personaje1.perderVida(2000));
        System.out.println(personaje2.perderVida(4000));
        System.out.println(personaje4.perderVida(-1000));
        System.out.println(personaje3.perderVida(-231));
    }
}