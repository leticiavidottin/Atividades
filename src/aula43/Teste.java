package aula43;

public class Teste {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Nome");
        pessoa.setEndereco("Endereço");

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getEndereco());

    }

}
