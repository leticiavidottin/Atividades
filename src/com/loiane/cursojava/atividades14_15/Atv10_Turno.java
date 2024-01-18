package com.loiane.cursojava.atividades14_15;

import java.util.Scanner;

public class Atv10_Turno {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o turno em que você estuda, considerando M como matutino, V como vespertino e N como noturno: ");
        String turno = scan.next();

        scan.close();

        switch (turno) {
            case "N":
            case "n":
                System.out.println("Boa Noite!");
                break;
            case "M":
            case "m":
                System.out.println("Bom Dia!");
                break;
            case "V":
            case "v":
                System.out.println("Boa Tarde!");
                break;
            default:
                System.out.println("Valor inválido!");
                break;

        }

    }

}
