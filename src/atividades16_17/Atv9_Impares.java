package atividades16_17;

public class Atv9_Impares {

    public static void main(String[] args) {

        int count = 1;

        System.out.println("Números ímpares entre 1 e 50");

        while (count <= 50) {
            if (count % 2 != 0) {
                System.out.print(count + " ");
            }
            count++;
        }

    }

}
