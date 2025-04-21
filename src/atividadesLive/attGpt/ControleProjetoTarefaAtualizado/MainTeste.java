package atividadesLive.attGpt.ControleProjetoTarefaAtualizado;

import java.util.ArrayList;
import java.util.Scanner;

public class MainTeste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Empresa empresa = new Empresa();
        boolean rodando = true;
        do {
            System.out.println("-------- BEM VINDO A NOSSA EMPRESA --------");
            System.out.println("-------- DIGITE UMA OPÇÃO --------");
            System.out.println("1- Cadastrar funcionário");
            System.out.println("2- Cadastrar projeto");
            System.out.println("3- Atribuir tarefa a um projeto");
            System.out.println("4- Atribuir tarefa de um projeto a um funcionário");
            System.out.println("5- Listar tarefas concluidas de um projeto");
            System.out.println("6- Listar tarefas pedentes de um projeto");
            System.out.println("7- Listar todos projetos da empresa");
            System.out.println("8- Marcar tarefa como concluída");
            System.out.println("9- Sair");
            int opcao = input.nextInt();
            input.nextLine();
            switch (opcao){
                case 1:
                    System.out.println("Digite o nome do funcionário: ");
                    String nomeFuncionario = input.nextLine();
                    empresa.cadastrarFuncionario(nomeFuncionario, new ArrayList<>());
                    break;

                case 2:
                    System.out.println("Digite o nome do projeto:");
                    String nomeProjeto = input.nextLine();
                    empresa.cadastrarProjeto(nomeProjeto, new ArrayList<>());
                    break;
                case 3:
                    System.out.println("Escolha em qual projeto deseja atribuir uma tarefa: ");
                    empresa.listarTodosProjetos();
                    int idProjeto = input.nextInt();
                    input.nextLine();
                    System.out.println("Digite o nome da tarefa: ");
                    String nomeTarefa = input.nextLine();
                    System.out.println("Digite a descrição dessa tarefa:");
                    String descricaoTarefa = input.nextLine();
                    empresa.atribuirTarefaProjeto(idProjeto,nomeTarefa,descricaoTarefa);
                    break;
                case 4:
                    System.out.println("Qual projeto desaja pegar a tarefa e atribuir ao funcionário?");
                    empresa.listarTodosProjetos();
                    int idDoProjeto = input.nextInt();
                    input.nextLine();
                    System.out.println("Qual tarefa deseja atribuir ao funcionario?");
                    empresa.listarTodasTarefasDisponiveisDeUmProjeto(idDoProjeto);
                    int idTarefa= input.nextInt();
                    System.out.println("Qual funcionario deseja passar essa tarefa?");
                    empresa.listarFuncionariosDaEmpresa();
                    int idFuncionario = input.nextInt();
                    empresa.atribuirTarefaAUmFuncionario(idDoProjeto, idTarefa,idFuncionario);
                    break;
                case 5:
                    System.out.println("Qual projeto deseja verificar as tarefas concluidas?");
                    empresa.listarTodosProjetos();
                    int idProjet = input.nextInt();
                    empresa.listarTarefaConcluidasDeUmProjeto(idProjet);
                    break;
                case 6:
                    System.out.println("Qual projeto deseja verificar as tarefas pendentes?");
                    empresa.listarTodosProjetos();
                    int idProjetoo = input.nextInt();
                    empresa.listarTarefaPedentesDeUmProjeto(idProjetoo);
                    break;
                case 7:
                    empresa.listarTodosProjetos();
                    break;
                case 8:
                    System.out.println("De qual projeto deseja marcar como concluída?");
                    empresa.listarTodosProjetos();
                    int projetoSelecionado = input.nextInt();
                    System.out.println("Qual da(s) tarefa(s) foi concluída?");
                    empresa.listarTarefaPedentesDeUmProjeto(projetoSelecionado);
                    int tarefaSelecionada = input.nextInt();
                    System.out.println("Qual funcionario concluiu a tarefa?");
                    empresa.listarFuncionariosDaEmpresa();
                    int funcionarioSelecionado = input.nextInt();
                    empresa.marcarTarefaComoConcluida(projetoSelecionado, tarefaSelecionada,funcionarioSelecionado);
                    break;
                case 9:
                    rodando = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA");
                    break;
            }

        }while (rodando);

    }
}
