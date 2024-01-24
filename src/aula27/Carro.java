package aula27;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel; // capacidade do tanque
    double consumoCombustivel;

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
