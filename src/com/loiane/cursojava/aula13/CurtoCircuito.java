package com.loiane.cursojava.aula13;

public class CurtoCircuito {

    public static void main(String[] args) {

        boolean verdadeiro = true;
        boolean falso = false;
        boolean resultado1 = (falso & verdadeiro); // este fará a comparação
                                                   // mesmo se o primeiro já for
                                                   // falso
        boolean resultado2 = (falso && verdadeiro); // este não fará a
                                                    // comparação, visto que o
                                                    // primeiro já é falso neste
                                                    // caso. Assim, é o mais
                                                    // utilizado atualmente
        System.out.println(resultado1);
        System.out.println(resultado2);

    }

}
