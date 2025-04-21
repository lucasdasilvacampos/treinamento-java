package atividadesLive.attMatheusLeandro;

public class Telefonista extends Funcionario {
    private double salario;

    public Telefonista(String nome, int idade) {
        super(nome, idade);

    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
    }


    @Override
    public double getSalario() {
        double calculoSalario = super.getSalario();
        this.salario = calculoSalario + (calculoSalario * 0.10);
        return this.salario;
    }
}
