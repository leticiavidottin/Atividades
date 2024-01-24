package atividades14_15;

import java.util.Scanner;

public class Atv14_MediaModificada {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = scan.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = scan.nextDouble();

        scan.close();

        double media = (nota1 + nota2) / 2;
        String conceito, mensagem;

        if (media >= 0 && media < 4) {
            conceito = "E";
            mensagem = "REPROVADO";
        } else if (media >= 4 && media < 6) {
            conceito = "D";
            mensagem = "REPROVADO";
        } else if (media >= 6 && media < 7.5) {
            conceito = "C";
            mensagem = "APROVADO";
        } else if (media >= 7.5 && media < 9) {
            conceito = "B";
            mensagem = "APROVADO";
        } else {
            conceito = "A";
            mensagem = "APROVADO";
        }

        System.out.println("\nPrimeira nota obtida: \t" + nota1);
        System.out.println("Segundanota obtida: \t" + nota2);
        System.out.println("Média: \t\t\t" + media);
        System.out.println("Conceito: \t\t" + conceito);
        System.out.println(mensagem);

    }

}
