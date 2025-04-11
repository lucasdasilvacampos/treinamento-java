package atividadesLive.attGpt.controleProjetoTarefa;

import java.util.ArrayList;

public class Tarefa {
    private int id;
    private String descricao;
    private boolean concluida;
    private Funcionario responsavel;

    public boolean marcarComoConcluida() {
        return concluida;
    }

    public void mostrarDetalhe() {
        System.out.println("id: " + this.id);
        System.out.println("descrição: " + this.descricao);
        System.out.println("tarefa: " + this.concluida);
        System.out.println("resposavél: " + this.responsavel);
        System.out.println("-------------------------------");
    }

    public int calcularNovoId(ArrayList<Tarefa> tarefasExistentes) {
        if (tarefasExistentes.isEmpty()) {
            return 1;
        }
        Tarefa ultimaTarefa = tarefasExistentes.get(tarefasExistentes.size() - 1);
        return ultimaTarefa.getId() + 1;
    }

    public int getId() {
        return id;
    }


    public boolean isConcluida() {
        return concluida;
    }


    public Funcionario getResponsavel() {
        return responsavel;
    }
}
