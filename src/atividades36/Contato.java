package atividades36;

public class Contato {

    private String nome;
    private String email;
    private String telefone;

    public Contato() {
        super();
        // TODO Auto-generated constructor stub
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String mostrarContato() {

            return "Nome: " + this.nome + "\nEmail: " + this.email + "\nTelefone: " + this.telefone + "\n";

    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\nEmail: " + this.email + "\nTelefone: " + this.telefone + "\n";
    }

}
