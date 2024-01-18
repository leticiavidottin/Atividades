package com.loiane.cursojava.atividades14_15;

import java.util.Scanner;

public class Atv20_Media2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite as três notas: ");
        double nota1 = scan.nextDouble();
        double nota2 = scan.nextDouble();
        double nota3 = scan.nextDouble();

        scan.close();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media < 7) {
            System.out.println("Reprovado. Média: " + media);
        } else if (media == 10) {
            System.out.println("\"Aprovado com distinção\"");
        } else {
            System.out.println("Aprovado. Média: " + media);
        }

    }

}
