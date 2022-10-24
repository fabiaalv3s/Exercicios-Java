/*10. Faça um algoritmo que receba o ano de nascimento de uma pessoa e o ano atual,
calcule e mostre.
a) a idade dessa pessoa em anos;
b) a idade dessa pessoa em meses;
c) a idade dessa pessoa em dias; considere todos os meses com 30 dias
d) a idade dessa pessoa em semanas, considere que todos os messes possuem 4
semanas;*/

import java.util.Scanner;

public class exercicio10
{
    public static void main (String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        int anoInicial;
        int anoFinal;

        System.out.println("Digite o ano inicial: ");
        anoInicial = teclado.nextInt();
        System.out.print("Digite o ano final: ");
        anoFinal = teclado.nextInt();


        int anos;
        int meses;
        int dias;
        int semanas;

        anos = anoFinal - anoInicial;
        meses = anos * 12;
        semanas = meses * 4;
        dias = semanas * 7;


        System.out.println("A idade dessa pessoa em:");
        System.out.println("Anos: " + anos + "\n");
        System.out.println("Meses: " + meses + "\n");
        System.out.println("Semanas: " + semanas + "\n");
        System.out.println("Dias: " + dias + "\n");





    }
}
