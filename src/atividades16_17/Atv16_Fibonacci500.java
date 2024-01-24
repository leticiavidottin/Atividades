package atividades16_17;

public class Atv16_Fibonacci500 {

    public static void main(String[] args) {

        int termoAtual = 0, primeiroTermo = 0, segundoTermo = 1;

        System.out.print("1 "); // valor não computado pelo loop na conta,
                                // depois resolver

        while (termoAtual < 600) {
            int proximoTermo = primeiroTermo + segundoTermo;
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
            termoAtual = proximoTermo;

            System.out.print(termoAtual + " ");

        }
    }

}
