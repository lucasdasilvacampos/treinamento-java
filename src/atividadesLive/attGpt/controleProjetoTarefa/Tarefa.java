package atividadesLive.attGpt.controleProjetoTarefa;


import ultils.FormatadorData;

import java.util.ArrayList;
import java.util.Date;

public class Tarefa {
    private int id;
    private String descricao;
    private boolean concluida;
    private Funcionario responsavel;
    private Date dataCriacao;
    private Date dataConclusao;

    public Tarefa(String descricao, ArrayList<Tarefa> novaTarefas) {
        this.descricao = descricao;
        this.id = calcularNovoId(novaTarefas);
        this.concluida = false;
        this.dataCriacao = new Date();
        this.dataConclusao = null;
    }

    public boolean marcarComoConcluida() {
        this.concluida = true;
        this.dataConclusao = new Date();
        return concluida;
    }

    public void mostrarDetalhe() {
        System.out.println("id: " + this.id);
        System.out.println("descrição: " + this.descricao);
        System.out.println("concluida: " + this.concluida);
        System.out.println("responsavél: " + (this.responsavel != null ? this.responsavel.getNome() : "Sem responsável"));
        System.out.println("data criação: " + FormatadorData.dataFormatada(this.dataCriacao));
        System.out.println("data conclusão: " + (this.dataConclusao == null ? "Não concluída" : FormatadorData.dataFormatada(this.dataConclusao)));
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

    public void setResponsavel(Funcionario responsavel) {
        this.responsavel = responsavel;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public Date getDataConclusao() {
        return dataConclusao;
    }
}
