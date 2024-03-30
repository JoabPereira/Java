package Questão01;
public class Diretor extends Funcionario {
    private int acoes;

    public Diretor(String nome, double salario, int acoes) {
        super(nome, salario);
        this.acoes = acoes;
    }
}