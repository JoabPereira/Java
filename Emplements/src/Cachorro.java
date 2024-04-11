public class Cachorro extends Animal implements Animais {
    public Cachorro(String nome){
        super(nome);
    }

    @Override
    public void emitirSom(){
        System.out.println(nome + " cachorro: " + " Lati");
    }
}