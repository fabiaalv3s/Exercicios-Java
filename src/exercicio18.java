/*18. Três amigos, Carlos, André e Felipe. decidiram rachar igualmente a conta de um bar.
Faça um algoritmo para ler o valor total da conta e imprimir quanto cada um deve pagar,
mas faça com que Carlos e André não paguem centavos. Ex: uma conta de R$101,53
resulta em R$33,00 para Carlos, R$33,00 para André e R$35,53 para Felipe.*/


import java.util.Scanner;

public class exercicio18
{
    public static void main (String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        double conta;
        double valorFelipe;
        int valorDivido;

        System.out.print("Informe o valor da conta: R$ ");
        conta = teclado.nextDouble();

        valorDivido = (int) conta / 3;
        valorFelipe = (conta - (valorDivido*2));


        System.out.println("Carlos pagará: R$ " + (int)valorDivido);
        System.out.println("André pagará: R$ " + (int)valorDivido);
        System.out.println("Felipe pagará: R$ " + valorFelipe );

    }

}
