package aula27;

public class CarroTeste {

    public static void main(String[] args) {

        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        van.exibirAutonomia();
        double autonomia = van.obterAutonomia();
        System.out.println("A autonomia do carro é: " + autonomia);

        System.out.println();
        double qtddCombustivel10 = van.calcularCombustivel(10);
        double qtddCombustivel15 = van.calcularCombustivel(15);

        System.out.println("Para 10 kms serão necessários " + qtddCombustivel10);
        System.out.println("Para 15 kms serão necessários " + qtddCombustivel15);
        System.out.println();

        Carro fusca = new Carro();
        fusca.marca = "Volkswagen";
        fusca.modelo = "Fusca";
        fusca.numPassageiros = 4;
        fusca.capCombustivel = 30;
        fusca.consumoCombustivel = 0.15;

        fusca.exibirAutonomia();

    }

}
