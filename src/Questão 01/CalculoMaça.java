public class CalculoMaça {
    /* Declarando variáveis */
    private int quantidade;
    private double custo;
    private double valor1 = 1.30;
    private double valor2 = 1.00;

    /* Utilizando set */
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

     /* Utilizando get */
    public int getQuantidade(){
        return quantidade;
    }

    /* Realizando a lógica do programa */
    public void Calculo(){
        if (quantidade < 12){
            System.out.println(quantidade + " maças, custa: " + valor1 * quantidade);
        } else {
            System.out.println(quantidade + " maças custa: " + valor2 * quantidade);
        }
    }
}

