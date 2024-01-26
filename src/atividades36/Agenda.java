package atividades36;

public class Agenda {

    private String nomeAgenda;
    private Contato[] contatos;

    public Agenda() {
        super();
        // TODO Auto-generated constructor stub
    }

    public String getNomeAgenda() {
        return nomeAgenda;
    }

    public void setNomeAgenda(String nomeAgenda) {
        this.nomeAgenda = nomeAgenda;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    public String retornarContatos() {

        String retorno = "";
        for (Contato contato : contatos) {
            retorno += contato.toString();
        }
        return retorno;
    }

    public String toString() {
        String result = "Agenda: " + nomeAgenda + "\nContatos:\n";

        for (Contato contato : contatos) {
            result += contato.toString() + "\n";
        }
        System.out.println();

        return result;
    }

}
