/* Importando teclado */
import java.util.Scanner;

/* Configurando a Main principal */
public class MaçaMain {
    public static void main(String[] args){

        /* Chamando o import do teclado */
        Scanner sc = new Scanner(System.in);

        /* Chamando a Class "CalculandoMaça" */
        CalculoMaça c = new CalculoMaça();

        /* Fazendo uma pergunta para o usuario utilizando o teclado sc */
        System.out.println("Quantas maças você quer comprar? ");
        c.setQuantidade(sc.nextInt());

        /* Imprimindo o resuntado de "CalculoMaça" */
        c.Calculo();
    }
}
