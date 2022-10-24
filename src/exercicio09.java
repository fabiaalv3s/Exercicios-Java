/*09. Faça um algoritmo que leia os dados necessários para calcular e exibir a área:
Pesquisa na Internet como calculcar a área de cada objeto abaixo:
a) de um trapézio.
b) de um quadrado.
c) de um retangulo.
d) de um círculo.
e) de um triangulo*/

import java.util.Scanner;

public class exercicio09
{
    public static void main (String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        System.out.println("-> ÁREA DE TRAPÉZIO");
        float baseMaiorTrapezio;
        float baseMenorTrapezio;
        float alturaTrapezio;
        float areaTrapezio;

        System.out.print("Informe o valor da base maior: ");
        baseMaiorTrapezio = teclado.nextFloat();
        System.out.print("Informe o valor da base menor: ");
        baseMenorTrapezio = teclado.nextFloat();
        System.out.print("Informe o valor da altura: ");
        alturaTrapezio = teclado.nextFloat();

        areaTrapezio = ((baseMaiorTrapezio + baseMenorTrapezio) * alturaTrapezio)/2;
        System.out.print("Area do trapézio é: " + areaTrapezio + "\n\n");

        /////////////////////////////////////////////////////////////////////////////
        System.out.println("-> ÁREA DO QUADRADO ");
        float ladoQuadrado;
        float areaQuadrado;

        System.out.print("Informe o valor de um dos lados: ");
        ladoQuadrado = teclado.nextFloat();

        areaQuadrado =  ladoQuadrado * ladoQuadrado;
        System.out.println("Área do quadrado é: " + areaQuadrado + "\n\n");

        ///////////////////////////////////////////////////////////////////////////
        System.out.println("-> ÁREA RETÂNGULO");
        float baseRetangulo;
        float alturaRetangulo;
        float areaRetangulo;

        System.out.print("Informe o valor da base: ");
        baseRetangulo = teclado.nextFloat();
        System.out.print("Informe o valor da altura: ");
        alturaRetangulo = teclado.nextFloat();

        areaRetangulo = baseRetangulo * alturaRetangulo;
        System.out.print("A área do retângulo é: " + areaRetangulo + "\n\n");

        ///////////////////////////////////////////////////////////////////////////
        System.out.println("-> ÁREA CÍRCULO");
        float raioCirculo;
        float areaCirculo;

        System.out.print("Informe o valor do raio: ");
        raioCirculo = teclado.nextFloat();

        areaCirculo = 3.14f * (raioCirculo * raioCirculo);
        System.out.print("A área do circulo é: " + areaCirculo + "\n\n");

        ///////////////////////////////////////////////////////////////////////////
        System.out.println("-> AREA TRIÂNGULO");
        float baseTriangulo;
        float alturaTriangulo;
        float areaTriangulo;

        System.out.print("Informe o valor da base: ");
        baseTriangulo = teclado.nextFloat();
        System.out.print("Informe o valor da altura: ");
        alturaTriangulo = teclado.nextFloat();

        areaTriangulo = (baseTriangulo * alturaTriangulo)/2;
        System.out.print("A área do triângulo é: " + areaTriangulo + "\n\n");

    }

}
