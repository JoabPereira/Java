public class Funcionario {

    /* Variaveis privadas*/
    private double valorHora, salario;
    private int horasTrabalhadas;

    /* Realizando o set */
    public void setValorHora(double valorHora){
        this.valorHora = valorHora;
    }
    public void setHorasTrabalhadas(int horasTrabalhadas){
        this.horasTrabalhadas = horasTrabalhadas;
    }

    /* Realizando o get */
    public double getValorHora(){
        return valorHora;
    }
    public int getHorasTrabalhadas(){
        return horasTrabalhadas;
    }

    /* Criando o metodo de calculo */
    public void calcularSalario(){
        salario = valorHora * horasTrabalhadas;
        System.out.println("O salario do funcionario é: " + salario);
    }
}
