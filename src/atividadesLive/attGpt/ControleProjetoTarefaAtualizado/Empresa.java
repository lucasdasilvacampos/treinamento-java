package atividadesLive.attGpt.ControleProjetoTarefaAtualizado;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Funcionario> funcionarios;
    private ArrayList<Projeto> projetos;
    private int contadorFuncionario = 0;
    private int contadorProjeto = 0;

    public Empresa() {
        this.funcionarios = new ArrayList<>();
        this.projetos = new ArrayList<>();
    }

    public void cadastrarFuncionario(String nome, ArrayList<Tarefa> tarefas) {
        int novoId = ++contadorFuncionario;
        Funcionario funcionario = new Funcionario(novoId, nome, tarefas);

        this.funcionarios.add(funcionario);
        System.out.println("Funcionário cadastrado na empresa 🤠👍");
    }

    public void cadastrarProjeto(String nome, ArrayList<Tarefa> tarefas) {
        int novoId = ++contadorProjeto;
        Projeto projeto = new Projeto(novoId, nome, tarefas);

        this.projetos.add(projeto);
        System.out.println("Projeto cadastrado com sucesso 🤠👍");
    }

    public Projeto buscarProjetoId(int idProjeto) {
        return this.projetos.stream()
                .filter(projeto -> projeto.getIdProjeto() == idProjeto)
                .findFirst()
                .orElse(null);

    }

    public Funcionario buscarFuncionarioId(int idFuncionario) {
        return this.funcionarios.stream()
                .filter(funcionario -> funcionario.getIdFuncionario() == idFuncionario)
                .findFirst()
                .orElse(null);

    }

    public void atribuirTarefaProjeto(int idProjeto, String nome, String descricao) {
        Projeto projeto = buscarProjetoId(idProjeto);
        if (projeto == null) {
            System.out.println("Projeto não encontrado ❌");
            return;
        }
        projeto.criarTarefa(nome, descricao);
        System.out.println("Tarefa atribuida ao projeto 👍🤠");
    }

    public void atribuirTarefaAUmFuncionario(int idProjeto, int idTarefa, int idFuncionario) {
        Projeto projeto = buscarProjetoId(idProjeto);
        Tarefa tarefa = projeto.buscarTarefaId(idTarefa);
        Funcionario funcionario = buscarFuncionarioId(idFuncionario);
        if (tarefa == null) {
            System.out.println("Não existe esta tarefa ❌");
            return;
        }
        System.out.println("Tarefa atribuída ao funcionário 🤠👍");
        funcionario.setTarefa(tarefa);
    }

    public void listarTodosProjetos() {
        System.out.println("----------LISTA DE TODOS PROJETOS----------");
        for (Projeto projeto : this.projetos) {
            if (projeto != null) {
                System.out.println("Id:" + projeto.getIdProjeto() + " Nome: " + projeto.getNome());
            } else {
                System.out.println("A empresa ainda não possui projetos ❌");
                break;
            }
        }
    }

    public void listarTarefaPedentesDeUmProjeto(int idProjeto) {
        Projeto projeto = buscarProjetoId(idProjeto);
        if (projeto == null) {
            System.out.println("Não existe esse projeto ❌");
            return;
        }
        System.out.println("---------- Lista de tarefa(s) pedentes deste projeto ----------");
        for (Tarefa tarefa : projeto.getTarefas()) {
            if (!tarefa.isConcluida()) {
                tarefa.mostrarDetalhe();
            }
        }
    }

    public void listarTarefaConcluidasDeUmProjeto(int idProjeto) {
        Projeto projeto = buscarProjetoId(idProjeto);
        if (projeto == null) {
            System.out.println("Não existe esse projeto ❌");
            return;
        }
        if (!projeto.anyTarefasConcluidas()) {
            System.out.println("Nenhuma tarefa está concluída ❌");
            return;
        }
        System.out.println("---------- Lista de tarefa(s) concluidas deste projeto ----------");
        for (Tarefa tarefa : projeto.getTarefas()) {
            if (tarefa.isConcluida()) {
                tarefa.mostrarDetalhe();
            }
        }
    }

    public void listarTodasTarefasDisponiveisDeUmProjeto(int idProjeto) {
        Projeto projeto = buscarProjetoId(idProjeto);
        for (Tarefa tarefa : projeto.getTarefas()) {
            if (tarefa.isDisponivel()) {
                tarefa.mostrarDetalhe();
            }
        }
    }

    public void listarFuncionariosDaEmpresa() {
        for (Funcionario funcionario : this.funcionarios) {
            System.out.println("Id: " + funcionario.getIdFuncionario() + " Nome: " + funcionario.getNome());
        }

    }

    public void marcarTarefaComoConcluida(int idProjeto, int idTarefa, int idFuncionario) {
        Projeto projeto = buscarProjetoId(idProjeto);
        Funcionario funcionario = buscarFuncionarioId(idFuncionario);
        Tarefa tarefa = projeto.buscarTarefaId(idTarefa);
        tarefa.setConcluida();
        System.out.println("Tarefa concluída 👍🤠");
    }

    public ArrayList<Projeto> getProjetos() {
        return projetos;
    }
}
