package atividades19;

import java.util.Scanner;

public class Atv13_VetorSomaMultiplos5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int soma = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º valor inteiro: ");
            vetorA[i] = scan.nextInt();
            if ((vetorA[i] % 5) == 0) {
                soma += vetorA[i];
            }
        }

        System.out.println("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println("\nSoma dos valores múltiplos de 5 do Vetor A = " + soma);

        scan.close();

    }

}
