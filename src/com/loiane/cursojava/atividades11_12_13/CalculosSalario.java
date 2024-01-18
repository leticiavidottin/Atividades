package com.loiane.cursojava.atividades11_12_13;

import java.util.Scanner;

public class CalculosSalario {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o quanto você recebe por hora: ");
        double salarioHora = scan.nextDouble();

        System.out.println("Digite o a quantidade de horas trabalhadas: ");
        int horasTrabalhadas = scan.nextInt();

        double salarioBruto = (salarioHora * horasTrabalhadas);
        System.out.println("Neste mês seu salário bruto foi de R$" + salarioBruto);

        scan.close();

        double INSS = salarioBruto * 0.08;
        System.out.println("Foi pago R$" + INSS + " ao INSS.");

        double sindicato = salarioBruto * 0.05;
        System.out.println("Foi pago R$" + sindicato + " ao sindicato");

        double descontos = (salarioBruto * 0.11) + INSS + sindicato;

        double salarioLiquido = (salarioBruto - descontos);
        System.out.println("O seu salário líquido foi de R$" + salarioLiquido);

    }

}
