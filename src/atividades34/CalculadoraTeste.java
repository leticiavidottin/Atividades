package atividades34;

import java.util.Scanner;

public class CalculadoraTeste {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num1, num2;

        System.out.println("Digite os valores que deseja utilizar: ");
        System.out.print("Primeiro valor: ");
        num1 = scan.nextInt();

        System.out.print("Digite o segundo valor: ");
        num2 = scan.nextInt();

        Calculadora.somarValores(num1, num2);
        Calculadora.subtrairValores(num1, num2);
        Calculadora.multiplicarValores(num1, num2);
        Calculadora.dividirValores(num1, num2);
        Calculadora.potenciarValores(num1, num2);
        Calculadora.retornarFatorial(num1);
        Calculadora.retornarFatorial(num2);

        scan.close();

    }

}
