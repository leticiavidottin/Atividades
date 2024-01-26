package atividades36;

import java.util.Arrays;

public class Aluno extends Pessoa {

    private String nome;
    private int matricula;
    private double[] notas = new double[4];

    public Aluno() {
        super();
    }

    public Aluno(String nome) {
        super(nome);
    }

    public Aluno(String nome, int matricula, double[] notas) {
        super();
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia() {

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;

    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", matricula=" + matricula + ", notas=" + Arrays.toString(notas) + "]";
    }

}
