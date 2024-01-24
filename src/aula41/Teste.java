package aula41;

public class Teste {

    public static void main(String[] args) {

        // Pessoa pessoa = new Pessoa();
        // a partir do momento que adicionamos
        // o abstract, a classe não pode mais ser instanciada
        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();

        aluno.setEndereco("Rua1");
        professor.setEndereco("Rua1");

        System.out.println(aluno.obterEndereco());
        System.out.println(professor.obterEndereco());

    }

}
