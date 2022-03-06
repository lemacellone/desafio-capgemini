package br.com.exercicios;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int tamanhoVetor = 5;
		int vetNum[] = new int[tamanhoVetor];

		System.out.println("Digite abaixo uma lista de 5 números");
		System.out.println("------------------------------");
		System.out.println("Primeiro valor: ");
		vetNum[0] = scan.nextInt();
		System.out.println("Segundo valor: ");
		vetNum[1] = scan.nextInt();
		System.out.println("Terceiro valor: ");
		vetNum[2] = scan.nextInt();
		System.out.println("Quarto valor: ");
		vetNum[3] = scan.nextInt();
		System.out.println("Quinto valor: ");
		vetNum[4] = scan.nextInt();

		int i, j, menor, aux;
		for (i = 0; i < (tamanhoVetor - 1); i++) {
			menor = i;
			for (j = (i + 1); j < tamanhoVetor; j++) {

				if (vetNum[j] < vetNum[menor]) {
					menor = j;
				}
			}

			aux = vetNum[i];
			vetNum[i] = vetNum[menor];
			vetNum[menor] = aux;

		}

		System.out.println("Mediana: " + vetNum[2]);

		scan.close();

	}
}
