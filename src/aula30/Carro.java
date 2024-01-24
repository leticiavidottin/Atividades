package aula30;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel; // capacidade do tanque
    double consumoCombustivel;

    public Carro() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
        super();
        this.marca = marca; // o primeiro marca refere-se à declaração do
                            // atributo na classe, enquanto o segundo refere-se
                            // ao valor que será inicializado (podemos consultar
                            // cada um clicando nele e depois apertando F3, o
                            // que nos levará até o original de cada um
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    } // criado indo em Source > Generate constructors using Fields

    public Carro(String marca, String modelo) {
        this(marca, modelo, 10);
        System.out.println("Chamando construtor com 2 parâmetros");
    }

    public Carro(String marca, String modelo, int numPassageiros) {
        super();
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        System.out.println("Chamando construtor com 3 parâmetros");
    }

}
