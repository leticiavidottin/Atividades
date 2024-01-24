package atividades34;

public class ConversaoDeUnidadesDeTempo {

    private static double conversao;

    public static void converterMinutosSegundos(double valor) {

        conversao = valor * 60;

        System.out.println(valor + " minuto(s) = " + conversao + " segundo(s)");
    }

    public static void converterHorasMinutos(double valor) {

        conversao = valor * 60;

        System.out.println(valor + " hora(s) = " + conversao + " minuto(s)");
    }

    public static void converterDiasHoras(double valor) {

        conversao = valor * 24;

        System.out.println(valor + " dia(s) = " + conversao + " hora(s)");
    }

    public static void converterSemanasDias(double valor) {

        conversao = valor * 7;

        System.out.println(valor + " semana(s) = " + conversao + " dia(s)");
    }

    public static void converterMesDias(double valor) {

        conversao = valor * 30;

        System.out.println(valor + " mês(s) = " + conversao + " dia(s)");
    }

    public static void converterAnoDias(double valor) {

        conversao = valor * 365.25;

        System.out.println(valor + " ano(s) = " + conversao + " dia(s)");
    }

}
