package com.loiane.cursojava.aula20;

public class MatrizTridimensional {

    public static void main(String[] args) {

        int[][][] matrizTridimensional = new int[3][3][3];

        for (int i = 0; i < matrizTridimensional.length; i++) {
            for (int j = 0; j < matrizTridimensional[i].length; j++) {
                for (int k = 0; k < matrizTridimensional[i][j].length; k++) {
                    System.out.println("i = " + i + " \t j = " + j + " \t k = " + k);
                    matrizTridimensional[i][j][k] = i + j + k;
                }
            }
        } // fizemos separado só para treinar, mas poderíamos fazer tudo apenas
          // em uma matriz

        int soma = 0, somaPares = 0, somaImpares = 0;
        for (int i = 0; i < matrizTridimensional.length; i++) {
            for (int j = 0; j < matrizTridimensional[i].length; j++) {
                for (int k = 0; k < matrizTridimensional[i][j].length; k++) {
                    soma += matrizTridimensional[i][j][k];

                    if (matrizTridimensional[i][j][k] % 2 == 0) {
                        somaPares += matrizTridimensional[i][j][k];
                    } else {
                        somaImpares += matrizTridimensional[i][j][k];
                    }
                }
            }
        }

        System.out.println("Soma total = \t" + soma);
        System.out.println("Soma pares = \t" + somaPares);
        System.out.println("Soma ímpares = \t" + somaImpares);

    }

}
