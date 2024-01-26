package atividades36;

public class Pessoa {

    private String nome;

    public Pessoa() {
        super();
    }

    public Pessoa(String nome) {
        super();
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + "]";
    }

}
