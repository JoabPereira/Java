package Questão04;

import Questão04.Animal;

public class Arara extends Animal {
    private int qtdeOvos;

    // Construtor da classe Questão04.Arara
    public Arara(String classe, String locomocao, int qtdeOvos) {
        super(classe, locomocao);
        this.qtdeOvos = qtdeOvos;
    }

    // Método para exibir informações da arara
    @Override
    public void exibirInformacoes() {
        System.out.println("Classe:" + this.getClasse());
        System.out.println("Locomocao: " + this.getLocomocao());
        System.out.println("Qtde de ovos: " + this.qtdeOvos);
    }

    // Métodos getters para acessar os atributos da classe Questão04.Arara
    public int getQtdeOvos() {
        return this.qtdeOvos;
    }
}
