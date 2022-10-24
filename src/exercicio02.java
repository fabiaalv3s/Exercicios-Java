/*02. Faça um algoritmo que receba o valor do salário mínimo e o valor do salário de um
funcionário, calcule e mostre a quantidade de salários mínimos que ganha esse funcionário*/

import java.util.Scanner;

public class exercicio02
{
    public static void main (String []args)
    {
        double salarioMinimo;
        double salarioFuncionario;
        double resultado;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o valor atual do salário mínimo: ");
        salarioMinimo = teclado.nextDouble();


        System.out.println("Informe o salário do funcionário: ");
        salarioFuncionario = teclado.nextDouble();

        resultado = salarioFuncionario / salarioMinimo;

        System.out.println("O funcionário recebe: " + resultado + " salários mínimos.");


    }

}
