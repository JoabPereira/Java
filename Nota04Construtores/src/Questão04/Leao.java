package Questão04;

import Questão04.Animal;

public class Leao extends Animal {
    private String pelo;

    // Construtor da classe Questão04.Leao
    public Leao(String classe, String locomocao, String pelo) {
        super(classe, locomocao);
        this.pelo = pelo;
    }

    // Método para exibir informações do leão
    public void exibirInformacoes() {
        System.out.println("Classe: " + this.getClasse());
        System.out.println("Locomocao: " + this.getLocomocao());
        System.out.println("Pelo: " + this.pelo);
    }
}
