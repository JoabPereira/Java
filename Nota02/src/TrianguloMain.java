import java.util.Scanner;

public class TrianguloMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Triangulo t = new Triangulo();

        System.out.println("Digite os valores para formar um traingulo 'Equilátero', 'Isóscelis', 'Escaleno': ");
        System.out.println("Digite o primeiro valor:");
        t.setL1(sc.nextInt());
        System.out.println("Digite o segundo valor:");
        t.setL2(sc.nextInt());
        System.out.println("Digite o terceiro valor:");
        t.setL3(sc.nextInt());

        t.lados();
    }
}
