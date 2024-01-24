package atividades36;

import java.util.Scanner;

public class TesteAgenda {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Agenda minhaAgenda = new Agenda();

        System.out.print("Digite o nome da sua agenda: ");
        minhaAgenda.setNomeAgenda(scan.next());
        scan.nextLine();

        System.out.println("Agora você deve adicionar três contatos em sua agenda.");

        Contato[] contatos = new Contato[3];
        for (int i = 0; i < contatos.length; i++) {

            contatos[i] = new Contato();

            System.out.println("Digite o nome do " + (i + 1) + "° contato: ");
            contatos[i].setNome(scan.nextLine());

            System.out.println("Digite o email do " + (i + 1) + "° contato: ");
            contatos[i].setEmail(scan.nextLine());

            System.out.println("Digite o telefone do " + (i + 1) + "° contato: ");
            contatos[i].setTelefone(scan.nextLine());

            System.out.println();
        }

        scan.close();

    }

}
