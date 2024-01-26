package aula49;

public class TestandoFinallyPegadinha {

    public static void main(String[] args) {

        int[] numeros = { 4, 8, 16, 32, 64, 128 };
        int[] denominador = { 2, 0, 4, 8, 0 };

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + " / " + denominador[i] + " = " + (numeros[i] / denominador[i]));
            } catch (ArithmeticException exception1) {
                System.out.println(numeros[i] + " / " + denominador[i] + " = " + "Impossível dividir por zero");
                System.exit(0); // para a execução de todo o programa
            } catch (ArrayIndexOutOfBoundsException exception2) {
                System.out.println("Posição do array inválida");
                System.exit(0);
            } finally {
                System.out.println("Esta linha é sempre impressa após o try ou catch. Sempre é executado");
                System.out.println();
            }

        }

    }
}
