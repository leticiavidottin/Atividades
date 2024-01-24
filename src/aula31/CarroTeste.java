package aula31;

public class CarroTeste {

    public static void main(String[] args) {

        Carro van = new Carro();

        van.setMarca("Fiat");
        van.setModelo("Ducato");
        van.setNumPassageiros(10);

        System.out.println("Marca: " + van.getMarca());
        System.out.println("Modelo: " + van.getModelo());
        System.out.println("Número de passageiros: " + van.getNumPassageiros());

    }

}
