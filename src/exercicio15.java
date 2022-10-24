/*15. A empresa Hipotheticus paga R$10,00 por hora normal trabalhada, R$15,00 por hora
extra e R$ 90 reais por cada dependente menor que 6 anos. Faça um algoritmo que
solicite a quantidade de horas normais e extras trabalhadas no mês além da quantidade
de dependentes menores que 6 anos. Considere que o salário líquido é igual ao salário de
horas normais descontando-se 11% de impostos. O salário final é o salário liquido mais o
valor recebido por cada dependente mais as horas extras.*/


import java.util.Scanner;

public class exercicio15
{
    public static void main (String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        float horasNormais, horaTrabalhada;
        float horasExtras, adicionalExtra;
        float dependentes, adicionalDependentes;
        float salarioLiquido;
        float salarioFinal;

        System.out.printf("Digite a quantidade total de horas normais: ");
        horasNormais = teclado.nextFloat();
        System.out.printf("Digite a quantidade de horas extras: ");
        horasExtras = teclado.nextFloat();
        System.out.printf("Digite a quantidade de dependentes menores de 6 anos: ");
        dependentes = teclado.nextInt();

        horaTrabalhada = horasNormais * 10;
        adicionalExtra = horasNormais * 15;
        adicionalDependentes = horasNormais * 90f;
        salarioLiquido = horasNormais * 0.89f;
        salarioFinal = horasNormais + adicionalDependentes + adicionalExtra +salarioLiquido;

        System.out.printf("Horas normais: R$ %.2f\n", horasNormais);
        System.out.printf("Adicional Horas Extras: R$ %.2f\n", adicionalExtra);
        System.out.printf("Adicional de Dependentes: R$ %.2f\n", adicionalDependentes);
        System.out.printf("Salário Líquido (Hrs normais - Desconto (11%%)): R$ %.2f\n", salarioLiquido);
        System.out.printf("Salário final: R$ %.2f\n", salarioFinal);






    }
}
