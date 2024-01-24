package atividades35;

import java.util.Scanner;

public class FibonacciRecursivoTeste {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o termo que deseja ver na sequência de Fibonacci: ");
        int termo = scan.nextInt();

        System.out.println("O " + termo + "º termo da sequência de Fibonacci é " + FibonacciRecursivo.calcularFibonacci(termo));

        scan.close();

    }

}
