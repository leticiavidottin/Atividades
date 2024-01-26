package aula44;

public interface AnimalDomesticado {

    public final int ANO = 2024; // todas os atributos devem ser constantes
    int CONSTANTE = 0; // podemos declarar apenas assim para evitar o pleonasmo

    public abstract void levarVeterinario(); // não é necessário fazer essa
                                             // descrição, apenas que nem a de
                                             // baixo já é o suficiente

    void alimentar();

}
