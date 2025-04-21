package atividadesLive.attMatheusLeandro;

public class Vendedor extends Funcionario {
    private double salario;

    public Vendedor(String nome, int idade) {
        super(nome, idade);

    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
    }

    @Override
    public double getSalario() {
        double calculoSalario = super.getSalario();
        this.salario = calculoSalario + (calculoSalario * 0.25);
        return this.salario;
    }
}
