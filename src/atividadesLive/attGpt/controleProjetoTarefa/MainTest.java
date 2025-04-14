package atividadesLive.attGpt.controleProjetoTarefa;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Empresa empresa = new Empresa();
        boolean rodando = true;
        do {
            System.out.println("BEM VINDO AO MENU DA EMPRESA");
            System.out.println("ESCOLHA UMA DAS OPÇÕES ABAIXO:");
            System.out.println("1-Cadastrar funcionário");
            System.out.println("2-Criar projeto");
            System.out.println("3-Criar tarefa em um projeto");
            System.out.println("4-Atribuir tarefa a funcionário");
            System.out.println("5-Marcar tarefa como concluída");
            System.out.println("6-Listar tarefas de um projeto");
            System.out.println("7-Listar tarefas pendentes de um projeto");
            System.out.println("8-Listar tarefas de um funcionário");
            System.out.println("9-Listar todos os projetos");
            System.out.println("0-Sair");
            int opcao = input.nextInt();
            input.nextLine();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome: ");
                    String nome = input.nextLine();
                    empresa.cadastrarFuncionario(nome);
                    break;
                case 2:
                    System.out.println("Digite o nome do projeto:");
                    String nomeP = input.nextLine();
                    empresa.criarProjeto(nomeP);
                    break;
                case 3:
                    System.out.println("Qual projeto deseja adicionar tarefa?");
                    empresa.listarProjetos();
                    int projetoE = input.nextInt();
                    input.nextLine();
                    System.out.println("Digite a tarefa");
                    String tarefa = input.nextLine();
                    empresa.getProjetos().get(projetoE - 1).adicionarTarefa(tarefa);
                    break;
                case 4:
                    System.out.println("Qual funcionário deseja atribuir uma tarefa? ");
                    empresa.listarFuncionarios();
                    int escolhaF = input.nextInt();
                    System.out.println("Escolha a tarefa que deseja atribuir ao funcionário");
                    empresa.listarTarefas();
                    int escolhaT = input.nextInt();
                    empresa.adicionarTarefaAoFuncionario(escolhaF, escolhaT);
                    break;
                case 5:
                    System.out.println("Qual projeto deseja marcar uma tarefa como concluída?");
                    empresa.listarProjetos();
                    int resposta = input.nextInt();
                    System.out.println("Qual tarefa foi concluida?");
                    empresa.listarTarefas();
                    int tarefaC = input.nextInt();
                    empresa.concluirTarefa(resposta, tarefaC);
                    break;
                case 6:
                    System.out.println("Qual projeto deseja listar tarefas?");
                    empresa.listarProjetos();
                    int respostaP = input.nextInt();
                    empresa.listarTarefas();
                    break;
                case 7:
                    empresa.listarTarefasPendentes();
                    break;
                case 8:
                    System.out.println("Qual funcionario deseja listar tarefa?");
                    empresa.listarFuncionarios();
                    int funcionarioL = input.nextInt();
                    empresa.getFuncionarios().get(funcionarioL - 1).listarTarefas();
                    break;
                case 9:
                    empresa.listarProjetos();
                    break;
                case 0:
                    rodando = false;
                    System.out.println("Encerrando menu...⭕");
                    break;
                default:
                    System.out.println("Escolha uma opção válida");
                    break;
            }

        } while (rodando);
    }
}
