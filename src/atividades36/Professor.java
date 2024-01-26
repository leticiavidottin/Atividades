package atividades36;

public class Professor extends Pessoa {

    private String nome;
    private String departamento;
    private String email;

    public Professor() {
        super();
        // TODO Auto-generated constructor stub}
    }

    public Professor(String nome) {
        super(nome);
    }

    public Professor(String nome, String departamento, String email) {
        super();
        this.nome = nome;
        this.departamento = departamento;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Professor [nome=" + nome + ", departamento=" + departamento + ", email=" + email + "]";
    }

}
