package com.loiane.cursojava.atividades14_15;

import java.util.Scanner;

public class Atv11_Tabajara {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o seu salário atual: ");
        double salario = scan.nextDouble();

        double percentual, aumento, novoSalario;

        if (salario < 280) {
            percentual = 0.2;
        } else if (salario >= 280 && salario < 700) {
            percentual = 0.15;
        } else if (salario >= 700 && salario < 1500) {
            percentual = 0.1;
        } else {
            percentual = 0.05;
        }

        aumento = (salario * percentual);
        novoSalario = (salario + aumento);

        System.out.println("Salário antes do reajuste: R$ " + salario);
        System.out.println("Percentual de aumento aplicado: " + percentual + "%");
        System.out.println("Valor do aumento: R$" + aumento);
        System.out.println("Salário após o aumento: R$" + novoSalario);

        scan.close();

    }

}
