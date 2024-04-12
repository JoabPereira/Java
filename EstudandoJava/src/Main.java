import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    Gato g = new Gato("Joab");
    Cachorro c = new Cachorro("Francisco");
    Passaro p = new Passaro("Chico");

    g.emitirSom();
    g.Correr();

    c.emitirSom();
    c.Correr();

    p.emitirSom();
    p.Voar();
    }
}