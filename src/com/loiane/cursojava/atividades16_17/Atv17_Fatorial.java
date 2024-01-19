package com.loiane.cursojava.atividades16_17;

import java.util.Scanner;

public class Atv17_Fatorial {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        int num = scan.nextInt();
        int count = num;
        int fatorial = 1;

        scan.close();

        while (count != 0) {
            fatorial = fatorial * count;
            count--;
        }

        System.out.println(num + "! = " + fatorial);

    }
}
