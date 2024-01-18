package com.loiane.cursojava.aula11;

public class CuriosidadeInt {

    public static void main(String[] args) {

        int var1 = 2147483647; // valor máximo positivo do int
        int var2 = 100;

        System.out.println(var1 + var2); // estes valores aqui da resposta vai
                                         // ser uma resposta que após
        // excedermos o limite, ele passa para os valores negativos, sem dar a
        // resposta correta

    }

}
