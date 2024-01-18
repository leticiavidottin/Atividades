package com.loiane.cursojava.aula19;

public class Arrays {

    public static void main(String[] args) {

        /*
         * double tempDiaria001 = 31.3; double tempDiaria002 = 32; double
         * tempDiaria003 = 33.7;
         */

        double[] temperaturas = new double[365];
        // double temperaturas [] = new double[365]; também é um jeito de
        // declarar a variável, porém é menos utilizado
        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 33.7;
        temperaturas[3] = 34;
        temperaturas[4] = 33.1;

        System.out.println("O valor da temperatura do dia 3 é: " + temperaturas[2]);
        System.out.println("O tamanho do array é igual a : " + temperaturas.length);
        System.out.println("Endereço de memória do Array: " + temperaturas);

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("O valor da temperatura do dia " + (i + 1) + " é: " + temperaturas[i]);
        }

        for (double temp : temperaturas) {
            System.out.println(temp); // imprime cada valor até o fim do array.
                                      // Deste modo, temos acesso apenas ao
                                      // valor, sem ver o índice do mesmo
        }

    }

}
