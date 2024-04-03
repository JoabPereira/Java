package Questão04;

public abstract class Animal {
    // Atributos da classe Questão04.Animal
    private String classe;
    private String locomocao;

    // Construtor da classe Questão04.Animal
    public Animal(String classe, String locomocao) {
        this.classe = classe;
        this.locomocao = locomocao;
    }

    public String getClasse(){
        return classe;
    }

    public String getLocomocao(){
        return locomocao;
    }

    // Método abstrato para exibir informações específicas do animal
    public abstract void exibirInformacoes();
}
