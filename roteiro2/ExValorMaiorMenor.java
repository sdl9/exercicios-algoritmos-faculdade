package roteiro2;

/*
Escreva um algoritmo em Java que a partir de 2 inteiros informados pelo usuário, 
identifique qual o maior valor entre eles e o exibe seguido das palavras “valor maior“. 
Caso os números sejam iguais, exiba a mensagem “valores iguais”.
*/

import java.util.Scanner;

public class ExValorMaiorMenor {

    public static void main(String[] args) {

        int numero1;
        int numero2;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Forneça dois números inteiros: ");

        numero1 = leitor.nextInt();
        numero2 = leitor.nextInt();

        if (numero1 > numero2) {
            System.out.println(numero1 + " é de maior valor!");
        }

        if (numero2 > numero1) {
            System.out.println(numero2 + " é de maior valor!");
        }

        if (numero1 == numero2) {
            System.out.println("valores iguais!");
        }

    }

}
