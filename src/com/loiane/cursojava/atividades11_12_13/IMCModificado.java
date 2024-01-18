package com.loiane.cursojava.atividades11_12_13;

import java.util.Scanner;

public class IMCModificado {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua altura em metros: ");
        double altura = scan.nextDouble();

        /*
         * Preferia usar 1 ou 2 para feminino e masculino. Depois deixei
         * adicionada uma nota para ajustar esses pontos e melhorar a qualidade
         * deste código com estudos
         */
        System.out.println("Digite agora o seu sexo (F para feminino e M para masculino): ");
        String sexo = scan.next();

        double pesoIdeal;

        if (sexo == "M" || sexo == "m" || sexo == "m " || sexo == "M ") {
            pesoIdeal = ((72.7 * altura) - 58);
        } else {
            pesoIdeal = ((62.1 * altura) - 44.7);
        }

        System.out.println("Digite o seu peso em quilos: ");
        double peso = scan.nextDouble();

        if (peso > pesoIdeal) {
            System.out.println("Você está acima do peso.");
        }
        if (peso == pesoIdeal) {
            System.out.println("Você está dentro do peso.");
        }
        if (peso < pesoIdeal) {
            System.out.println("Você está abaixo do peso.");
        }

        scan.close();

    }

}
