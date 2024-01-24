package atividades19;

import java.util.Scanner;

public class Atv18_VetorIdadesMaiorMenor {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] idadesPessoas = new int[10];
        int count = 0, maior = Integer.MIN_VALUE, maiorIndice = 0, menorIndice = 0, menor = Integer.MAX_VALUE;

        for (int i = 0; i < idadesPessoas.length; i++) {
            System.out.print("Entre com a idade da " + (i + 1) + "ª pessoa: ");
            idadesPessoas[i] = scan.nextInt();
            if (idadesPessoas[i] > maior) {
                maior = idadesPessoas[i];
                maiorIndice = i;
            }
            if (idadesPessoas[i] < menor) {
                menor = idadesPessoas[i];
                menorIndice = i;
            }
        }

        scan.close();

        System.out.println("Idades: ");
        for (int i = 0; i < idadesPessoas.length; i++) {
            System.out.print(idadesPessoas[i] + " ");
        }
        System.out.println("\n" + count + " pessoas têm idade superior a 35 anos.");
        System.out.println("A pessoa com maior idade tem " + maior + " anos e encontra-se no índice " + maiorIndice + " do vetor.");
        System.out.println("A pessoa com menor idade tem " + menor + " anos e encontra-se no índice " + menorIndice + " do vetor.");

    }

}
