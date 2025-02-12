
public class Main {
    public static void main(String[] args) {
        Personaje personaje1 = new Personaje("Goku",-12);
        Personaje personaje2 = new Personaje("Gokud",1000);
        Personaje personaje3 = new Personaje("Goku",0);
        Personaje personaje4 = new Personaje("Goku",100);
        // Test1
        int vidaPerdida = personaje1.perderVida(-2000);
        if (vidaPerdida==2012)  System.out.println("Ok");
        else System.out.println("Fallo");
        // Test2
        vidaPerdida = personaje2.perderVida(-2000);
        if (vidaPerdida==1000)  System.out.println("Ok");
        else System.out.println("Fallo");
        // Test3
        System.out.println(personaje2.perderVida(4000));
        System.out.println(personaje4.perderVida(-1000));
        System.out.println(personaje3.perderVida(-231));
    }
}