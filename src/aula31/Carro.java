package aula31;

public class Carro {

    private String marca;
    private String modelo;
    private int numPassageiros;
    private double capCombustivel; // capacidade do tanque
    private double consumoCombustivel;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumPassageiros() {
        return numPassageiros;
    }

    public void setNumPassageiros(int numPassageiros) {
        this.numPassageiros = numPassageiros;
    }

    public void exibirAutonomia() {
        System.out.println("A autonomia do " + modelo + " é: " + (capCombustivel * consumoCombustivel) + "kms");
    }

    public double obterAutonomia() {
        System.out.println("Método obter autonomia chamado.");
        return capCombustivel * consumoCombustivel;
    }

    public double calcularCombustivel(double km) {
        double qtddCombustivel = km / consumoCombustivel;

        return qtddCombustivel;
    }

}
