package Questão04;

public class Main {
    public static void main(String[] args) {
        Leao leao = new Leao("Mamífero", "Patas", "Juba");
        Arara arara = new Arara("Ave", "Asas", 1);

        System.out.println("Informações do Questão04.Leao:");
        leao.exibirInformacoes();

        System.out.println("Informações da Questão04.Arara:");
        arara.exibirInformacoes();
    }
}