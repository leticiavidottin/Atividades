package atividades34;

public class ConversaoDeUnidadesDeArea {

    private static double conversao;

    public static void converterMetros2Pes2(double valor) {

        conversao = valor * 10.76;

        System.out.println(valor + " metro(s) quadrado(s) = " + conversao + " pé(s) quadrado(s)");

    }

    public static void converterPes2Centimetros2(double valor) {

        conversao = valor * 929;

        System.out.println(valor + " pés(s) quadrado(s) = " + conversao + " centímetros(s) quadrado(s)");

    }

    public static void converterMilhas2Acres(double valor) {

        conversao = valor * 640;

        System.out.println(valor + " milha(s) quadrado(s) = " + conversao + " acre(s)");

    }

    public static void converterAcresPes2(double valor) {

        conversao = valor * 43560;

        System.out.println(valor + " acre(s) = " + conversao + " pé(s) quadrado(s)");

    }

}
