/*20. Ler um número inteiro com até quatro dígitos e imprimir a saída da seguinte forma:
MILHARES = x
CENTENA = x
DEZENA = x
UNIDADE = x */

import java.util.Scanner;

public class exercicio20
{
    public static void main (String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        int numero;
        int milhares,centena, dezena, unidade;

        System.out.print("Digite um numero de 4 digitos: ");
        numero = teclado.nextInt();

        milhares = numero/1000;
        centena = (numero - milhares * 1000)/100; //numero%1000
        dezena = numero/10 %10;
        unidade = (numero - milhares * 1000 - centena*100 - dezena*10);

        System.out.println("MILHARES: " + milhares);
        System.out.println("CENTENA: " + centena);
        System.out.println("DEZENA: " + dezena);
        System.out.println("UNIDADE: " + unidade);



    }
}
