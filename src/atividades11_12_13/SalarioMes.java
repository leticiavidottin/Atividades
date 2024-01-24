package atividades11_12_13;

import java.util.Scanner;

public class SalarioMes {

    public static void main(String[] args) {

        // Perguntar salário/hora; horas trabalhadas; calcular salário mês

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o quanto você recebe por hora: ");
        double salarioHora = scan.nextDouble();

        System.out.println("Digite o a quantidade de horas trabalhadas: ");
        int horasTrabalhadas = scan.nextInt();

        double salarioMes = (salarioHora * horasTrabalhadas);
        System.out.println("Neste mês seu salário será de R$" + salarioMes);

        scan.close();

    }

}
