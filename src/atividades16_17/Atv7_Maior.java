package atividades16_17;

import java.util.Scanner;

public class Atv7_Maior {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[5];
        int maior = Integer.MIN_VALUE;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scan.nextInt();
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        scan.close();

        System.out.println("O maior número é: " + maior);

    }

}
