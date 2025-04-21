package atividadesLive.attGpt.sistemaDeVenda;

public class Produto {
    private int codigo;
    private String nome;
    private double preco;
    private int estoque;

    public Produto(int codigo, String nome, double preco, int estoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return "Codigo: "+ this.getCodigo() +
                ", Nome: "+this.getNome() +
                ", Preço: "+this.getPreco()+
                ", Estoque: "+this.getEstoque();
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int numeroVendasProduto) {
        this.estoque -= numeroVendasProduto;
    }
}
