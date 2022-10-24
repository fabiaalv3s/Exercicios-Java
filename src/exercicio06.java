/*06. Faça um algoritmo para calcular quantas ferraduras são necessárias para equipar
todos os cavalos comprados para um haras. O usuário devera informar a quantidade de
cavalos adquiridos*/

import java.util.Scanner;

public class exercicio06
{
    public static void main (String []args)
    {
        float qtdCavalo, qtdFerradura;
        float valorFerradura;
        float resultado;


        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a quantidade de cavalos: ");
        qtdCavalo = teclado.nextFloat();

        System.out.println("Informe o valor de cada ferradura R$: ");
        valorFerradura = teclado.nextFloat();

        qtdFerradura = qtdCavalo * 4;
        resultado = qtdFerradura * valorFerradura;

        System.out.println("QUANTIDADE DE FERRADURAS NECESSÁRIAS: " + qtdFerradura);
        System.out.println("VALOR TOTAL PARA COMPRA: R$" + resultado);

    }
}
