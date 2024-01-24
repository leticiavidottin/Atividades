package atividades14_15;

import java.util.Scanner;

public class Atv4_VogalCons {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        String letra = scan.next();

        if (letra.length() > 1) {
            System.out.println("Não é uma letra válida!");
        } else {
            switch (letra) {
                case "a":
                case "A":
                case "e":
                case "E":
                case "i":
                case "I":
                case "o":
                case "O":
                case "u":
                case "U":
                    System.out.println("Esta é uma vogal.");
                    break;
                default:
                    System.out.println("Esta é uma consoante.");
                    break;
            }
        }

        scan.close();

    }

}
