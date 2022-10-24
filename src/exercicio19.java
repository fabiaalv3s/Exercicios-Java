/*19. Entrar com o dia e o mês de uma data e informar quantos dias se passaram desde o
início do ano. Esqueça a questão dos anos bissextos e considere sempre que um mês
possui 30 dias.*/

import java.util.Scanner;

public class exercicio19
{
    public static void main (String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        int mes, dia;
        int diasPassados;

        System.out.print("Digite o dia: ");
        dia = teclado.nextInt();;
        System.out.print("Digite o mês: ");
        mes = teclado.nextInt();

        diasPassados = (mes * 30) + dia;

        System.out.println("Já se passaram: " + diasPassados + " dias ");

    }
}
