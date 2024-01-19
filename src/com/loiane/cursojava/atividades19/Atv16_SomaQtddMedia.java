package com.loiane.cursojava.atividades19;

import java.util.Random;

public class Atv16_SomaQtddMedia {

    public static void main(String[] args) {

        Random random = new Random();

        int[] vetorA = new int[10];
        int somaMenores = 0, count = 0, somaMaiores = 0, countMaiores = 0;

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = random.nextInt(100);
            if (vetorA[i] < 15) {
                somaMenores += vetorA[i];
            } else if (vetorA[i] == 15) {
                count++;
            } else {
                somaMaiores += vetorA[i];
                countMaiores++;
            }
        }

        System.out.println("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println("\nSoma dos valores do Vetor A que são inferiores a 15: " + somaMenores);
        System.out.println("Quantidade de valores do Vetor A que são iguais a 15: " + count);
        System.out.println("Média dos valores do Vetor A que são maiores que 15: " + (somaMaiores / countMaiores));

    }

}
