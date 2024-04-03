package Questão02;

public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto("camisa", 49.99, "camisa polo azul");
        Produto produto2 = new Produto("calça", 99.99, "calça jeans preta");

        // Imprimir detalhes dos produtos

        System.out.println("Detalhes do Questão02.Produto 1:");
        produto1.imprimirDetalhes();

        System.out.println("\nDetalhes do Questão02.Produto 2:");
        produto2.imprimirDetalhes();
    }
}