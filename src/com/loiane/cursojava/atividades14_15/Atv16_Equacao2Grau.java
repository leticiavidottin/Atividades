package com.loiane.cursojava.atividades14_15;

import java.util.Scanner;

public class Atv16_Equacao2Grau {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor de a: ");
        int a = scan.nextInt();
        if (a == 0) {
            System.out.println("Equação não é de segundo grau! Programa encerrado.");
            ;
        } else {
            System.out.println("Digite o valor de b: ");
            int b = scan.nextInt();
            System.out.println("Digite o valor de c: ");
            int c = scan.nextInt();

            double delta = ((b * b) - (4 * a * c));

            if (delta < 0) {
                System.out.println("A equação não possui raízes reais.");
            } else {
                double xl = (-b + Math.sqrt(delta)) / (2 * a);
                double xll = (-b - Math.sqrt(delta)) / (2 * a);

                if (xll == 0) {
                    System.out.println("A equação possui apenas uma raíz real: " + xll);
                } else if (xl == 0) {
                    System.out.println("A equação possui apenas uma raíz real: " + xl);
                } else {
                    System.out.println("As raízes desta equação são: " + xll + " e " + xl);
                }
            }
        }

        scan.close();

    }

}
