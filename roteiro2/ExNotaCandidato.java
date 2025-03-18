package roteiro2;

/* 
Proponha um algoritmo em Java para calcular a nota de um candidato em um concurso. 
Para isso, você deve ler as três notas do candidato entre 0 e 10. 
Em seguida, calcule a nota final dele no concurso, a qual corresponde à média ponderada, 
considerando que a primeira nota tem peso 2, a segunda tem peso 3 e a terceira tem peso 5. 
Exibir uma mensagem dizendo qual a média do aluno e se ele foi aprovado ou reprovado. 
A média para aprovação é 7.
*/

import java.util.Scanner;

public class ExNotaCandidato {

    public static void main(String[] args) {

        double nota1, nota2, nota3;
        double media, n1, n2, n3;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Forneça as três notas, de 0 à 10");

        nota1 = leitor.nextDouble();
        nota2 = leitor.nextDouble();
        nota3 = leitor.nextDouble();

        n1 = nota1 * 0.2;
        n2 = nota2 * 0.3;
        n3 = nota3 * 0.5;

        media = n1 + n2 + n3;

        System.out.println("A média é " + media);

        if (media >= 7) {
            System.out.println("Parabéns, está aprovado!");
        } else {
            System.out.println("Reprovado.");
        }

    }
}
