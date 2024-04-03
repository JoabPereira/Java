package Questão03;

public class Carro extends Veiculo {
    private String modelo;
    public Carro(String marca, String modelo) {
        super(marca); // Calling the superclass constructor
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void mostrarDetalhes() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
    }
}
