package com.loiane.cursojava.atividades11_12_13;

import java.util.Scanner;

public class MediaNotas {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota bimestral: ");
        double nota1 = scan.nextDouble();
        System.out.println("Digite a segunda nota bimestral: ");
        double nota2 = scan.nextDouble();
        System.out.println("Digite a terceira nota bimestral: ");
        double nota3 = scan.nextDouble();
        System.out.println("Digite a quarta nota bimestral: ");
        double nota4 = scan.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A média obtida pelo aluno foi: " + media);

        scan.close();
    }

}
