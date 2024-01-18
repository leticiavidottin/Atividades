package com.loiane.cursojava.atividades16_17;

import java.util.Scanner;

public class Atv3_Validacao {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Feito com a aula, para entender a lógica utilizada por ela para
        // exercícios posteriores e quais funções são utilizadas

        boolean infoValida = false;
        String nome, genero, estadoCivil;
        int idade;
        double salario;

        do {
            System.out.println("Entre com o nome: ");
            nome = scan.next();

            if (nome.length() >= 3) {
                infoValida = true;
            } else {
                System.out.println("Nome precisa de no mínimo 3 caracteres.");
            }
        } while (!infoValida);

        infoValida = false;

        do {
            System.out.println("Entre com a idade: ");
            idade = scan.nextInt();

            if (idade >= 0 && idade <= 150) {
                infoValida = true;
            } else {
                System.out.println("Idade precisa ser entre 0 e 150.");
            }
        } while (!infoValida);

        infoValida = false;

        do {
            System.out.println("Entre com o salário: ");
            salario = scan.nextInt();

            if (salario > 0) {
                infoValida = true;
            } else {
                System.out.println("Salário precisa ser maior que 0.");
            }
        } while (!infoValida);

        infoValida = false;

        do {
            System.out.println("Entre com o gênero: ");
            genero = scan.next();

            if (genero.equalsIgnoreCase("f") || genero.equalsIgnoreCase("m")) {
                infoValida = true;
            } else {
                System.out.println("Gênero precisa ser M (masculino) ou F (feminino).");
            }
        } while (!infoValida);

        infoValida = false;

        do {
            System.out.println("Entre com o estado civil: ");
            estadoCivil = scan.next();

            if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("v")
                            || estadoCivil.equalsIgnoreCase("d")) {
                infoValida = true;
            } else {
                System.out.println("Gênero precisa ser S (solteiro), C (casado), V (viúvo) ou D (divorciado).");
            }
        } while (!infoValida);

        scan.close();

        System.out.println("As seguintes informações foram coletadas: ");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Gênero: " + genero);
        System.out.println("Estado Civil:: " + estadoCivil);

    }

}
