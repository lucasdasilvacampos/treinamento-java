package atividadesLive.gpt.personagemCadastroJogo;

public class Personagem {
    private String nome;
    private final String classe;
    private int nivel;

    public Personagem(){
        this.nome = "Sem nome";
        this.classe = "Sem classe";
        this.nivel = 0;
    }

    public Personagem(String nome,String classe, int nivel) {
        this.classe = classe;
        this.nome = nome;
        this.nivel = nivel;
    }

    public void imprimirFicha(){
        System.out.println("Nome: "+ this.nome);
        System.out.println("Classe: "+ this.classe);
        System.out.println("Nivel: "+ this.nivel);
        System.out.println("-----------------------");
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
