# 🎮 Atividade Java: Sistema de Cadastro de Personagens de Jogo

## 🧠 Conteúdo a praticar
- `if`, `else`
- `switch-case`
- `for`, `while`, `do-while`
- Arrays e `ArrayList`
- `varargs`
- Métodos
- Getters e Setters
- Sobrecarga de métodos
- Sobrecarga de construtores
- Bloco de inicialização
- `final`

---

## 📝 Descrição

Você deve criar um sistema que permita:

- Cadastrar personagens de RPG
- Listar todos os personagens cadastrados
- Buscar personagens por classe (ex: "guerreiro", "mago", etc.)

---

## 📦 Estrutura do Projeto

### 🧙 Classe `Personagem`

- Atributos:
    - `nome` (modificável)
    - `classe` (deve ser `final`)
    - `nível`
- Criar:
    - Construtor padrão e outro com parâmetros
    - Getters e Setters (não há setter para `classe`)
    - Método `exibirFicha()` que imprime os dados do personagem

---

### 🧰 Classe `Jogo`

- Atributo:
    - Lista (`ArrayList`) de objetos `Personagem`
- Criar métodos para:
    - Adicionar um personagem
    - Adicionar múltiplos personagens (com `varargs`)
    - Listar todos os personagens
    - Buscar personagens por classe (ignorar maiúsculas/minúsculas)

---

### 🖥️ Classe `MenuPrincipal`

- Criar um menu com `Scanner` e `switch-case`:
    - `1` → Cadastrar personagem (pedir nome, classe, nível)
    - `2` → Listar personagens
    - `3` → Buscar personagens por classe
    - `0` → Sair
- O menu deve rodar em loop até o usuário escolher sair

---

## 🚀 Desafios extras (opcional)

- Adicione limite de personagens (máximo 10)
- Permita remover personagens pelo nome
- Crie um sistema de subida de nível para um personagem
- Salve os dados em arquivo `.txt`

---

## 💡 Dica

Use `equalsIgnoreCase()` na comparação de classe, e `final` para proteger dados que não podem ser mudados depois do construtor.

---

Boa sorte e divirta-se programando! ⚔️
