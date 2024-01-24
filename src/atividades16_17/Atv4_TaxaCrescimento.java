package atividades16_17;

public class Atv4_TaxaCrescimento {

    public static void main(String[] args) {

        double popA = 80000, popB = 200000, count = 0, txA = 0.03, txB = 0.015;

        while (popA < popB) {
            popA = popA + (popA * txA);
            popA = Math.ceil(popA);
            popB = popB + (popB * txB);
            popB = Math.ceil(popB);
            count++;
        }

        System.out.println("Serão necessários " + count + " anos para que a população do país A ultrapasse a população do país B");

    }

}
