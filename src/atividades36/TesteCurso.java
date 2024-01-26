package atividades36;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteCurso {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Curso curso = new Curso();
        curso.setNome("Java");
        curso.setHorario("Segundas das 18:00 às 20:00");

        Professor professor = new Professor("Professor Java", "Departamento de Ciência da Computação", "java@java.com");
        curso.setProfessor(professor);

        ArrayList<Aluno> alunos = new ArrayList<>();

        for (int i = 0; i < 5; i++) {

            System.out.print("Digite o nome do " + (i + 1) + "º aluno: ");
            String nomeAluno = scanner.nextLine();

            double[] notasAluno = new double[4];
            for (int j = 0; j < notasAluno.length; j++) {
                System.out.print("Digite a " + (j + 1) + "ª nota do aluno: ");
                notasAluno[j] = scanner.nextDouble();
            }

            Aluno aluno = new Aluno(nomeAluno, i, notasAluno);
            alunos.add(aluno);

            curso.adicionarAluno(aluno);
            System.out.println();
        }

        double medias = 0;

        for (Aluno aluno : alunos) {
            double media = aluno.calcularMedia();

            if (media < 7) {
                System.out.println(aluno.getNome() + " - Média: " + media + "\tReprovado");
            } else {
                System.out.println(aluno.getNome() + " - Média: " + media + "\tAprovado!");
            }

            medias += media;
        }

        double mediaTurma = medias / alunos.size();
        System.out.println("\nMédia da turma: " + mediaTurma);

        scanner.close();
    }

}