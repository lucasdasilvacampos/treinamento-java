💼 Atividade de Estágio – Sistema de Vendas
Objetivo: Criar um sistema simples em Java que permita cadastrar produtos, registrar vendas e listar o estoque.

🧾 Requisitos do sistema
1. Cadastro de Produtos
   Cada produto deve conter:

Nome (String)

Código (int)

Preço (double)

Quantidade em estoque (int)

Armazene os produtos em um ArrayList.

2. Listar Produtos
   Exibir todos os produtos cadastrados com seus detalhes.

3. Registrar Venda
   O usuário informa o código do produto e a quantidade a vender.

Se houver estoque suficiente:

Atualizar o estoque.

Mostrar o valor total da venda.

Se não houver:

Mostrar mensagem de "Estoque insuficiente".

4. Menu de opções
   O programa deve mostrar o seguinte menu:
   
   O sistema deve rodar até o usuário escolher a opção 0.
   1 - Cadastrar produto
   2 - Listar produtos
   3 - Registrar venda
   0 - Sair


🧠 Dicas
Você vai precisar usar:

Classes com atributos privados, getters e setters.

Construtores e sobrecarga, se quiser facilitar.

ArrayList

Scanner

if/else, for, switch-case

Métodos para ações como mostrarProduto() e vender().