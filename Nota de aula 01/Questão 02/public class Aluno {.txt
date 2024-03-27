public class Aluno {
    String nome;
    double nota1,nota2, nota3;
    double media;
    public void somar(){
        media = (nota1 + nota2 + nota3) /3;
        if (media >= 70){
            System.out.println("Aprovado");
        } else if (media < 40) {
            System.out.println("Reprovado");
        } else{
            System.out.println("Você esta na final");
        }
        System.out.println(media);
    }
}