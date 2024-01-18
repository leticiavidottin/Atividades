package com.loiane.cursojava.atividades16_17;

import java.util.Scanner;

public class Atv2_SenhaUsuario {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome, senha;

        do {
            System.out.print("Digite o nome de usuário: ");
            nome = scan.next();

            System.out.print("Digite a senha: ");
            senha = scan.next();

            if (nome.equals(senha)) {
                System.out.println("Erro");
            }

        } while (nome.equals(senha));

        System.out.println("Obrigada!");

        scan.close();

    }

}
