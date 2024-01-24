package atividades16_17;

import java.util.Scanner;

public class Atv12_Tabuada {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro de 1 a 10: ");
        int num = scan.nextInt();
        while (num < 1 || num > 10) {
            System.out.println("Digite um número válido entre 1 e 10: ");
            num = scan.nextInt();
        }

        scan.close();

        System.out.println("Tabuada de " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " + (num * i));
        }

    }

}
