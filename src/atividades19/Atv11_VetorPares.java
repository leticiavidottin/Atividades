package atividades19;

import java.util.Scanner;

public class Atv11_VetorPares {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º valor inteiro: ");
            vetorA[i] = scan.nextInt();
            vetorB[i] = (vetorA[i] % 2);
        }

        int count = 0;
        for (int i = 0; i < vetorB.length; i++) {
            if (vetorB[i] == 0) {
                count++;
            }
        }

        System.out.println("Foram digitados " + count + " números pares.");

        scan.close();

    }

}
