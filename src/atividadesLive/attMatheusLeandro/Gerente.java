package atividadesLive.attMatheusLeandro;

public class Gerente extends Funcionario {
    private double salario;

    public Gerente(String nome, int idade) {
        super(nome, idade);
    }

    public double getSalario() {
        double calculoSalario = super.getSalario();
        this.salario = calculoSalario + (calculoSalario * 0.45);
        return this.salario;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
    }
}
