package atividades14_15;

import java.util.Scanner;

public class Atv17_AnoBissexto {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o ano: ");
        int ano = scan.nextInt();

        if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
            System.out.println("Este é um ano bissexto.");
        } else {
            System.out.println("Este não é um ano bissexto.");
        }

        scan.close();

    }

}
