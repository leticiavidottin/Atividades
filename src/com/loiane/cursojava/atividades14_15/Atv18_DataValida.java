package com.loiane.cursojava.atividades14_15;

import java.util.Scanner;

public class Atv18_DataValida {

    public static void main(String[] args) {

        // pedir data dd/mm/aaaa e ver se é válida

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o dia: ");
        int dia = scan.nextInt();
        System.out.println("Digite o mês: ");
        int mes = scan.nextInt();
        System.out.println("Digite o ano: ");
        int ano = scan.nextInt();

        scan.close();
        String msg = "Data inválida!";

        if (dia < 1 || dia > 31) {
            System.out.println(msg);
        } else if (mes < 0 || mes > 12) {
            System.out.println(msg);
        } else if (mes == 2) {
            if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
                if (dia > 29) {
                    System.out.println(msg);
                }
            } else {
                if (dia > 28) {
                    System.out.println(msg);
                }
            }
        } else {
            System.out.println("A data " + dia + "/" + mes + "/" + ano + " é válida.");
        }

    }

}
