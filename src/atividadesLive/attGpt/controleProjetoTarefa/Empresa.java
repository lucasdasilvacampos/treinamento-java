package atividadesLive.attGpt.controleProjetoTarefa;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Funcionario> funcionarios;
    private ArrayList<Projeto> projetos;

    public void cadastrarFuncionario(Funcionario p) {
        if (this.funcionarios.stream().anyMatch(funcionario -> funcionario.equals(p))) {
            System.out.println("Este funcionário já está na empresa ❌");
            return;
        }
        System.out.println("Funcionário adicionado a empresa, seja bem vindo 👍🤠");
        this.funcionarios.add(p);
    }

    public void criarProjeto(Projeto p) {
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
            System.out.println("Nome projeto: " + projeto.getNome());
        }
    }


    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public ArrayList<Projeto> getProjetos() {
        return projetos;
    }
}
