package atividades35;

public class SomatorioRecursivo {

    public static int calcularSomatorio(int valor) {

        if (valor <= 1) {
            return valor;
        } else {
            return calcularSomatorio(valor - 1) + valor;
        }
    }

}
