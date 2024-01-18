package com.loiane.cursojava.atividades14_15;

import java.util.Scanner;

public class Atv21_CaixaEletronico {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do saque: ");
        int saque = scan.nextInt();

        if (saque < 10 || saque > 600) {
            System.out.println("Valor inválido. Digite um valor entre 10 e 600 reais.");
        }

        scan.close();

        int um, cinco, dez, cinquenta, cem, resto = saque;

        cem = saque / 100;
        if (cem == 1) {
            System.out.println(cem + " nota de cem");
        } else if (cem == 0) {
            System.out.print("");
        } else {
            System.out.println(cem + " notas de cem");
        }

        if (cem > 0) {
            resto -= (100 * cem);
        }

        cinquenta = resto / 50;
        if (cinquenta == 1) {
            System.out.println(cinquenta + " nota de cinquenta");
        } else if (cinquenta == 0) {
            System.out.print("");
        } else {
            System.out.println(cinquenta + " notas de cinquenta");
        }

        resto -= (cinquenta * 50);

        dez = resto / 10;
        if (dez == 1) {
            System.out.println(dez + " nota de dez");
        } else if (dez == 0) {
            System.out.print("");
        } else {
            System.out.println(dez + " notas de dez");
        }

        resto -= (dez * 10);

        cinco = resto / 5;
        if (cinco == 1) {
            System.out.println(cinco + " nota de cinco");
        } else if (cinquenta == 0) {
            System.out.print("");
        } else {
            System.out.println(cinco + " notas de cinco");
        }

        resto -= (cinco * 5);

        um = resto;
        if (um == 1) {
            System.out.println(um + " nota de um");
        } else if (um == 0) {
            System.out.print("");
        } else {
            System.out.println(um + " notas de um");
        }

    }

}
