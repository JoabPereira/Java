import javax.swing.*;
import java.util.Scanner;

public class QuantidadeMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Estoque e = new Estoque();

        System.out.println("Quantidade atual em estoque? ");
        e.setEstoque(sc.nextInt());
        System.out.println("Quantidade minima em estoque? ");
        e.setQuantidademin(sc.nextInt());
        System.out.println("Quantidade máxima em estoque? ");
        e.setQuantidademax(sc.nextInt());

        e.emEstoque();
    }
}
