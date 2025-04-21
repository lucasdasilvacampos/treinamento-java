package atividadesLive.attMatheusLeandro;

public class FolhaPagamento {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Leandro", 38);

        Telefonista telefonista = new Telefonista("Marcos", 20);

        Vendedor vendedor = new Vendedor("Lucas", 20);
        System.out.println("| Gerente |");
        gerente.exibirInfo();
        System.out.println("---------------");
        System.out.println("| Telefonista |");
        telefonista.exibirInfo();
        System.out.println("---------------");
        System.out.println("| Vendedor |");
        vendedor.exibirInfo();


    }
}
