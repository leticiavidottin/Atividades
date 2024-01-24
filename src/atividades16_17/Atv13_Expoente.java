package atividades16_17;

import java.util.Scanner;

public class Atv13_Expoente {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor da base: ");
        int base = scan.nextInt();

        System.out.println("Digite o valor do expoente: ");
        int expoente = scan.nextInt();

        scan.close();

        int resultado = 1;

        for (int i = 0; i < expoente; i++) {
            resultado = resultado * base;
        }

        System.out.println("O valor de " + base + "^" + expoente + " = " + resultado);

    }

}
