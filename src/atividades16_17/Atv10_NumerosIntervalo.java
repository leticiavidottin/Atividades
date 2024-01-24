package atividades16_17;

import java.util.Scanner;

public class Atv10_NumerosIntervalo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = scan.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = scan.nextInt();

        scan.close();

        int maior = num1, menor = num2;

        if (num2 > num1) {
            maior = num2;
            menor = num1;
        }

        System.out.println("Estes são os valores entre " + menor + " e " + maior + ": ");
        for (int i = (menor + 1); i < maior; i++) {
            System.out.print(i + " ");
        }

    }

}
