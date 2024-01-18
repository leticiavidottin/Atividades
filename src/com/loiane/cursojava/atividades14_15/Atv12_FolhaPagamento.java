package com.loiane.cursojava.atividades14_15;

import java.util.Scanner;

public class Atv12_FolhaPagamento {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor da sua hora de trabalho: ");
        double valorHora = scan.nextDouble();
        System.out.println("Digite agora a quantidade de horas trabalhadas no mês: ");
        double horas = scan.nextDouble();

        scan.close();

        double IR, INSS = 0.1, FGTS = 0.11, sindicato = 0.03, salarioBruto = valorHora * horas;

        if (salarioBruto <= 900) {
            IR = 0;
        } else if (salarioBruto > 900 && salarioBruto <= 1500) {
            IR = 0.05;
        } else if (salarioBruto > 1500 && salarioBruto <= 2500) {
            IR = 0.1;
        } else {
            IR = 0.2;
        }

        double descontoIR = (salarioBruto * IR), descontoINSS = (salarioBruto * INSS),
                        descontoSindicato = (salarioBruto * sindicato), valorFGTS = (salarioBruto * FGTS),
                        totalDescontos = (descontoINSS + descontoIR),
                        salarioLiquido = (salarioBruto - descontoINSS - descontoIR - descontoSindicato);

        System.out.println("\nSalário Bruto: (" + horas + " * " + valorHora + ")\t: R$ \t" + salarioBruto);
        System.out.println("(-) IR (" + (IR * 100) + "%) \t\t\t: R$ \t" + descontoIR);
        System.out.println("(-) INSS (" + (INSS * 100) + "%) \t\t: R$ \t" + descontoINSS);
        System.out.println("(-) Sindicato (" + (sindicato * 100) + "%) \t\t: R$ \t" + descontoSindicato);
        System.out.println("FGTS (" + (FGTS * 100) + "%) \t\t\t: R$ \t" + valorFGTS);
        System.out.println("Total de descontos\t\t: R$ \t" + totalDescontos);
        System.out.println("Salário Líquido\t\t\t: R$ \t" + salarioLiquido);

    }

}
