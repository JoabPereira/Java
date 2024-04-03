package Questão01;
import java.util.SimpleTimeZone;

public class Aluno extends Pessoa {

    private int matricula;

    public Aluno(String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public void ExibicaoA(){
    System.out.println("Nome do aluno: " + nome + "," + " idade: " + idade + "," + " matricula: " + matricula);
    }
}