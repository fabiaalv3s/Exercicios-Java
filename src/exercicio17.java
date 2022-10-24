/*17. Uma padaria vende uma certa quantidade de pães franceses e uma quantidade de
broas a cada dia. Cada pãozinho custa R$ 0,12 e a broa custa R$ 1,60. Ao final do dia, o
dono quer saber quanto arrecadou com a venda dos pães e broas (juntos), e quanto deve
guardar numa conta de poupança (10% do total arrecadado) para realizar uma reforma.
Você foi contratado para fazer os cálculos para o dono. Com base nestes fatos, faça um
algoritmo para ler as quantidades de pães e de broas, o valor da reforma e depois calcule
o valor arrecado, o valor a ser depositado na poupança e quantos dias serão necessários,
caso mantenha o mesmo faturamento, para custear a reforma.
Requisito adicional: A quantidade de dias deve ser retornado como um valor inteiro.
Exemplo: 3.78 dias deverá retornar 4 dias
9.2 dias deverá retornar 10 dias
10.89 dias deverá retornar 11 dias*/

import java.util.Scanner;
import java.util.*;

public class exercicio17
{
    public static void main (String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        int qtdPaes;
        int qtdBroas;
        float valorReforma;
        float vendaBroa, vendaPao, vendaDiaria;
        float poupanca;
        float diasReforma;


        System.out.print("Digite a quantidade pães vendidos: ");
        qtdPaes = teclado.nextInt();
        System.out.print("Digite a quantidade broas vendidas: ");
        qtdBroas = teclado.nextInt();
        System.out.print("Digite o valor da reforma: ");
        valorReforma = teclado.nextFloat();

        vendaPao = qtdPaes * 0.12f;
        vendaBroa = qtdBroas * 1.60f;
        vendaDiaria = vendaBroa + vendaPao;
        poupanca = 0.10f * vendaDiaria;
        diasReforma = valorReforma / poupanca;

        System.out.printf("Faturamento com a venda de pães: R$ %.2f\n", vendaPao);
        System.out.printf("Faturamento com a venda de broas: R$ %.2f\n", vendaBroa);
        System.out.printf("Faturamento diário (pães + broas): R$ %.2f\n", vendaDiaria);
        System.out.printf("Faturamento com a venda de pães: R$ %.2f\n", vendaPao);
        System.out.printf("Valor do depósito na poupança: R$ %.2f\n", poupanca);
        System.out.println("Para pagar a reforma serão necessáios: " + Math.ceil(diasReforma) + " dias ");

    }
}
