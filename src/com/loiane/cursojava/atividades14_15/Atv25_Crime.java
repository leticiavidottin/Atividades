package com.loiane.cursojava.atividades14_15;

import java.util.Scanner;

public class Atv25_Crime {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Responda às seguintes perguntas com 1 (sim) ou 0 (não)");
        System.out.println("Você telefonou para a vítima?");
        int pergunta1 = scan.nextInt();

        if (pergunta1 != 1 && pergunta1 != 0) {
            System.out.println("Digite um valor válido! 1 ou 0");
            pergunta1 = scan.nextInt();
        }

        System.out.println("Você esteve no local do crime?");
        int pergunta2 = scan.nextInt();

        if (pergunta2 != 1 && pergunta2 != 0) {
            System.out.println("Digite um valor válido! 1 ou 0");
            pergunta2 = scan.nextInt();
        }

        System.out.println("Você mora perto da vitima?");
        int pergunta3 = scan.nextInt();

        if (pergunta3 != 1 && pergunta3 != 0) {
            System.out.println("Digite um valor válido! 1 ou 0");
            pergunta3 = scan.nextInt();
        }

        System.out.println("Você devia para a vítima?");
        int pergunta4 = scan.nextInt();

        if (pergunta4 != 1 && pergunta4 != 0) {
            System.out.println("Digite um valor válido! 1 ou 0");
            pergunta4 = scan.nextInt();
        }

        System.out.println("Você já trabalhou com a vítima?");
        int pergunta5 = scan.nextInt();

        if (pergunta5 != 1 && pergunta5 != 0) {
            System.out.println("Digite um valor válido! 1 ou 0");
            pergunta5 = scan.nextInt();
        }

        scan.close();

        int count = 0;

        if (pergunta1 == 1) {
            count++;
        }

        if (pergunta2 == 1) {
            count++;
        }

        if (pergunta3 == 1) {
            count++;
        }

        if (pergunta4 == 1) {
            count++;
        }

        if (pergunta5 == 1) {
            count++;
        }

        switch (count) {
            case 1:
                System.out.println("Inocente");
                break;
            case 2:
                System.out.println("Suspeita");
                break;
            case 3:
            case 4:
                System.out.println("Cúmplice");
                break;
            case 5:
                System.out.println("Assassino");
                break;
        }

    }

}
