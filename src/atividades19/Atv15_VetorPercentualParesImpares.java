package atividades19;

import java.util.Random;

public class Atv15_VetorPercentualParesImpares {

    public static void main(String[] args) {

        int countPar = 0, countImpar = 0;
        int[] vetorA = new int[10];

        Random random = new Random();
        int soma = 0, count = 0, media;

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = random.nextInt(20);
            if ((vetorA[i] % 2) != 0) {
                countImpar++;
            } else {
                countPar++;
            }
        }

        System.out.println("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println("\nHá " + (countPar * 10) + "% de valores pares e " + (countImpar * 10)
                        + "% de valores ímpares neste vetor.");

    }

}
