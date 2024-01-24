package atividades14_15;

import java.util.Scanner;

public class Atv24_Operacoes {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        double num1 = scan.nextDouble();
        System.out.println("Digite o segundo valor: ");
        double num2 = scan.nextDouble();

        System.out.println("Digite a operação que deseja realizar: ");
        System.out.println("1 para ADIÇÃO\t 2 para SUBTRAÇÃO\t 3 para MULTIPLICAÇÃO\t 4 para DIVISÃO");
        int menu = scan.nextInt();

        scan.close();

        switch (menu) {
            case 1:
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case 2:
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case 3:
                System.out.println(num1 + " + " + num2 + " = " + (num1 * num2));
                break;
            case 4:
                System.out.println(num1 + " + " + num2 + " = " + (num1 / num2));
                break;
        }

        if (num1 % 2 == 0) {
            System.out.println(num1 + " é um número par");
        } else {
            System.out.println(num1 + " é um número ímpar");
        }

        if (num2 % 2 == 0) {
            System.out.println(num2 + " é um número par");
        } else {
            System.out.println(num2 + " é um número ímpar");
        }

        if (num1 > 0) {
            System.out.println(num1 + " é um número positivo");
        } else if (num1 == 0) {
            System.out.println(num1 + " é um número nulo (zero)");
        } else {
            System.out.println(num1 + " é um número negativo");
        }

        if (num2 > 0) {
            System.out.println(num2 + " é um número positivo");
        } else if (num2 == 0) {
            System.out.println(num2 + " é um número nulo (zero)");
        } else {
            System.out.println(num2 + " é um número negativo");
        }

        double valida1 = Math.round(num1);
        double valida2 = Math.round(num2);

        if (valida1 == num1) {
            System.out.println(num1 + " é um número inteiro");
        } else {
            System.out.println(num1 + " é um número decimal");
        }

        if (valida2 == num2) {
            System.out.println(num2 + " é um número inteiro");
        } else {
            System.out.println(num2 + " é um número decimal");
        }

    }

}
