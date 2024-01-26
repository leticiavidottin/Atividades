package aula45;

public class Teste {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        Pessoa pessoaAluno = aluno; // upcasting; ele acontece
                                    // automaticamente

        Pessoa aluno1 = (Pessoa) new Aluno(); // também é possível fazer deste
                                              // jeito
                                              // o upcasting/conversão

        Aluno aluno2 = (Aluno) pessoaAluno; // downcasting

        Pessoa aluno3 = new Pessoa();
        // Aluno aluno4 = (Aluno) aluno3;
        // pessoa não pode ser convertido em aluno

    }

}
