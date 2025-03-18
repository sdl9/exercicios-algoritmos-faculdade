package roteiro1;

import java.util.Scanner;

public class ExRestaurante {

    public static void main(String[] args) {

        double valor;
        double pessoas;
        
        
        System.out.println ("Informe o valor total da conta: ");
        Scanner leitor = new Scanner (System.in);
        valor = leitor.nextDouble();
        
        System.out.println ("Informe a quantidade de pessoas: ");
        Scanner leitor2 = new Scanner (System.in);
        pessoas = leitor2.nextDouble();
        
        double conta;
        conta = valor / pessoas;
        
        System.out.println ("O valor a ser pago por cada um é de = " + conta);
        
        }
    
}
