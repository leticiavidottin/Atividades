package com.loiane.cursojava.atividades19;

import java.util.Random;

public class Atv10_VetorRestoDivisao2 {

    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        Random random = new Random();

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = random.nextInt(100);
        }

        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = (vetorA[i] % 2);
        }

        System.out.println("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println("\n\nVetor B: ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }

    }

}
