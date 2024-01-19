package com.loiane.cursojava.atividades16_17;

import java.util.Scanner;

public class Atv8_SomaMedia {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[5];
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scan.nextInt();
            soma += numeros[i];
        }

        scan.close();

        System.out.println("A soma dos valores é: " + soma + " e a média é igual a: " + (soma / numeros.length));

    }

}
