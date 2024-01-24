package atividades14_15;

import java.util.Scanner;

public class Atv23_InteiroDecimal {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número real: ");
        double num = scan.nextDouble();

        double valida = Math.round(num);

        if (valida == num) {
            System.out.println("Este é um número inteiro");
        } else {
            System.out.println("Este é um número decimal");
        }

        scan.close();

    }

}
