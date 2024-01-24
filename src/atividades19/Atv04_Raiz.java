package atividades19;

public class Atv04_Raiz {

    public static void main(String[] args) {

        int[] vetorA = { 0, 1, 4, 9, 16, 25, 36, 49, 64, 81, 100, 121, 144, 169, 196 };
        int[] vetorB = new int[15];

        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = (int) Math.sqrt(vetorA[i]);
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
