package atividades11_12_13;

import java.util.Scanner;

public class CalculosPedidos {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro: ");
        int inteiro1 = scan.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        int inteiro2 = scan.nextInt();

        System.out.println("Digite um número real: ");
        double real = scan.nextDouble();

        scan.close();

        // o produto do |dobro do primeiro| com |metade do segundo|
        double calculo1 = ((inteiro1 * 2) * (inteiro2 / 2));
        System.out.println("O produto do dobro do primeiro com metade do segundo é igual a: " + calculo1);

        // a soma do |triplo do primeiro| com o terceiro
        double calculo2 = ((inteiro1 * 3) + real);
        System.out.println("A soma do triplo do primeiro com o terceiro é igual a: " + calculo2);

        double calculo3 = (real * real * real);
        System.out.println("O terceiro elevado ao cubo é igual a: " + calculo3);

    }

}
