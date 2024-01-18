package com.loiane.cursojava.atividades14_15;

import java.util.Scanner;

public class Atv6_Maior3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double var1 = scan.nextDouble();
        System.out.println("Digite o segundo número: ");
        double var2 = scan.nextDouble();
        System.out.println("Por fim, digite o terceiro número: ");
        double var3 = scan.nextDouble();

        scan.close();

        if (var1 > var2 && var1 > var3) {
            System.out.println("O maior valor é: " + var1);
        } else if (var2 > var1 && var2 > var3) {
            System.out.println("O maior valor é: " + var2);
        } else {
            System.out.println("O maior valor é: " + var3);
        }

    }

}
