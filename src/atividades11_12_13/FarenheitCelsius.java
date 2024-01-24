package atividades11_12_13;

import java.util.Scanner;

public class FarenheitCelsius {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Farenheit: ");
        double farenheit = scan.nextDouble();

        double celsius = (5 * (farenheit - 32) / 9);
        System.out.println("A conversão resultou em " + celsius + " graus Celsius");

        scan.close();

    }

}
