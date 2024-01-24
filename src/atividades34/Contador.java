package atividades34;

public class Contador {

    private static int count = 0;

    public Contador() {
        super();
        this.count++;
    }

    public Contador(int count) {
        super();
        this.count = count++;
    }

    public void zerarContador() {
        this.count = 0;
    }

    public void incrementarContador() {
        this.count++;
    }

    public void imprimirContador() {
        System.out.println("O contador atualmente está em: " + count);
    }

}
