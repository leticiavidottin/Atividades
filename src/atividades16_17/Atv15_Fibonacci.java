package atividades16_17;

import java.util.Scanner;

public class Atv15_Fibonacci {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o último termo que de deseja ver na sequência de fibonacci: ");
        int termo = scan.nextInt();

        scan.close();

        int termoAtual = 0, primeiroTermo = 0, segundoTermo = 1;
        int i = 1;

        while (i < termo) {
            int proximoTermo = primeiroTermo + segundoTermo;
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
            termoAtual = proximoTermo;

            i++;
        }

        System.out.println("O " + termo + "º termo da sequência de Fibonacci é: " + termoAtual);
    }

}
