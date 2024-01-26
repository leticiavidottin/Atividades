package aula45;

public class Teste2 {

    public static void main(String[] args) {
        Object obj1 = obterString();
        String s1 = (String) obj1; // este downcasting pode ser feito sem
                                   // problemas

        Object obj2 = "Minha String";
        String s2 = (String) obj2; // upcasting

        Object obj3 = new Object();
        // String s3 = (String) obj3;
        // isso falha pq não faz referência a nenhuma String

        Object obj4 = obterInteiro();
        // String s4 = (String) obj4;
        // falha pq estou passando um inteiro e ele precisa de uma String

        // o downcasting só funciona se estivermos referenciando algum "tipo" em
        // particular, que nem os dois primeiros exemplos realizados aqui
    }

    public static String obterString() {
        return "minha String";
    }

    public static int obterInteiro() {
        return 1;
    }

}
