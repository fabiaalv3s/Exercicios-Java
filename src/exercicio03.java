/*03. Faça um algoritmo para ler três notas de um aluno em uma disciplina e imprimir a sua
média ponderada (as notas tem pesos respectivos de 1, 2 e 3).*/

import java.util.Scanner;

public class exercicio03
{
    public static void main (String []args)
    {
        double nota01;
        double nota02;
        double nota03;
        double media;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a nota 01: ");
        nota01 = teclado.nextDouble();

        System.out.println("Informe a nota 02: ");
        nota02 = teclado.nextDouble();

        System.out.println("Informe a nota 03: ");
        nota03 = teclado.nextDouble();

        media=((nota01*1)+(nota02*2)+(nota03*3))/6;

        System.out.print("A media ponderada das notas é: " + media);

    }
}
