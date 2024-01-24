package aula39;

public class Aluno extends Pessoa {

    private String curso;
    private double[] notas;

    public Aluno() {
        super();
    }

    public Aluno(String nome, String endereco, String telefone, String curso) {
        super(nome, endereco, telefone);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        return 0;
    }

    public boolean verificarAprovavao() {
        return true;
    }

    public void metodoTeste() {
        super.setCpf("123456789");
        System.out.println(this.getCpf());

        this.setCpf("987654321");
        System.out.println(this.getCpf());
    }

}
