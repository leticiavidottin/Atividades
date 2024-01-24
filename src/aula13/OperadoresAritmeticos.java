package aula13;

public class OperadoresAritmeticos {

    public static void main(String[] args) {

        int resultado = 1 + 2;
        System.out.println(resultado);

        resultado = resultado - 1;
        System.out.println(resultado);

        resultado = resultado * 2;
        System.out.println(resultado);

        resultado = resultado / 2;
        System.out.println(resultado);

        resultado = resultado + 8;
        System.out.println(resultado);

        resultado = resultado % 7;
        System.out.println(resultado);

        String primeiroNome = "Esta é";
        String segundoNome = " uma String concatenada";
        String terceiroNome = primeiroNome + segundoNome;
        System.out.println(terceiroNome);

        resultado = resultado + 1;
        System.out.println(resultado); // 4
        resultado++;
        System.out.println(resultado); // 5

        System.out.println(resultado++); /*
                                          * 5: soma após exibir o resultado.
                                          * Deste modo, insere na tela o valor
                                          * anterior e, após realizar o
                                          * descrito, faz o incremento
                                          */
        System.out.println(++resultado); /*
                                          * 7: faz o incremento e, só então,
                                          * mostra o resultado após. Isso
                                          * acontece por conta da ordem em que o
                                          * ++ foi inserido no código
                                          */

        System.out.println(resultado); // 7

        System.out.println(resultado++); // Isto é o mesmo que:
        // resultado = resultado + 1; //e que:
        // resultado += 1;

        System.out.println(resultado); // 8

        System.out.println(++resultado); // Isto é o mesmo que:
        // resultado += 1;

        System.out.println(--resultado);
        System.out.println(resultado--);
        System.out.println(resultado);

    }

}
