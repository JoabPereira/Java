import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Funcionario f = new Funcionario();

        /* Pedindo inforamações aao usuario usando teclado sc*/
        System.out.println("Digite o valor da hora trabalhada:");
        f.setValorHora(sc.nextDouble());

        System.out.println("Digite a quantidade de horas trabalhadas:");
        f.setHorasTrabalhadas(sc.nextInt());

        /* imprimindo o resultado feito no metodo "calclarSalario()" da class Funcionario */
        f.calcularSalario();
        System.out.println("O valor da hora: " + f.getValorHora() + " Trabalhando " + f.getHorasTrabalhadas() + " horas");
    }
}