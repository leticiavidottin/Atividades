package aula11;

public class SequenciaEscape {

    public static void main(String[] args) {

        // Queremos imprimir isso: "Hello World!"

        System.out.println("\"Hello World!\"");
        System.out.print("\"Hello World!\"\n\r"); // println é o mesmo que fazer
                                                  // isso

        // Agora queremos imprimir: 1\4
        System.out.println("1\\4"); // para tal, adicionar \\

    }
}
