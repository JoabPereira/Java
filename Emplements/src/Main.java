public class Main {
    public static void main(String[] args){
        Gato gato = new Gato("Francisco");
        Cachorro cachorro = new Cachorro("Toin");
        Passaro passaro = new Passaro("Pica pau");

        gato.emitirSom();
        cachorro.emitirSom();
        passaro.Voar();
    }
}