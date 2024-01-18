package com.loiane.cursojava.atividades11_12_13;

import java.util.Scanner;

public class IMC {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a sua altura em metros: ");
        double altura = scan.nextDouble();

        double IMC = ((72.7 * altura) - 58);
        System.out.println("Seu peso ideal é de " + IMC + " quilos.");

        scan.close();

    }

}
