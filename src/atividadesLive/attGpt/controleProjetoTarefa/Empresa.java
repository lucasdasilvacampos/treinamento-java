package atividadesLive.attGpt.controleProjetoTarefa;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Funcionario> funcionarios;
    private ArrayList<Projeto> projetos;

    public Empresa() {
        this.funcionarios = new ArrayList<>();
        this.projetos = new ArrayList<>();
    }

    public void cadastrarFuncionario(String nome) {
        Funcionario p = new Funcionario(nome, getFuncionarios());
        if (this.funcionarios.stream().anyMatch(funcionario -> funcionario.equals(p))) {
            System.out.println("Este funcionário já está na empresa ❌");
            return;
        }
        System.out.println("Funcionário adicionado a empresa, seja bem vindo 👍🤠");
        this.funcionarios.add(p);
    }

    public void criarProjeto(String nomeP) {
        Projeto p = new Projeto(nomeP, getProjetos());
        if (this.projetos.stream().anyMatch(projeto -> projeto.equals(p))) {
            System.out.println("Este projeto já está na empresa ❌");
            return;
        }
        System.out.println("Projeto adicionado a empresa, boa sorte 👍🤠");
        this.projetos.add(p);
    }

    public void buscarFuncionario(int id) {
        for (Funcionario funcionario : this.funcionarios) {
            if (this.funcionarios.stream().anyMatch(funcionario1 -> funcionario1.getId() == id)) {
                System.out.println("Funcionario: " + funcionario.getNome());
                break;
            }
        }

    }

    public void buscarProjeto(int id) {
        for (Projeto projeto : this.projetos) {
            if (this.projetos.stream().anyMatch(projeto1 -> projeto1.getId() == id)) {
                System.out.println("Funcionario: " + projeto.getNome());
                break;
            }
        }
    }

    public void listarProjetos() {
        if (this.projetos.isEmpty()) {
            System.out.println("Ainda não temos projetos na empresa ❌");
            return;
        }
        System.out.println("Lista de Projeto(s) 📋");
        for (Projeto projeto : this.projetos) {
            System.out.println(projeto.getId() + "- " + "nome projeto: " + projeto.getNome());
        }
    }

    public void listarFuncionarios() {
        if (this.funcionarios.isEmpty()) {
            System.out.println("Ainda não temos funcionários suficientes 😒");
            return;
        }
        System.out.println("Lista de funcionário(s) 👨‍💼-👩‍💼");
        for (Funcionario funcionario : this.funcionarios) {
            System.out.println(funcionario.getId() + "- " + "nome:" + funcionario.getNome());

        }
    }

    public void listarTarefas() {
        System.out.println("Lista de todas tarefas");
        for (Projeto projeto : this.projetos) {
            for (Tarefa tarefa : projeto.getTarefas()) {
                tarefa.mostrarDetalhe();
            }
        }
    }

    public void listarTarefas(int idProjeto) {
        System.out.println("Lista de Tarefas do projeto: " + this.projetos.get(idProjeto - 1).getNome());
        for (Tarefa tarefa : this.projetos.get(idProjeto - 1).getTarefas()) {
            tarefa.mostrarDetalhe();
        }

    }

    public void listarTarefasPendentes() {
        for (Projeto projeto : this.projetos) {
            for (Tarefa tarefa : projeto.getTarefas()) {
                if (!tarefa.isConcluida()) {
                    tarefa.mostrarDetalhe();
                }
            }
        }
        System.out.println("Não tem tarefas pedentes!");
    }

    public void adicionarTarefaAoFuncionario(int idFuncionario, int idTarefa) {
        for (Projeto projeto : this.projetos) {
            this.funcionarios.get(idFuncionario - 1).atribuirTarefa(projeto.getTarefas().get(idTarefa - 1));
            break;
        }

    }

    public void concluirTarefa(int idprojeto, int idtarefa) {
        projetos.get(idprojeto - 1).getTarefas().get(idtarefa - 1).marcarComoConcluida();
        System.out.println("Tarefa concluida 👍🤠");
    }


    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public ArrayList<Projeto> getProjetos() {
        return projetos;
    }
}
