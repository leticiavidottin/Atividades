package aula17;

public class LoopFor {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }

        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i = " + i + "; j = " + j);
        }

        int cont = 0;
        for (; cont < 10;) {
            System.out.println("cont = " + cont);
            cont += 2;
        } // é uma maneira de se fazer, porém não é muito recomendada, a não ser
          // que queira deixar o cont travado no valor final para continuar
          // depois como variável global

        int soma = 0;
        for (int i = 0; i < 5; soma += i++) {
            System.out.println("Soma = " + soma);
        }

    }

}
