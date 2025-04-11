# 🚀 Sistema de Controle de Projetos e Tarefas

Este projeto simula um sistema de gerenciamento de projetos dentro de uma empresa, onde funcionários são atribuídos a tarefas específicas de cada projeto.

---

## 📚 Descrição

Você está estagiando em uma empresa de tecnologia e recebeu a missão de desenvolver um sistema de **controle de projetos e tarefas**. O sistema deverá permitir o cadastro de funcionários, criação de projetos, atribuição de tarefas e controle de conclusão.

---

## 🧠 Conceitos Aplicados

- Programação orientada a objetos (POO)
- Relacionamento entre classes
- `ArrayList`
- Controle de fluxo (`if/else`, `switch`, `for`, `for-each`)
- Métodos e construtores
- Organização modular de código

---

## 🏗️ Estrutura de Classes

### `Funcionario`
- Atributos:
    - `int id`
    - `String nome`
    - `ArrayList<Tarefa> tarefas`
- Métodos principais:
    - `atribuirTarefa(Tarefa tarefa)`
    - `listarTarefas()`

---

### `Tarefa`
- Atributos:
    - `int id`
    - `String descricao`
    - `boolean concluida`
    - `Funcionario responsavel`
- Métodos principais:
    - `marcarComoConcluida()`
    - `mostrarDetalhes()`

---

### `Projeto`
- Atributos:
    - `int id`
    - `String nome`
    - `ArrayList<Tarefa> tarefas`
- Métodos principais:
    - `adicionarTarefa(Tarefa tarefa)`
    - `listarTarefas()`
    - `listarTarefasPendentes()`

---

### `Empresa`
- Atributos:
    - `ArrayList<Funcionario> funcionarios`
    - `ArrayList<Projeto> projetos`
- Métodos principais:
    - `cadastrarFuncionario(Funcionario f)`
    - `criarProjeto(Projeto p)`
    - `buscarFuncionarioPorId(int id)`
    - `buscarProjetoPorId(int id)`
    - `listarTodosOsProjetos()`

---

### `Principal`
Classe principal com o método `main`, responsável pelo menu de interação com o usuário.

---

## 📋 Funcionalidades

- Cadastrar funcionários
- Criar projetos
- Criar tarefas dentro de projetos
- Atribuir tarefas a funcionários
- Marcar tarefas como concluídas
- Listar tarefas de projetos e funcionários
- Ver tarefas pendentes
- Listar todos os projetos da empresa

---

## 🧪 Menu do Sistema (Exemplo)
1 - Cadastrar funcionário 2 - Criar projeto 3 - Criar tarefa em um projeto 
4 - Atribuir tarefa a funcionário 5 - Marcar tarefa como concluída 
6 - Listar tarefas de um projeto 7 - Listar tarefas pendentes de um projeto 
8 - Listar tarefas de um funcionário 9 - Listar todos os projetos 0 - Sair
