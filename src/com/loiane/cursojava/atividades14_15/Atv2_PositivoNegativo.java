package com.loiane.cursojava.atividades14_15;

import java.util.Scanner;

public class Atv2_PositivoNegativo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        double valor = scan.nextDouble();

        if (valor > 0) {
            System.out.println("O valor é positivo");
        }
        if (valor < 0) {
            System.out.println("O valor é negativo");
        }
        if (valor == 0) {
            System.out.println("O valor é igual a 0. Logo, é um número neutro.");
        }

        scan.close();

    }

}
