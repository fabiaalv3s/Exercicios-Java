/*11. Um tonel de refresco é feito com 8 partes de água mineral e 2 partes de suco de
maracujá. Faça um algoritmo para calcular quantos litros de água e de suco são
necessários para se fazer uma certa quantidade de litros de refresco informados pelo
usuário*/

import java.util.Scanner;

public class exercicio11
{
    public static void main (String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        float litros;
        float agua;
        float maracuja;

        System.out.println("Digite a qtd de litros de suco necessaria: ");
        litros = teclado.nextFloat();

        agua = litros * 0.8f;
        maracuja = litros * 0.2f;

        System.out.println("Serão necessários para fazer " + litros + "l de suco de maracujá: ");
        System.out.printf("%.2f l de água \n", agua);
        System.out.printf("%.2f l de maracujá \n", maracuja);


    }
}
