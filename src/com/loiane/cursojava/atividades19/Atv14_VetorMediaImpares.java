package com.loiane.cursojava.atividades19;

import java.util.Random;

public class Atv14_VetorMediaImpares {

    public static void main(String[] args) {

        int[] vetorA = new int[10];

        Random random = new Random();
        int soma = 0, count = 0, media;

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = random.nextInt(20);
            if ((vetorA[i] % 2) != 0) {
                soma += vetorA[i];
                count++;
            }
        }

        System.out.println("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        media = soma / count;
        System.out.println("\nMédia aritmética simples dos elementos ímpares = " + media);

    }
}
