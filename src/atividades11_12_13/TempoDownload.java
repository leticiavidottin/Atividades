package atividades11_12_13;

import java.util.Scanner;

public class TempoDownload {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamanho do arquivo em MB: ");
        double tamanho = scan.nextDouble();

        System.out.println("Digite agora a velocidade do seu link de Internet em Mbps: ");
        double link = scan.nextDouble();

        scan.close();

        // 8 bits = 1 byte

        double conversaoArquivo = tamanho * 8; // transformando MB em Mb
        double tempoSegundos = conversaoArquivo / link;
        double tempoMinutos = tempoSegundos / 60;
        System.out.println("Seu download irá demorar " + tempoMinutos + " minutos");

    }

}
