package com.loiane.cursojava.atividades11_12_13;

import java.util.Scanner;

public class PapoDePescador {

    public static void main(String[] args) {

        // acima de 50 quilos pagar 4 reais/quilo excedente
        // ler a variável peso para ver se há excessos
        // se houver, gravar na variável excesso
        // inserir na variável multa o valor da mesmo
        // caso contrário, inserir como valores zero

        Scanner scan = new Scanner(System.in);

        System.out.println("Olá Sr. João Papo-de-Pescador. \nInsira a quantidade pescada no dia de" + " hoje em quilos: ");
        double peso = scan.nextDouble();

        scan.close();

        double excesso, multa;

        if (peso > 50) {
            excesso = peso - 50;
            multa = excesso * 4;
        } else {
            excesso = 0;
            multa = 0;
        }

        System.out.println("Excesso: " + excesso + "\nMulta: R$" + multa);

    }

}
