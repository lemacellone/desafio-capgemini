package br.com.exercicios;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int tamanhoVetor = 5;
		int inteirosN[] = new int[tamanhoVetor];
		int tamanhoX = 1;
		int inteiroQualquerX[] = new int[tamanhoX];

		System.out.println("Digite abaixo uma lista de 5 números");
		System.out.println("------------------------------");
		System.out.println("Primeiro valor: ");
		inteirosN[0] = scan.nextInt();
		System.out.println("Segundo valor: ");
		inteirosN[1] = scan.nextInt();
		System.out.println("Terceiro valor: ");
		inteirosN[2] = scan.nextInt();
		System.out.println("Quarto valor: ");
		inteirosN[3] = scan.nextInt();
		System.out.println("Quinto valor: ");
		inteirosN[4] = scan.nextInt();
		System.out.println("------------------------------");
		System.out.println("Digite o valor de X: ");
		inteiroQualquerX[0] = scan.nextInt();

		int i, j;
		int soma = 0;
		for (i = 0; i < (tamanhoVetor); i++) {

			for (j = 1; j < tamanhoVetor; j++) {

				if (inteirosN[j] - inteirosN[i] == inteiroQualquerX[0]) {
					soma++;
				}
			}

		}

		System.out.println("Quantidade de elementos pares com diferença igual a " + inteiroQualquerX[0] + " = " + soma);

		scan.close();

	}

}
