package aula34;

public class MinhaCalculadoraTeste {

    static int resultadoSoma;

    public static void main(String[] args) {

        // MinhaCalculadora calc = new MinhaCalculadora(); não é mais necessário

        resultadoSoma = MinhaCalculadora.soma(1, 2);
        System.out.println("1 + 2 = " + resultadoSoma);

        // System.out.println("1 + 2 = " + MinhaCalculadora.soma(1, 2));

    }

}
