/*05. Faça um algoritmo que receba dois números inteiros, calcule e mostre a divisão do
primeiro número pelo segundo. Sabe-se que o segundo número não pode ser zero,
portanto não é necessário se preocupar com validações.
Resultado esperado:
OBS: Para forçar uma divisão de dois números inteiro produzir um resultado fracionário,
utilizamos a palavra float entre parênteses. Exemplo: (a/(float)b). Neste caso, forçamos o
compilador entender que a variavel b apesar de ser inteira deve ser convertida para float*/

import java.util.Scanner;

public class exercicio05
{
    public static void main (String []args)
    {
        int numero01;
        int numero02;
        double resultado;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o valor 1: ");
        numero01 = teclado.nextInt();

        System.out.println("Informe o valor 2: ");
        numero02 = teclado.nextInt();

        resultado = numero01/(float)numero02;

        System.out.printf("RESULTADO DA DIVISÃO: %.2f", resultado);


    }

}
