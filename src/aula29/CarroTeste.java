package aula29;

public class CarroTeste {

    public static void main(String[] args) {

        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        // van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println("Número de passageiros: " + van.numPassageiros);

        Carro fusca = new Carro("Volkswagen", "Fusca");
        System.out.println(fusca.marca + " " + fusca.modelo);

    }

}
