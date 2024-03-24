public class Estoque {
   private int estoque, quantidademin, quantidademax, quantidademedia;

    public void setQuantidademin(int quantidademin){
        this.quantidademin =quantidademin;
    }
    public void setQuantidademax(int quantidademax){
        this.quantidademax = quantidademax;
    }
    public void setQuantidademedia(int quantidademedia){
        this.quantidademedia = quantidademedia;
    }
    public void setEstoque(int estoque){
        this.estoque = estoque;
    }

    public int getEstoque(){
        return estoque;
    }
    public int getQuantidademedia(){
        return quantidademedia;
    }
    public int getQuantidademin(){
        return quantidademin;
    }
    public int getQuantidademax(){
        return quantidademax;
    }

    public void emEstoque(){

        quantidademedia = quantidademax + quantidademin / 2;

        if (estoque >= quantidademedia){
            System.out.println("Não efetuar compra ");
        } else {
            System.out.println("Efetuar compra");
        }
    }


}
