package atividadesLive.attGpt.controleProjetoTarefa;

import java.util.ArrayList;

public class Funcionario {
    private int id;
    private String nome;
    private ArrayList<Tarefa> tarefas;

    public Funcionario(String nome, ArrayList<Funcionario> funcionariosExistentes) {
        this.nome = nome;
        this.tarefas = new ArrayList<>();
        this.id = calcularNovoId(funcionariosExistentes);
    }

    public int calcularNovoId(ArrayList<Funcionario> funcionariosExistentes) {
        if (funcionariosExistentes.isEmpty()) {
            return 1;
        }
        Funcionario ultimoFuncionario = funcionariosExistentes.get(funcionariosExistentes.size() - 1);
        return ultimoFuncionario.getId() + 1;
    }

    public void atribuirTarefa(Tarefa tarefa) {
        if (this.tarefas.stream().anyMatch(tarefa1 -> tarefa1.equals(tarefa))) {
            System.out.println("Este funcionario já possui está tarefa na lista ❌");
            return;
        }
        System.out.println("Tarefa atribuida ao funcionario com sucesso 👍🤠");
        this.tarefas.add(tarefa);
    }

    public void listarTarefas() {
        System.out.println("---------- | Lista de Tarefas | ----------");
        for (Tarefa tarefa : this.tarefas) {
            tarefa.mostrarDetalhe();
        }
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Tarefa> getTarefas() {
        return tarefas;
    }
}
