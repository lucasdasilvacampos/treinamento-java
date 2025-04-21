package atividadesLive.attGpt.ControleProjetoTarefaAtualizado;

import ultils.FormatadorData;

import java.util.Date;

public class Tarefa {
    private int idProjeto;
    private int idTarefa;
    private String nome;
    private Date dataCriacao;
    private Date dataConclusao;
    private String descricao;
    private boolean disponivel;
    private boolean concluida;
    private Funcionario responsavel;


    public Tarefa(int idTarefa, int idProjeto, String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.responsavel = null;
        this.dataCriacao = new Date();
        this.concluida = false;
        this.dataConclusao = null;
        this.disponivel = true;
        this.idProjeto = idProjeto;
        this.idTarefa = idTarefa;
    }

    public void mostrarDetalhe() {
        System.out.println("Id: "+ this.getIdTarefa());
        System.out.println("Nome: " + this.nome);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Disponível: " + this.disponivel);
        System.out.println("Concluida: " + this.concluida);
        System.out.println("Responsavél: " + (this.responsavel == null ? "Sem um responsável" : this.responsavel.getNome()));
        System.out.println("Data criação: " + FormatadorData.dataFormatada(this.dataCriacao));
        System.out.println("Data conclusão: " + (this.dataConclusao == null ? "Não foi concluida" : FormatadorData.dataFormatada(this.dataConclusao)));
        System.out.println("----------------------------");
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public int getIdTarefa() {
        return idTarefa;
    }

    public boolean isConcluida() {
        return this.concluida;
    }

    public void setConcluida() {
        Date dataNova = new Date();
        this.dataConclusao = dataNova;
        this.concluida = true;
    }

    public void setResponsavel(Funcionario responsavel) {
        this.disponivel = false;
        this.responsavel = responsavel;
    }

    public Funcionario getResponsavel() {
        return responsavel;
    }

}
