/*13. A fábrica de refrigerantes Meia-Cola vende seu produto em três formatos: lata de 350
ml, garrafa de 600 ml e garrafa de 2 litros. Se um comerciante compra uma determinada
quantidade de cada formato, faça um algoritmo para calcular quantos litros de refrigerante
ele comprou.*/

import java.util.Scanner;

public class exercicio13
{
    public static void main (String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        float lata, garrafa6, garrafa2l;
        float litrosTotal;

        System.out.println("Digite a quatidade de latas de 350ml: ");
        lata = teclado.nextFloat();
        System.out.println("Digite a quatidade de garrafas de 600ml: ");
        garrafa6 = teclado.nextFloat();
        System.out.println("Digite a quatidade de garrafas de 2L: ");
        garrafa2l = teclado.nextFloat();

        litrosTotal = (0.350f * lata) + (0.600f * garrafa6) + (2f * garrafa2l);
        System.out.printf("A quantidade total em litro é de: %.2f", litrosTotal);

    }
}
