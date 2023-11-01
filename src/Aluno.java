//O padrão Information Expert sugere que a responsabilidade 
//por um determinado comportamento deve residir na classe que possui 
//a maior quantidade de informações necessárias para realizar esse comportamento.

public class Aluno {    // Classe Aluno que representa os dados do aluno


    private int id;
    private String nome;
    private int idade;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}