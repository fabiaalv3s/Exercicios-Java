/*7. Faça um algoritmo que receba o peso de uma pessoa, calcule e mostre:
a) o novo peso se a pessoa engordar 15% sobre o peso digitado;
b) o novo peso se a pessoa emagrecer 20% sobre o peso digitado.*/

import java.util.Scanner;

public class exercicio07
{
    public static void main (String[] args)
    {
        float peso;
        float engordar;
        float emagrecer;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o valor em KG: ");
        peso = teclado.nextFloat();

        engordar = peso * (float)1.15;
        emagrecer = peso * 0.8f;

        System.out.println("-> Caso a pessoa engorde 15%: " + engordar);
        System.out.println("-> Caso a pessoa emagreça 20% " + emagrecer);



    }
}
