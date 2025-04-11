package atividadesLive.attGpt.personagemCadastroJogo;

import java.util.ArrayList;

public class Jogo {
    ArrayList<Personagem> personagens;


    public Jogo() {
        this.personagens = new ArrayList<>();
    }

    public void adicionarPersonagem(Personagem personagem) {
        if (this.personagens.stream().anyMatch(personagemLista -> personagemLista.getNome().equals(personagem.getNome()))) {
            System.out.println("Um personagem com este nome já existe ❌");
            return;
        }
        this.personagens.add(personagem);
        System.out.println("Personagem adicionado com sucesso 👍🤠");

    }

    public void adicionarPersonagem(Personagem... personagenss) {
        for (Personagem personagem : personagenss) {
            if (this.personagens.stream().anyMatch(personagem1 -> personagem1.getNome().equals(personagem.getNome()))) {
                System.out.println("Personagem já está cadastrado ❌ " + personagem.getNome());
                break;
            }
            this.personagens.add(personagem);
            System.out.println("Personagens adicionado com sucesso 👍🤠");
        }
    }

    public void listarPersonagens() {
        System.out.println("----- | Lista dos Personagens | -----");
        for (Personagem personagen : this.personagens) {
            personagen.imprimirFicha();
        }
    }

    public void buscarPersonagem(String classe) {
        for (Personagem personagen : personagens) {
            if (personagen.getClasse().equalsIgnoreCase(classe)) {
                personagen.imprimirFicha();
                break;
            }
        }

    }
    public ArrayList<Personagem> getPersonagens() {
        return personagens;
    }
}

