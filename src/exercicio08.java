/*8. Faça um algoritmo para ler o salário de um funcionário e aumentá-Io em 15%. Após o
aumento, desconte 11% de INSS e 8% de FGTS. Imprima o salário inicial, o salário com o
aumento, o salário final, o desconto do INSS, o desconto do FGTS e o Total de Descontos
(INSS+FGTS).*/

import java.util.Scanner;

public class exercicio08
{
    public static void main (String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        float salarioFuncionario;
        float salarioFuncionarioAtualizado;
        float descontoINSS, descontoFGTS;
        float totalDescontos;
        float salarioFinal;

        System.out.println("Digite o salário do funcionário: ");
        salarioFuncionario = teclado.nextFloat();

        salarioFuncionarioAtualizado = (salarioFuncionario * 1.15f);
        descontoFGTS = salarioFuncionarioAtualizado * 0.08f;
        descontoINSS = salarioFuncionarioAtualizado * (float) 0.11;

        System.out.printf("Salário Inicial:  R$ %.2f \n", salarioFuncionario);
        System.out.printf("Salário reajustado em 15%%: R$ %.2f \n", salarioFuncionarioAtualizado);
        System.out.printf("Desconto INSS: R$ %.2f \n", descontoINSS);
        System.out.printf("Desconto FGTS: R$ %.2f \n", descontoFGTS);

        totalDescontos = descontoFGTS + descontoINSS;

        System.out.printf("Total de Descontos FGTS + INSS: R$ %.2f \n", totalDescontos);

        salarioFinal = salarioFuncionarioAtualizado - totalDescontos;
        System.out.printf("Salário Final: R$ %.2f \n", salarioFinal);



    }


}
