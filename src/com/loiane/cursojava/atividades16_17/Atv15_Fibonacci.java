package com.loiane.cursojava.atividades16_17;

import java.util.Scanner;

public class Atv15_Fibonacci {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o último termo que de deseja ver na sequência de Fibonacci: ");
        int termo = scan.nextInt();

        scan.close();

        int fibonacci;

        if (termo == 0) {
            System.out.println("O termo " + termo + " da sequência de Fibonacci é igual a 0");
        } else if (termo == 1) {
            System.out.println("O termo " + termo + " da sequência de Fibonacci é igual a 1");
        } else {
            for (int i = 0; i < termo; i++) {
                fibonacci = (termo - 1) + (termo - 2);
            }
        }

        System.out.println("O termo " + termo + " da sequência de Fibonacci é igual a " + fibonacci);

    }

}
