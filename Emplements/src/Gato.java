public class Gato extends Animal implements Animais{
    public Gato(String nome){
        super(nome);
    }

    @Override
    public void emitirSom(){
        System.out.println(nome + " gato: "+" Mia");
    }
}