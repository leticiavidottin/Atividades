package aula29;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel; // capacidade do tanque
    double consumoCombustivel;

    Carro() {
        System.out.println("Classe Carro foi instanciada");
        numPassageiros = 4;
    }

    Carro(String marcas, String modelos) {
        marca = marcas;
        modelo = modelos; // inicializando outros construtores
    }

    void exibirAutonomia() {
        System.out.println("A autonomia do " + modelo + " é: " + (capCombustivel * consumoCombustivel) + "kms");
    }

    double obterAutonomia() {
        System.out.println("Método obter autonomia chamado.");
        return capCombustivel * consumoCombustivel;
    }

    double calcularCombustivel(double km) {
        double qtddCombustivel = km / consumoCombustivel;

        return qtddCombustivel;
    }

}
