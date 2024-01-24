package atividades14_15;

import java.util.Scanner;

public class Atv8_MaisBarato {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o preço do primeiro produto: ");
        double var1 = scan.nextDouble();
        System.out.println("Digite o preço do segundo produto: ");
        double var2 = scan.nextDouble();
        System.out.println("Por fim, digite o preço do terceiro produto: ");
        double var3 = scan.nextDouble();

        scan.close();

        if (var1 < var2 && var1 < var3) {
            System.out.println("Você deve comprar o primeiro produto, que custa R$" + var1);
        } else if (var2 < var1 && var2 < var3) {
            System.out.println("Você deve comprar o segundo produto, que custa R$" + var2);
        } else {
            System.out.println("Você deve comprar o terceiro produto, que custa R$" + var3);
        }

    }

}
