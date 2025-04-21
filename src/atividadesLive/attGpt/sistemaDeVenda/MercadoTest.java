package atividadesLive.attGpt.sistemaDeVenda;


import java.util.Scanner;

public class MercadoTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mercado mercado = new Mercado();

        boolean rodando = true;
        do {
            System.out.println("---------- | BEM VINDO AO MENU DO MERCADO JAVANTAS | ----------");
            System.out.println("1- Cadastrar Produto");
            System.out.println("2- Cadastrar Vendedor");
            System.out.println("3- Listar Vendedores");
            System.out.println("4- Listar Produtos");
            System.out.println("5- Concluir Venda");
            System.out.println("6- Sair");
            int opcao = input.nextInt();
            input.nextLine();
            switch (opcao){
                case 1:
                    System.out.println("Digite o nome do produto:");
                    String nomeProduto = input.nextLine();
                    System.out.println("Digite o preço produto:");
                    double precoProduto = input.nextDouble();
                    System.out.println("Digite o estoque do produto:");
                    int estoqueProduto = input.nextInt();
                    input.nextLine();
                    mercado.cadastrarProdutos(nomeProduto,precoProduto,estoqueProduto);
                    break;
                case 2:
                    System.out.println("Digite o nome do vendedor:");
                    String nomeVendedor = input.nextLine();
                    mercado.cadastrarVendedores(nomeVendedor);
                    break;
                case 3:
                    mercado.listarVendedores();
                    break;
                case 4:
                    mercado.listarProdutos();
                    break;
                case 5:
                    System.out.println("Qual o vendedor que efetuou a venda?");
                    mercado.listarVendedores();
                    int identificadorVendedor = input.nextInt();
                    System.out.println("Qual dos produtos ele efetuou a venda?");
                    mercado.listarProdutos();
                    int codigoProduto = input.nextInt();
                    System.out.println("Quantos deste produto ele vendeu?");
                    int numeroDeVenda = input.nextInt();
                    mercado.concluirVenda(identificadorVendedor,codigoProduto,numeroDeVenda);
                    break;
                case 6:
                    rodando = false;
                    System.out.println("Encerrando menu...");
                    break;
                default:
                    System.out.println("Opção inválida verifique novamente");
                    break;
            }
        }while(rodando);

    }
}
