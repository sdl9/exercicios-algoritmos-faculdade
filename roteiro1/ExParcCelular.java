package roteiro1;

import java.util.Scanner;

public class ExParcCelular {

    public static void main(String[] args) {

        double valor;
        double parcelas;

        System.out.println("Informe o valor total do celular: ");
        Scanner leitor = new Scanner(System.in);
        valor = leitor.nextDouble();

        System.out.println("Informe a quantidade de parcelas: ");
        Scanner leitor2 = new Scanner(System.in);
        parcelas = leitor2.nextDouble();

        double conta;
        conta = valor / parcelas;

        System.out.println("O valor a ser pago em cada parcela é de = " + conta);

    }

}
