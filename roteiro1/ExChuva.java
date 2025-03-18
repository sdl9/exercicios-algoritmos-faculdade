package roteiro1;
import java.util.Scanner;

public class ExChuva {
    public static void main(String[] args) {

        double dia1;
        double dia2;
        double dia3;
        double dia4;
        double dia5;

        System.out.println("Informe a quantidade de chuva que cairá ao longo de 5 dias: ");
        Scanner leitor = new Scanner(System.in);
        dia1 = leitor.nextDouble();
        dia2 = leitor.nextDouble();
        dia3 = leitor.nextDouble();
        dia4 = leitor.nextDouble();
        dia5 = leitor.nextDouble();

        double soma;
        soma = dia1 + dia2 + dia3 + dia4 + dia5;

        System.out.println("A soma total da chuva durante os 5 dias é = " + soma);

        double media;
        media = soma / 5;

        System.out.println("A média de chuva durante os 5 dias é = " + media);

    }
}
