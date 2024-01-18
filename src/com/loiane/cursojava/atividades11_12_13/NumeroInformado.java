package com.loiane.cursojava.atividades11_12_13;

import java.util.Scanner;

public class NumeroInformado {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe seu número: ");
        int numero = scan.nextInt();
        System.out.println("O número informado foi " + numero + ".");

        scan.close();
    }

}
