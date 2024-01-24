package atividades11_12_13;

import java.util.Scanner;

public class SomaNumeros {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double var1 = scan.nextDouble();
        System.out.println("Digite o segundo número: ");
        double var2 = scan.nextDouble();
        System.out.println("A soma dos valores é igual a " + (var1 + var2));

        scan.close();
    }

}
