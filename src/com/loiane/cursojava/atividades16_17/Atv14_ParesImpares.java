package com.loiane.cursojava.atividades16_17;

import java.util.Scanner;

public class Atv14_ParesImpares {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] numeros = new int[10];
        int countPar = 0, countImpar = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º valor: ");
            numeros[i] = scan.nextInt();
            if (numeros[i] % 2 != 0) {
                countImpar++;
            } else {
                countPar++;
            }
        }

        scan.close();

        System.out.println("Há " + countPar + " números pares e " + countImpar + " números ímpares.");

    }

}
