package com.loiane.cursojava.atividades14_15;

import java.util.Scanner;

public class Atv26_Posto {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Selecione o tipo de combustível: A para álcool e G para gasolina");
        String combustivel = scan.next();
        combustivel = combustivel.toLowerCase();

        if (!combustivel.equals("a") && !combustivel.equals("g")) {
            System.out.println("Digite um valor válido! A ou G");
            combustivel = scan.next();
            combustivel = combustivel.toLowerCase();
        }

        System.out.println("Digite agora a quantidade de litros a serem abastecidos: ");
        double litros = scan.nextDouble();

        scan.close();

        double precoAlcool = 1.9, precoGasolina = 2.5;

        if (combustivel.equals("a")) {
            if (litros <= 20) {
                precoAlcool = precoAlcool - (precoAlcool * 0.03);
            } else {
                precoAlcool = precoAlcool - (precoAlcool * 0.05);
            }
        } else if (combustivel.equals("g")) {
            if (litros <= 20) {
                precoGasolina = precoGasolina - (precoGasolina * 0.04);
            } else {
                precoGasolina = precoGasolina - (precoGasolina * 0.06);
            }
        }

        if (combustivel.equals("a")) {
            System.out.println("O valor a pagar é de R$" + (litros * precoAlcool));
        } else if (combustivel.equals("g")) {
            System.out.println("O valor a pagar é de R$" + (litros * precoGasolina));
        }
    }
}