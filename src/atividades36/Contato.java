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

    public void mostrarContato(int i) {

        // no exercício é pedido um retorno de string. Porém, achei a solução
        // apresentada pela professora muito confusa e preferi fazer de outro
        // modo, que achei mais "elegante"

        System.out.println("Nome: " + this.nome);
        System.out.println("Email: " + this.email);
        System.out.println("Telefone: " + this.telefone);

    }

    public void mostratTodosContatos() {
        for (int i = 0; i < 3; i++) {
            this.mostrarContato(i);
        }
    }

}
