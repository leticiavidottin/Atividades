package atividades11_12_13;

import java.util.Scanner;

public class MostraDobroAreaQuadrado {

    public static void main(String[] args) {

        // Input lado quadrado, calcula área, mostra dobro da área

        System.out.println("Digite o lado do quadrado: ");
        Scanner scan = new Scanner(System.in);
        int lado = scan.nextInt();

        int area = lado * lado;
        int area2 = area * 2;

        System.out.println("A área do quadrado é igual a: " + area);
        System.out.println("O dobro da área do quadrado é igual a : " + area2);

        scan.close();
    }

}
