package com.loiane.cursojava.atividades14_15;

import java.util.Scanner;

public class Atv19_DecomposicaoNum {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro menor que 1000: ");
        int num = scan.nextInt();

        if (num >= 1000) {
            System.out.println("Este não é um número válido. Digite novamente: ");
            num = scan.nextInt();
        }

        scan.close();

        int unidades, dezenas, centenas, resto = num;

        centenas = num / 100;
        if (centenas == 1) {
            System.out.println(centenas + " centena");
        } else if (centenas == 0) {
            System.out.print("");
        } else {
            System.out.println(centenas + " centenas");
        }

        if (centenas > 0) {
            resto = num - (100 * centenas);
        }

        dezenas = resto / 10;
        if (dezenas == 1) {
            System.out.println(dezenas + " dezena");
        } else if (dezenas == 0) {
            System.out.print("");
        } else {
            System.out.println(dezenas + " dezenas");
        }

        resto -= (dezenas * 10);

        unidades = resto;
        if (unidades == 1) {
            System.out.println(unidades + " unidade");
        } else if (unidades == 0) {
            System.out.print("");
        } else {
            System.out.println(unidades + " unidades");
        }

    }

}
