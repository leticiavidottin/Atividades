package atividades35;

import java.util.Scanner;

public class SomatorioRecursivoTeste {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor que deseja ver o somatório: ");
        int valor = scan.nextInt();

        System.out.println("O somatório de " + valor + " é igual a " + SomatorioRecursivo.calcularSomatorio(valor));

        scan.close();

    }

}
