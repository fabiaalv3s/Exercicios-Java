/*12. A granja Frangotech possui um controle automatizado de cada frango da sua
produção. No pé direito do frango há um anel com um chip de identificação; no pé
esquerdo são dois anéis para indicar o tipo de alimento que ele deve consumir. Sabendo
que o anel com chip custa R$4,00 e o anel de alimento custa R$3,50, faça um algoritmo
para calcular o gasto total da granja para marcar todos os seus frangos que deverá ser
informado pelo usuário*/

import java.util.Scanner;

public class exercicio12
{
    public static void main (String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        int qtdFrangos;
        float valorTotal;

        System.out.println("Digite a quantidade de frangos: ");
        qtdFrangos = teclado.nextInt();

        valorTotal = qtdFrangos * (4.00f + 7.00f);

        System.out.printf("O valor total para identificar os frangos é: %.2f", valorTotal);
    }
}
