package Questão03;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ContaCorrente c = new ContaCorrente();
        ContaPoupanca p = new ContaPoupanca();
        System.out.println("Olá, seja bem-vindo(a), qual é o seu nome ?");
        String nome = ler.next();
        c.setTitular(nome);
        p.setTitular(nome);

        String repetir;
        do {
            System.out.println("Selecione o tipo de conta:\n1. Corrente\n2. Poupança");
            int escolha = ler.nextInt();
            double quantiaPoupanca;
            label35:
            switch (escolha) {
                case 1:
                    System.out.println("O que deseja fazer ?\n1. Depositar\n2. Sacar\n3. Usar cheque especial\n4. Exibir dados da conta");
                    int escolhaFiltradaCorrente = ler.nextInt();
                    switch (escolhaFiltradaCorrente) {
                        case 1:
                            System.out.println("Insira a quantia que deseja depositar:");
                            double depositoCorrente = ler.nextDouble();
                            c.setSaldo(c.getSaldo() + depositoCorrente);
                            System.out.println("Depósito realizado com sucesso !");
                            break label35;
                        case 2:
                            System.out.println("Insira a quantia que deseja sacar:");
                            quantiaPoupanca = c.sacar((double)ler.nextInt());
                            if (c.getSaldo() >= quantiaPoupanca) {
                                c.setSaldo(c.getSaldo() - quantiaPoupanca);
                                System.out.println("Saque realizado com sucesso !");
                            } else {
                                System.out.println("Não foi possível realizar o saque, você não tem saldo suficiente");
                            }
                            break label35;
                        case 3:
                            System.out.println("Quanto de cheque especial você deseja ter acesso ?");
                            double concederChequeEspecial = ler.nextDouble();
                            if (concederChequeEspecial <= c.valorChequeEspecial) {
                                c.setValorChequeEspecial(c.valorChequeEspecial - concederChequeEspecial);
                                System.out.println("Valor concedido");
                            } else {
                                System.out.println("Valor negado, seu acesso ao cheque especial atualmente é de R$" + c.valorChequeEspecial);
                            }
                            break label35;
                        case 4:
                            System.out.println(c.exibirDados());
                        default:
                            break label35;
                    }
                case 2:
                    System.out.println("O que deseja fazer ?\n1. Depositar\n2. Sacar\n3. Calcular rendimentos\n4. Exibir dados da conta");
                    int escolhaFiltradaPoupanca = ler.nextInt();
                    switch (escolhaFiltradaPoupanca) {
                        case 1:
                            System.out.println("Insira a quantia que deseja depositar:");
                            double depositoPoupanca = ler.nextDouble();
                            p.setSaldo(p.getSaldo() + depositoPoupanca);
                            System.out.println("Depósito realizado com sucesso !");
                            break;
                        case 2:
                            System.out.println("Insira a quantia que deseja sacar:");
                            quantiaPoupanca = p.sacar((double)ler.nextInt());
                            if (p.getSaldo() >= quantiaPoupanca) {
                                p.setSaldo(p.getSaldo() - quantiaPoupanca);
                                System.out.println("Saque realizado com sucesso !");
                            } else {
                                System.out.println("Não foi possível realizar o saque, você não tem saldo suficiente");
                            }
                            break;
                        case 3:
                            System.out.println(p.calcularRendimento());
                            break;
                        case 4:
                            System.out.println(p.exibirDados());
                    }
            }

            System.out.println("Deseja repetir ? (s/n)");
            repetir = ler.next();
        } while(repetir.equalsIgnoreCase("s"));

    }
}
