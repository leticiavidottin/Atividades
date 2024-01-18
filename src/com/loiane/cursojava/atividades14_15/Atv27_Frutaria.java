package com.loiane.cursojava.atividades14_15;

import java.util.Scanner;

public class Atv27_Frutaria {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de morangos em kg: ");
        double morangos = scan.nextDouble();

        System.out.println("Digite a quantidade de maçãs em kg: ");
        double macas = scan.nextDouble();

        scan.close();

        double precoMorangoAte5 = 2.5, precoMorangoAcima5 = 2.2, precoMacaAte5 = 1.8, precoMacaAcima5 = 1.5;
        double custoMorango = precoMorangoAte5, custoMaca = precoMacaAte5, frutas = (morangos + macas);

        if (morangos > 5) {
            custoMorango = precoMorangoAcima5;
        }

        if (macas > 5) {
            custoMaca = precoMacaAcima5;
        }

        double valor = (custoMaca * macas) + (custoMorango * morangos);

        if (frutas > 8 || valor > 25) {
            valor = valor - (valor * .1);
        }

        System.out.println(
                        "O valor pago por " + morangos + " kgs de morangos e " + macas + " 10 kgs de maçãs é igual a R$" + valor);

    }

}
