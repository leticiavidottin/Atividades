package atividades34;

public class ContadorTeste {

    public static void main(String[] args) {

        Contador count1 = new Contador();
        count1.imprimirContador();
        System.out.println("Instanciado");

        Contador count2 = new Contador();
        count2.imprimirContador();
        System.out.println("Instanciado");

        count2.incrementarContador();

        count2.imprimirContador();
        System.out.println("Incrementado");

        count2.zerarContador();
        count2.imprimirContador();
        System.out.println("Zerado");

        Contador count3 = new Contador();
        count3.imprimirContador();
        System.out.println("Instanciado");
    }

}
