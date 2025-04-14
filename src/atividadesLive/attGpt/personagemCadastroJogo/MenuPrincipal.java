package atividadesLive.attGpt.personagemCadastroJogo;

import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Personagem personagem;
        Jogo jogo = new Jogo();
        boolean rodando = true;

        do {
            System.out.println("---------- | BEM VINDO AO JOGO | ----------");
            System.out.println("DIGITE UMA DAS OPÇÕES ABAIXO:");
            System.out.println("1- Cadastrar personagem");
            System.out.println("2- Cadastrar vários personagem");
            System.out.println("3- Listar personagens");
            System.out.println("4- Buscar personagens por classe");
            System.out.println("0- Sair");
            int opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do personagem:");
                    input.nextLine();
                    String nome = input.nextLine();
                    System.out.println("Digite a classe do personagem:");
                    String classe = input.nextLine();
                    System.out.println("Digite o nível do personagem:");
                    int nivel = input.nextInt();
                    personagem = new Personagem(nome,classe,nivel);
                    jogo.adicionarPersonagem(personagem);
                    break;
                case 2:
                    System.out.println("Digite um numero de personagens que deseja adicionar:");
                    int quantidade = input.nextInt();
                    input.nextLine();
                    Personagem[] personagems = new Personagem[quantidade];
                    for (int i = 0; i < quantidade; i++) {
                        System.out.println("Digite o nome do personagem:");
                        String nomeP = input.nextLine();
                        System.out.println("Digite a classe do personagem:");
                        String classeP = input.nextLine();
                        System.out.println("Digite o nível do personagem:");
                        int nivelP = input.nextInt();
                        input.nextLine();
                        personagems[i] = new Personagem(nomeP,classeP,nivelP);
                    }
                    jogo.adicionarPersonagem(personagems);
                    break;
                case 3:
                    if (jogo.getPersonagens() == null){
                        System.out.println("Sem personagens cadastrados ❌");
                        break;
                    }
                    jogo.listarPersonagens();
                    break;
                case 4:
                    System.out.println("Digite a classe do Personagem:");
                    input.nextLine();
                    String classeB = input.nextLine();
                    jogo.buscarPersonagem(classeB);
                    break;

                case 0:
                    rodando = false;
                    System.out.println("Fechando jogo...⭕");

            }
        } while (rodando);
    }
}
