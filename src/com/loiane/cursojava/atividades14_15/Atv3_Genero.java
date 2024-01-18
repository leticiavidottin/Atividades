package com.loiane.cursojava.atividades14_15;

import java.util.Scanner;

public class Atv3_Genero {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o seu gênero (F para feminino, M para masculino): ");
        String genero = scan.next();

        switch (genero) {
            case "F":
            case "f":
                System.out.println("F - Feminino");
                break;
            case "M":
            case "m":
                System.out.println("M - Masculino");
                break;
            default:
                System.out.println("Sexo inválido");
                break;
        }

        scan.close();

    }

}
