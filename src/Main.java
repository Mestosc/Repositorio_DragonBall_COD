
public class Main {
    public static void main(String[] args) {
        Personaje personaje1 = new Personaje("Goku",100);
        Personaje personaje2 = new Personaje("Gokud",1000);
        Personaje personaje3 = new Personaje("Goku",4000);
        Personaje personaje4 = new Personaje("Goku",0);
        // Test1
        int dano2 = -100;
        int vidaPerdida = personaje2.perderVida(dano2);
        if (vidaPerdida==900)  System.out.println("Ok");
        else System.out.println("Fallo");
        // Test2
        vidaPerdida = personaje1.perderVida(dano2);
        if (vidaPerdida==0)  System.out.println("Ok");
        else System.out.println("Fallo");
        // Test3
        vidaPerdida = personaje3.perderVida(dano2);
        if (vidaPerdida==3900)  System.out.println("Ok");
        else System.out.println("Fallo");
        // Test 4
        vidaPerdida = personaje4.perderVida(dano2);
        if (vidaPerdida==0)  System.out.println("Ok");
        else System.out.println("Fallo");
    }
}