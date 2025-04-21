package atividadesLive.attMatheusLeandro;
/*
Uma empresa possui definido o seu escopo organizacional um padrão para pagamento de salário.
Todos os funcionários recebem R$ 2.000,00 de salário líquido mais um acréscimo por cargo exercido.
0 Gerente recebe o salário liquido mais 45%. A Telefonista recebe o salário líquido mais 10%.
O Vendedor recebe o salário líquido mais 25%.

a) Sua tarefa é construir o programa "Folha de Pagamento" para realizar o cálculo da folha,
conforme os cargos citados anteriormente.

b) Analise no diagrama abaixo os objetos Gerente, Telefonista e Vendedor verificando suas dependências
relacionadas a herança identificando o que deve ser alterado nestes objetos para permitir que a folha
de pagamento seja gerada com os percentuais solicitados.
 */

public class Funcionario {
    private String nome;
    private int idade;
    private double salario;

    public Funcionario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.salario = 2000.00;
    }

   public void exibirInfo(){
       System.out.println("Nome: "+ this.getNome());
       System.out.println("Idade: "+ this.getIdade());
       System.out.println("Salario: "+ this.getSalario());
   }

    public double getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
