package atividades16_17;

import java.util.Scanner;

public class Atv19_MenorMaiorSoma1000 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de termos que deseja entrar: ");
        int input = scan.nextInt();

        int[] numeros = new int[input];
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            numeros[i] = scan.nextInt();
            if (numeros[i] < 0 || numeros[i] > 100) {
                System.out.println("Valor inválido, digite apenas valores inteiros entre 0 e 1000");
                System.out.print("Digite o " + (i + 1) + "º valor: ");
                numeros[i] = scan.nextInt();
            }
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            soma += numeros[i];
        }

        scan.close();

        System.out.println("Menor valor: " + menor);
        System.out.println("Maior valor: " + maior);
        System.out.println("Soma: " + soma);

    }

}
