package com.loiane.cursojava.atividades11_12_13;

import java.util.Scanner;

public class ConverteMetroCentimetro {

    public static void main(String[] args) {

        // 1 m = 100 cm

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de metros: ");
        double metros = scan.nextDouble();

        double centimetros = metros * 100;
        System.out.println("A conversão resultou em " + centimetros + " centímetros.");

        scan.close();
    }

}
