package Questão01;

import Questão01.Pessoa;

public class Professor extends Pessoa {

    private double salario;

    public Professor (String nome, int idade, double salario) {
        super(nome,idade);
        this.salario = salario;
    }

    public void ExibicaoP(){
        System.out.println("Nome do professor: " +  nome + "," + " idade: " + idade + "," + " salario: " + salario);
    }
}
