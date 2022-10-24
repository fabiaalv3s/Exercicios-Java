/*01. Uma imobiliária vende apenas terrenos retangulares. Faça um algoritmo para imprimir a
área do terreno e o valor de venda do mesmo. Para isto será necessário o usuário
informar as dimensões em metros (frente e lateral) do terreno além do valor cobrado pelo
metro quadrado.*/

import java.util.Scanner;

public class exercicio01
{
    public static void main (String[]args)
    {
        double valorFrente;
        double valorFundo;
        double metroq;
        double area;
        double preco;

        Scanner teclado = new Scanner(System.in);

        System.out.println(" Quantos metros o terreno possui de frente: ");
        valorFrente = teclado.nextDouble();

        System.out.println("Quantos metros o terreno possui de lateral: ");
        valorFundo = teclado.nextDouble();

        System.out.println("Informe o valor do metro quadrado: ");
        metroq = teclado.nextDouble();

        area = valorFrente * valorFundo;
        preco = area * metroq;

        System.out.print("A Area total do terreno de " + valorFrente + " mts de frente com " + valorFundo + " mts ");
        System.out.println(" de lateral e: " + area);

        System.out.printf("O valor deste terreno e: %.2f R$ ", preco);

    }
}



