package atividades34;

public class Calculadora {

    public static void somarValores(double num1, double num2) {
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }

    public static void subtrairValores(double num1, double num2) {
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    }

    public static void multiplicarValores(double num1, double num2) {
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
    }

    public static void dividirValores(double num1, double num2) {
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
    }

    public static void potenciarValores(double num1, double num2) {
        System.out.println(num1 + " ^ " + num2 + " = " + Math.pow(num1, num2));
    }

    public static double calcularFatorial(double num1) {

        if (num1 == 0 || num1 == 1) {
            return 1;
        } else {
            return num1 * calcularFatorial(num1 - 1);
        }

    }

    public static void retornarFatorial(double num1) {
        System.out.println(num1 + "! = " + calcularFatorial(num1));
    }
}
