/*14. A lanchonete Gostosura vende apenas um tipo de sanduíche, cujo recheio inclui duas
fatias de queijo, uma fatia de presunto e uma rodela de hambúrguer. Sabendo que cada
fatia de queijo ou presunto pesa 50 gramas, e que a rodela de hambúrguer pesa 120
gramas, faça um algoritmo em que o dono forneça a quantidade de sanduíches a fazer, e
a máquina informe as quantidades (em quilos) de queijo, presunto e carne necessários
para compra*/

import java.util.Scanner;

public class exercicio14
{
    public static void main (String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        float qtdSanduiches;
        float queijo;
        float presunto;
        float hamburguer;

        System.out.println("Digite a quatidade de sanduíches: ");
        qtdSanduiches = teclado.nextFloat();

        queijo = qtdSanduiches * 0.1f;
        presunto = qtdSanduiches * 0.05f;
        hamburguer = qtdSanduiches * 0.12f;

        System.out.printf("QUEIJO: %.2f kg\n", queijo);
        System.out.printf("PRESUNTO: %.2f kg\n", presunto);
        System.out.printf("HAMBURGUER: %.2f kg34\n", hamburguer );





    }

}
