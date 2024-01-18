package com.loiane.cursojava.atividades11_12_13;

import java.util.Scanner;

public class CalculaAreaCirculo {

    public static void main(String[] args) {

        // Área = pi * raio * raio
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o raio do círculo: ");
        double raio = scan.nextDouble();

        double area = Math.PI * (raio * raio);
        System.out.println("A área do círculo é igual a " + area);

        scan.close();

    }

}
