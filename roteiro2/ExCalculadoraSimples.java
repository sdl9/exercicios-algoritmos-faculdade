package roteiro2;

/*
Proponha um algoritmo em Java que peça ao usuário que digite 
2 números, obtenha esses dois valores, calcule e exiba: 
a soma, o produto, a diferença e a divisão. 
*/

import java.util.Scanner;

public class ExCalculadoraSimples {

    public static void main(String[] args) {

        double numero1;
        double numero2;
        double soma, produto, diferenca, divisao;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Forneça dois números a serem somados, multiplicados, diminuídos e divididos: ");

        numero1 = leitor.nextDouble();
        numero2 = leitor.nextDouble();

        soma = numero1 + numero2;
        produto = numero1 * numero2;
        diferenca = numero1 - numero2;
        divisao = numero1 - numero2;

        System.out.println("soma = " + soma);
        System.out.println("produto = " + produto);
        System.out.println("diferenca = " + diferenca);
        System.out.println("divisao = " + divisao);
    }

}
