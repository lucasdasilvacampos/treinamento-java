package atividadesLive.attGpt.sistemaDeVenda;


public class Vendedor {
    private int idVendedor;
    private String nome;
    private int numeroDeVendas;
    private boolean concluirVenda;


    public Vendedor(int idVendedor, String nome) {
        this.nome = nome;
        this.idVendedor = idVendedor;
        this.concluirVenda = false;
        this.numeroDeVendas = 0;
    }


    @Override
    public String toString() {
        return  "Identificador: "+this.getIdVendedor()+
                ", Nome vendedor: "+ this.getNome()+
                ", Concluiu alguma venda? "+ (this.concluirVenda == true ? "sim" : "não")  +
                ", Numeros de vendas:"+ this.getNumeroDeVendas();
    }

    public String getNome() {
        return nome;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public int getNumeroDeVendas() {
        return numeroDeVendas;
    }

    public void setNumeroDeVendas(int numeroDeVendas) {
        this.numeroDeVendas = numeroDeVendas;
    }

    public boolean isConcluirVenda() {
        this.concluirVenda = true;
        this.numeroDeVendas = ++numeroDeVendas;
        return concluirVenda;
    }
}
