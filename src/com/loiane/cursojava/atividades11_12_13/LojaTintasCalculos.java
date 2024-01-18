package com.loiane.cursojava.atividades11_12_13;

import java.util.Scanner;

public class LojaTintasCalculos {

    public static void main(String[] args) {

        // a fazer

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a área, em metros quadrados, da área a ser pintada: ");
        double area = scan.nextDouble();

        int metrosLata1 = 6 * 18;
        int metrosLata2 = 3.6 * 18;
        int valorLata1 = 80;
        int valorLata2 = 25;
        double quantidadeLatas = Math.ceil(area / metrosLata);
        double valorPagar = valorLata * quantidadeLatas;

        System.out.println("Você precisará comprar " + quantidadeLatas + " latas de tinta. Assim, será pago RS" + valorPagar);

        scan.close();

    }

}
