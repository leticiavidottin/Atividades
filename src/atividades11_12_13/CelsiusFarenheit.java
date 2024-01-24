package atividades11_12_13;

import java.util.Scanner;

public class CelsiusFarenheit {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Celsius: ");
        double celsius = scan.nextDouble();

        double farenheit = (celsius * 1.8) + 32;
        System.out.println("A conversão resultou em " + farenheit + " graus Farenheit");

        scan.close();

    }

}
