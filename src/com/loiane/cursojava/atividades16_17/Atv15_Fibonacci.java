package com.loiane.cursojava.atividades16_17;

import java.util.Scanner;

public class Atv15_Fibonacci {

    public static void main(String[] args) {

        int fib = 0, f0 = 0, f1 = 1;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o último termo que de deseja ver na sequência de fib: ");
        int termo = scan.nextInt();

        scan.close();

        for (int i = 2; i < termo; i++) {
            fib = f0 + f1;

            f0 = f1;
            f1 = fib;
        }

        System.out.println("O termo " + termo + " da sequência de fib é igual a " + fib);

    }

}
