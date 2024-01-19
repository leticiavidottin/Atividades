package com.loiane.cursojava.atividades19;

import java.util.Random;

public class Atv08_VetorMultiplicacao {

    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

        Random random = new Random();

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = random.nextInt(20);
            vetorB[i] = random.nextInt(20);
        }

        for (int i = 0; i < vetorA.length; i++) {
            vetorC[i] = (vetorA[i] * vetorB[i]);
        }

        System.out.println("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println("\n\nVetor B: ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }

        System.out.println("\n\nVetor C: ");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }

    }

}
