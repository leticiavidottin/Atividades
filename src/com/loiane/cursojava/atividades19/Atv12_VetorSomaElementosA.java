package com.loiane.cursojava.atividades19;

import java.util.Scanner;

public class Atv12_VetorSomaElementosA {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int soma = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º valor inteiro: ");
            vetorA[i] = scan.nextInt();
            soma += vetorA[i];
        }

        System.out.println("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println("\nSoma dos valores do Vetor A = " + soma);

        scan.close();

    }

}
