package aula36;

public class ContatoTeste {

    public static void main(String[] args) {

        Contato contato = new Contato();
        contato.setNome("Tyrion");
        // contato.setEndereco("Kings Landing");
        // contato.setTelefone("99999-9999");

        // criar objeto endereço // relacionamento tem-um endereço
        Endereco endereco = new Endereco();
        endereco.setCidade("São Paulo");
        endereco.setNomeRua("Avenida Paulista");
        endereco.setNumero("1555");
        endereco.setComplemento("Apto 26");
        endereco.setCep("80.000-000");
        endereco.setEstado("São Paulo");

        contato.setEndereco(endereco);

        System.out.println(contato.getNome());
        // System.out.println(contato.getTelefone());
        // System.out.println(contato.getEndereco()); // passa o endereço de
        // memória apenas

        if (contato != null && contato.getEndereco() != null) {
            System.out.println(contato.getEndereco().getCidade());
        }

        // criar objeto telefone // relacionamento tem-um telefone
        Telefone telefone = new Telefone();
        telefone.setTipo("Celular");
        telefone.setDdd("41");
        telefone.setNumero("99999-9999");

        Telefone telefone2 = new Telefone();
        telefone2.setTipo("Fixo");
        telefone2.setDdd("41");
        telefone2.setNumero("2222-2222");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;

        contato.setTelefones(telefones);

        // contato.setTelefone(telefone); // isso aqui tiramos após inserir o
        // relacionamento "tem-muitos"

        /*
         * if (telefone != null && contato.getTelefone() != null) {
         * System.out.println("(" + contato.getTelefone().getDdd() + ") " +
         * contato.getTelefone().getNumero()); }
         */ // comentado após virar um array de telefones

        if (contato != null && contato.getTelefones() != null) {
            for (Telefone t : contato.getTelefones()) {
                System.out.println("(" + t.getDdd() + ") " + t.getNumero());
            }
        }

    }

}
