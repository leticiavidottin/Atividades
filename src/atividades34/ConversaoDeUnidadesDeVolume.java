package atividades34;

public class ConversaoDeUnidadesDeVolume {

    private static double conversao;

    public static void converterLitrosCentimetros3(double valor) {

        conversao = valor * 1000;

        System.out.println(valor + " litro(s) = " + conversao + " centímetro(s) cúbico(s)");

    }

    public static void converterMetros3Litros(double valor) {

        conversao = valor * 1000;

        System.out.println(valor + " metro(s) cúbico(s) = " + conversao + " litro(s) ");

    }

    public static void converterMetro3Pes3(double valor) {

        conversao = valor * 35.32;

        System.out.println(valor + " metro(s) cúbico(s) = " + conversao + " pé(s) cúbico(s)");

    }

    public static void converterGalaoAmericanoPolegada3(double valor) {

        conversao = valor * 231;

        System.out.println(valor + " galão(ões) americano(s) = " + conversao + " polegada(s) cúbica(s)");

    }

    public static void converterGalaoAmericanoLitros(double valor) {

        conversao = valor * 3785;

        System.out.println(valor + " galão(ões) americano(s) = " + conversao + " litro(s) ");

    }

}
