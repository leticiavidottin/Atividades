package com.loiane.cursojava.atividades14_15;

import java.util.Scanner;

public class Atv15_Triangulo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor de três retas, separadas por espaço: ");
        int lado1 = scan.nextInt();
        int lado2 = scan.nextInt();
        int lado3 = scan.nextInt();

        scan.close();

        boolean triangulo = false;

        if (((lado1 + lado2) > lado3) || ((lado1 + lado3) > lado2) || ((lado2 + lado3) > lado1)) {
            triangulo = true;
        } else {
            triangulo = false;
            System.out.println("Estas retas não podem formar um triângulo.");
        }

        if (triangulo == true) {
            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("Com estes lados, podemos formar um triângulo Equilátero");
            } else if ((lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3)) {
                System.out.println("Com estes lados, podemos formar um triângulo Isósceles");
            } else if ((lado1 != lado2) && (lado1 != lado3) && (lado2 != lado3)) {
                System.out.println("Com estes lados, podemos formar um triângulo Escaleno");
            } else {
                System.out.println("Estes lados não podem formar um triângulo");
            }
        }

    }

}
