package atividades36;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String nome;
    private String horario;
    private Professor professor;
    private List<Aluno> alunos;

    public Curso() {
        super();
    }

    public Curso(String nome, String horario, Professor professor, ArrayList<Aluno> alunos) {
        super();
        this.nome = nome;
        this.horario = horario;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ArrayList<Aluno> getAlunos() {
        return (ArrayList<Aluno>) alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void adicionarAluno(Aluno aluno) {

        if (this.alunos == null) {
            this.alunos = new ArrayList<>(); // Certifica-se de que a lista de
                                             // alunos está inicializada
        }
        this.alunos.add(aluno);
    }

    @Override
    public String toString() {
        return "Curso [nome=" + nome + ", horario=" + horario + ", professor=" + professor + "]";
    }

}
