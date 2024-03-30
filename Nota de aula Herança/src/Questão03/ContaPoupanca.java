package Questão03;
public class ContaPoupanca extends ContaBancaria {
    double rendimento;

    public ContaPoupanca() {
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

    public double depositar(double x) {
        return x;
    }

    public double sacar(double x) {
        return x;
    }

    public double calcularRendimento() {
        if (this.selic > 8.5) {
            this.rendimento = 0.005 * this.saldo;
        } else {
            this.rendimento = 0.007 * this.selic * this.saldo;
        }

        return this.rendimento;
    }

    public String exibirDados() {
        String var10000 = this.getTitular();
        return "Titular: " + var10000 + "\nSaldo: " + this.getSaldo();
    }
}
