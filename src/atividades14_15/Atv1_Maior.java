package atividades14_15;

import java.util.Scanner;

public class Atv1_Maior {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        double var1 = scan.nextDouble();

        System.out.println("Digite o segundo valor: ");
        double var2 = scan.nextDouble();

        if (var1 > var2) {
            System.out.println("O valor " + var1 + " é o maior entre eles");
        }
        if (var1 < var2) {
            System.out.println("O valor " + var2 + " é o maior entre eles");
        }
        if (var1 == var2) {
            System.out.println("O valores são iguais: " + var1 + " = " + var2);
        }

        scan.close();

    }

}
