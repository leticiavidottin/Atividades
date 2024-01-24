package atividades35;

public class FibonacciRecursivo {

    public static int calcularFibonacci(int termo) {
        if (termo <= 1) {
            return termo;
        } else {
            return calcularFibonacci(termo - 1) + calcularFibonacci(termo - 2);
        }
    }
}
