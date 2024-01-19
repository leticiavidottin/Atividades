package com.loiane.cursojava.atividades19;

import java.util.Scanner;

public class Atv17_IdadeMaior35 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] idadesPessoas = new int[10];
        int count = 0;

        for (int i = 0; i < idadesPessoas.length; i++) {
            System.out.print("Entre com a idade da " + (i + 1) + "ª pessoa: ");
            idadesPessoas[i] = scan.nextInt();
            if (idadesPessoas[i] > 35) {
                count++;
            }
        }

        scan.close();

        System.out.println("Idades: ");
        for (int i = 0; i < idadesPessoas.length; i++) {
            System.out.print(idadesPessoas[i] + " ");
        }
        System.out.println("\n" + count + " pessoas têm idade superior a 35 anos.");
    }

}
