package atividades35;

public class SomatorioRecursivo {

    public static int calcularSomatorio(int valor) {

        if (valor < 0) {
            System.out.println("Valor inválido");
            return 0;
        }

        if (valor <= 1) {
            return valor;
        } else {
            return calcularSomatorio(valor - 1) + valor;
        }
    }

}
