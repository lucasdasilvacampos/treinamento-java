package atividadesLive.attGpt.ControleProjetoTarefaAtualizado;

import java.util.ArrayList;

public class Funcionario {
    private int idFuncionario;
    private String nome;
    private ArrayList<Tarefa> tarefas;

    public Funcionario(int idFuncionario, String nome, ArrayList<Tarefa> tarefas) {
        this.nome = nome;
        this.tarefas = tarefas;
        this.idFuncionario = idFuncionario;
    }

    public ArrayList<Tarefa> getTarefas() {
        return tarefas;
    }

    public String getNome() {
        return nome;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setTarefa(Tarefa... tarefas) {
        for (Tarefa tarefa : tarefas) {
            tarefa.setResponsavel(this);
            this.tarefas.add(tarefa);
        }
    }
}
