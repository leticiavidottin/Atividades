package com.loiane.cursojava.aula18;

import java.util.Scanner;

public class BreakContinue {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre um número inteiro: ");
        int num = scan.nextInt();
        System.out.println("Entre um limite: ");
        int max = scan.nextInt();

        // contando até o primeiro número divisível por 7

        for (int i = num; i <= max; i++) {
            System.out.println(i);
            if (i % 7 == 0) {
                System.out.println("O valor de i é: " + i);
                break;
            }
        }

        /*
         * for (int i = 0; i <= 4; i++) { rotulo1: { rotulo2: { rotulo3: { if (i
         * == 1) { break rotulo1; } if (i == 2) { break rotulo2; } if (i == 2) {
         * break rotulo3; } System.out.println("rotulo3"); }
         * System.out.println("rotulo2"); } System.out.println("rotulo1"); }
         * System.out.println(i); }
         */ // método goto (não utilizado)

        System.out.println("Entre um número inteiro: ");
        int var = scan.nextInt();
        System.out.println("Entre um limite: ");
        int lim = scan.nextInt();

        scan.close();

        for (int i = var; i <= lim; i++) {
            if (i % 7 == 0) {
                continue;
            }
            System.out.println("O valor de i é: " + i);
        }

    }

}
