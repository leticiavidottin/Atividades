package com.loiane.cursojava.atividades16_17;

import java.util.Scanner;

public class Atv5_TaxaCrescimento2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int menu = 1;

        do {

            double popA, popB, txA, txB;

            do {
                System.out.println("Digite o tamanho da população do primeiro país");
                popA = scan.nextDouble();
                System.out.println("Digite agora a taxa de crescimento anual de sua população");
                txA = scan.nextDouble();

                System.out.println("Digite o tamanho da população do segundo país");
                popB = scan.nextDouble();
                System.out.println("Digite agora a taxa de crescimento anual de sua população");
                txB = scan.nextDouble();

                if (popA > popB || txA < txB) {
                    System.out.println(
                                    "A população do primeiro país deve ser menor que a do segundo país, assim como sua taxa de crescimento deve ser maior do que a do segundo país para o correto funcionamento deste programa.");
                }

            } while (popA > popB || txA < txB);

            scan.close();

            int count = 0;

            while (popA < popB) {
                popA = popA + (popA * txA);
                popA = Math.ceil(popA);
                popB = popB + (popB * txB);
                popB = Math.ceil(popB);
                count++;
            }

            System.out.println("Serão necessários " + count
                            + " anos para que a população do primeiro país ultrapasse a população do segundo país informado");

            System.out.println("\nCaso queira continuar a operação, digite 1. Caso contrário, digite 0.");
            menu = scan.nextInt();

            if (menu != 0 && menu != 1) {
                System.out.println("Digite um número válido: 1 para continuar, 0 para sair");
                menu = scan.nextInt();
            }

            if (menu == 0) {
                System.out.println("Até logo!");
            }

        } while (menu == 1);
    }

}
