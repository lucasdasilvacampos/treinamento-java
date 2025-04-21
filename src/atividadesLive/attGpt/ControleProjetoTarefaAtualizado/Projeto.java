package atividadesLive.attGpt.ControleProjetoTarefaAtualizado;

import java.util.ArrayList;

public class Projeto {
    private int idProjeto;
    private String nome;
    private ArrayList<Tarefa> tarefas;
    private int contadorTarefa = 0;

    public Projeto(int idProjeto, String nome, ArrayList<Tarefa> tarefas) {
        this.nome = nome;
        this.tarefas = tarefas;
        this.idProjeto = idProjeto;
    }

    public boolean anyTarefasConcluidas(){
        boolean concluidas = this.tarefas.stream().anyMatch(tarefa -> tarefa.isConcluida());
        return concluidas;
    }


    public void criarTarefa(String nome, String descricao) {
        int novoIdTarefa = ++contadorTarefa;
        Tarefa tarefa = new Tarefa(novoIdTarefa, this.idProjeto, nome, descricao);
        this.tarefas.add(tarefa);
        System.out.println("Tarefa criada 👍🤠");
    }


    public Tarefa buscarTarefaId(int idTarefa) {
        return this.getTarefas().stream()
                .filter(tarefa -> tarefa.getIdTarefa() == idTarefa)
                .findFirst()
                .orElse(null);

    }



    public ArrayList<Tarefa> getTarefas() {
        return tarefas;
    }

    public int getIdProjeto() {
        return idProjeto;
    }

    public String getNome() {
        return nome;
    }
}
