package atividadesLive.attGpt.controleProjetoTarefa;

import java.util.ArrayList;

public class Projeto {
    private int id;
    private String nome;
    private ArrayList<Tarefa> tarefas;

    public Projeto(String nome) {
        this.nome = nome;
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        if (this.tarefas.stream().anyMatch(tarefa1 -> tarefa1.equals(tarefa))) {
            System.out.println("Esta tarefa já está no projeto ❌");
            return;
        }
        System.out.println("Tarefa adicionada ao projeto 🤠👍");
        this.tarefas.add(tarefa);
    }

    public void listarTarefas() {
        for (Tarefa tarefa : this.tarefas) {
            tarefa.mostrarDetalhe();
        }
    }

    public void listarTarefasPedentes() {
        for (Tarefa tarefa : this.tarefas) {
            if (!tarefa.marcarComoConcluida()) {
                tarefa.mostrarDetalhe();
            }
            System.out.println("Não tem tarefas pedentes 😮");
        }
    }

    public int calcularNovoId(ArrayList<Projeto> projetosExistentes) {
        if (projetosExistentes.isEmpty()) {
            return 1;
        }
        Projeto ultimaProjeto = projetosExistentes.get(projetosExistentes.size() - 1);
        return ultimaProjeto.getId() + 1;
    }

    public ArrayList<Tarefa> getTarefas() {
        return tarefas;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
