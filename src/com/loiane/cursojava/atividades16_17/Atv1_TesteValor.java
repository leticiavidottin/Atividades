package com.loiane.cursojava.atividades16_17;

import java.util.Scanner;

public class Atv1_TesteValor {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma nota entre 0 e 10: ");
        double nota = scan.nextDouble();
        while (nota < 0 || nota > 10) {
            System.out.println("Valor inválido. Tente novamente: ");
            nota = scan.nextDouble();
        }

        if (nota >= 0 && nota <= 10) {
            System.out.println("Obrigada!");
        }

        scan.close();

    }

}
