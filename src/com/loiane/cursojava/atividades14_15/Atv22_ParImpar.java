package com.loiane.cursojava.atividades14_15;

import java.util.Scanner;

public class Atv22_ParImpar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num = scan.nextInt();

        if (num % 2 == 0) {
            System.out.println("Este é um número par");
        } else {
            System.out.println("Este é um número ímpar");
        }

        scan.close();

    }

}
