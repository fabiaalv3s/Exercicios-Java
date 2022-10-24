/*16. Uma loja de decoração precisa aumentar o seu faturamento para o próximo mês em
20%. Esta loja deseja atingir este objetivo aumentando a venda de três produtos. O
produto 1 custa R$ 150 o produto 2 R$ 220,00 e o produto 3 R$ 97.00. Faça um algoritmo
que receba o valor de faturamento do último mês e apresente:
a) O faturamento do próximo mês para bater a meta de 20%.
b) A quantidade de peças apenas do produto 1 necessárias para obter a meta desejada.
c) A quantidade de peças apenas do produto 2 necessárias para obter a meta desejada.
d) A quantidade de peças apenas do produto 3 necessárias para obter a meta desejada*/


import java.util.Scanner;

public class exercicio16
{
    public static void main (String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        float faturamentoAnterior;
        float meta;
        float aumento;
        float produto01, produto02, produto03;

        System.out.print("Digite o valor do faturamento anterior: R$ ");
        faturamentoAnterior = teclado.nextFloat();

        meta = faturamentoAnterior * 1.2f;
        aumento = meta - faturamentoAnterior;
        produto01 = meta / 150;
        produto02 = meta / 220;
        produto03 = meta / 97;

        System.out.printf("A meta do próximo mês é: R$ %.2f\n", meta);
        System.out.printf("Um aumento de: R$ %.2f\n", aumento);
        System.out.println("Quantidade a serem vendidas para atingir a meta: \n");

        System.out.printf("Produto 01: %.2f\n", produto01);
        System.out.printf("Produto 02: %.2f\n", produto02);
        System.out.printf("Produto 03: %.2f\n", produto03);



    }
}
