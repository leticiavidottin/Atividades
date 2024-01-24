package atividades11_12_13;

import java.util.Scanner;

public class LojaTintasCalculos {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a área, em metros quadrados, da área a ser pintada: ");
        double area = scan.nextDouble();

        int metrosLata1 = 6 * 18;
        double metrosLata2 = 6 * 3.6;
        int valorLata1 = 80;
        int valorLata2 = 25;
        double quantidadeLatas1 = Math.round(area / metrosLata1);
        double resto = area - (quantidadeLatas1 * metrosLata1);
        double quantidadeLatas2 = Math.ceil(resto / metrosLata2);

        double valorPagar = (valorLata1 * quantidadeLatas1) + (quantidadeLatas2 * valorLata2);

        System.out.println("Você precisará comprar " + quantidadeLatas1 + " latas de tinta de 18 litros e " + quantidadeLatas2
                        + " galões de 3,6 litros. Assim, será pago RS" + valorPagar);

        scan.close();

    }

}
