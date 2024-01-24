package atividades11_12_13;

import java.util.Scanner;

public class LojaTintasLata {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a área, em metros quadrados, da área a ser pintada: ");
        double area = scan.nextDouble();

        int metrosLata = 3 * 18;
        int valorLata = 80;
        double quantidadeLatas = Math.ceil(area / metrosLata);
        double valorPagar = valorLata * quantidadeLatas;

        System.out.println("Você precisará comprar " + quantidadeLatas + " latas de tinta. Assim, será pago RS" + valorPagar);

        scan.close();

    }

}
