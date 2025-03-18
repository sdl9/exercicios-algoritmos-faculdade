package roteiro2;

/* 
Escreva um algoritmo em Java que leia 3 números inteiros diferentes, 
e depois apresente a soma, o produto, o menor e o maior desses números. 
*/

import java.util.Scanner;

public class ExCalcTresNum {

    public static void main(String[] args) {

        int numero1, numero2, numero3;
        int soma, produto, maior, menor;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Forneça três números inteiros: ");

        numero1 = leitor.nextInt();
        numero2 = leitor.nextInt();
        numero3 = leitor.nextInt();

        soma = numero1 + numero2 + numero3;
        produto = numero1 * numero2 * numero3;

        System.out.println("A soma dos três números é: " + soma);
        System.out.println("O produto dos três números é: " + produto);

        maior = numero1;

        if (numero2 > maior) {
            maior = numero2;
        }

        if (numero3 > maior) {
            maior = numero3;
        }

        System.out.println(maior + " é o maior número!");

        menor = numero1;

        if (numero2 < menor) {
            menor = numero2;
        }

        if (numero3 < menor) {
            menor = numero3;
        }

        System.out.println(menor + " é o menor número!");

    }

}
