public class Passaro extends Animal implements Vaor {
    public Passaro(String nome){
        super(nome);
    }

    @Override
    public void Voar(){
        System.out.println(nome + " passaro: "+" Vaondo");
    }
}