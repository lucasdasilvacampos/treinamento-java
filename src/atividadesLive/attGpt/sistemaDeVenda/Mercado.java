package atividadesLive.attGpt.sistemaDeVenda;


import java.util.ArrayList;

public class Mercado {
    ArrayList<Produto> produtos;
    ArrayList<Vendedor> vendedores;
    private int contatador = 0;
    private int contatadorIdVendedor = 0;

    public Mercado() {
        this.produtos = new ArrayList<>();
        this.vendedores = new ArrayList<>();
    }

    public void cadastrarVendedores(String nomeVendedor){
        int idVendedor = ++contatadorIdVendedor;
        Vendedor vendedor = new Vendedor(idVendedor, nomeVendedor);
        vendedores.add(vendedor);
        System.out.println("Vendedor contratado para o mercado 🤠👍");
    }

    public void cadastrarProdutos(String nomeProduto, double precoProduto, int estoqueProduto){
       int novoCodigo = ++contatador;
        Produto produto = new Produto(novoCodigo, nomeProduto, precoProduto, estoqueProduto);
        produtos.add(produto);
        System.out.println("Produto adicionado ao mercado 🤠👍");
    }

    public void listarVendedores(){
        if (vendedores.isEmpty()){
            System.out.println("Sem vendedores no mercado ❌");
            return;
        }
        System.out.println("-----------| Lista vendedores |-----------");
        for (Vendedor vendedor : vendedores) {
            System.out.println(vendedor);
        }
    }

    public void listarProdutos(){
        if (produtos.isEmpty()){
            System.out.println("Sem produtos no mercado ❌");
            return;
        }
        System.out.println("-----------| Lista de Produtos |-----------");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    public Vendedor buscarVendedorId(int idVendedor){
        return this.vendedores.stream()
                .filter(vendedor -> vendedor.getIdVendedor() == idVendedor)
                .findFirst()
                .orElse(null);
    }

    public Produto buscarProdutoCodigo(int codigoProduto){
        return this.produtos.stream()
                .filter(produto -> produto.getCodigo() == codigoProduto)
                .findFirst()
                .orElse(null);
    }

    public void concluirVenda(int idVendedor, int codigoProduto, int numeroVendaProduto){
        Vendedor vendedor = buscarVendedorId(idVendedor);
        Produto produto = buscarProdutoCodigo(codigoProduto);
        if (vendedor == null){
            System.out.println("Não tem vendedor no mercado para concluir a venda ❌");
            return;
        }
        if (produto == null){
            System.out.println("Não tem este produto no mercado ❌");
            return;
        }
        if (produto.getEstoque() < numeroVendaProduto){
            System.out.println("Não tem estoque suficiente para efetuar esse numero de vendas ❌");
            return;
        }
        produto.setEstoque(numeroVendaProduto);
        vendedor.isConcluirVenda();
        System.out.println("O vendedor: "+ vendedor.getNome());
        System.out.println("Efetuou a venda do produto: "+ produto.getNome());
    }

    public void listarVendasDeUmVendedor(int idDoVendedor){
        Vendedor vendedor = buscarVendedorId(idDoVendedor);
        if (vendedor == null){
            System.out.println("Não tem este vendedor no mercado ❌");
            return;
        }
        if (vendedor.getNumeroDeVendas() == 0){
            System.out.println("Este vendedor não efetuou nenhuma venda ❌");
            return;
        }
        System.out.println("Numeros de venda do: "+vendedor.getNome() + " Nº vendas: "+vendedor.getNumeroDeVendas());
    }
}
