package com.loiane.cursojava.atividades16_17;

public class Atv6_Filas {

    public static void main(String[] args) {

        int count = 1;

        do {
            System.out.println(count);
            count++;
        } while (count <= 20); // um abaixo do outro

        count = 1;
        System.out.println();

        do {
            System.out.print(count + " ");
            count++;
        } while (count <= 20); // um ao lado do outro

    }

}
