package Questão02;

public class Produto {
    String nome;
    double preco;
    String descricao;

    // Construtor
    public Produto(String nome, double preco, String descricao) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
    }

    // Método para imprimir detalhes do produto
    public void imprimirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Descrição: " + descricao);
    }

}
