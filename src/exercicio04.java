/*04. Faça um algoritmo que calcule e mostre a tabuada de (+, -, * e /) de um número
digitado pelo usuário.

Resultado esperado:
OBS: Quando se calcula em uma substração um numero menor de um número maior (ex:
3 - 10) o resultado será um número negativo. Pesquise como desprezar o sinal negatio
para sempre termos um número positivo*/

import java.util.Scanner;

public class exercicio04
{
    public static void calcula(int x, int y)
    {
        System.out.print(x + " + " + y + " = " + (x + y));
        System.out.print("\t\t" + x + " - " + y + " = " + (x - y));
        System.out.print("\n");

    }

    public static void calcula01(int a, int b)
    {
        System.out.print(a + " * " + b + " = " + (a * b));
        System.out.print("\t\t" + a + " / " + b + " = " + (a / b));
        System.out.print("\n");

    }

    public static void main (String[] args)
    {
        int valor;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o valor para o calculo da tabuada: ");
        valor = teclado.nextInt();

        System.out.println("TABUADA DO MAIS E MENOS PARA O NUMERO " + valor);

        calcula(valor,0);
        calcula(valor,1);
        calcula(valor,2);
        calcula(valor,3);
        calcula(valor,4);
        calcula(valor,5);
        calcula(valor,6);
        calcula(valor,7);
        calcula(valor,8);
        calcula(valor,9);
        calcula(valor,10);

        System.out.println("TABUADA DA MULTIPLICAÇÃO E DIVISÃO PARA O NUMERO " + valor);


        calcula01(valor,1);
        calcula01(valor,2);
        calcula01(valor,3);
        calcula01(valor,4);
        calcula01(valor,5);
        calcula01(valor,6);
        calcula01(valor,7);
        calcula01(valor,8);
        calcula01(valor,9);
        calcula01(valor,10);


    }
}
