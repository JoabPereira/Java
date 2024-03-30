package Questão03;
public class ContaCorrente extends ContaBancaria {
    public double valorChequeEspecial = 1000.0;

    public ContaCorrente() {
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getValorChequeEspecial() {
        return this.valorChequeEspecial;
    }

    public void setValorChequeEspecial(double valorChequeEspecial) {
        this.valorChequeEspecial = valorChequeEspecial;
    }

    public double depositar(double x) {
        return x;
    }

    public double sacar(double x) {
        return x;
    }

    public double chequeEspecial(double x) {
        return this.valorChequeEspecial;
    }

    public String exibirDados() {
        String var10000 = this.getTitular();
        return "Titular: " + var10000 + "\nSaldo: " + this.getSaldo() + "\nCheque Especial:" + this.valorChequeEspecial;
    }
}
