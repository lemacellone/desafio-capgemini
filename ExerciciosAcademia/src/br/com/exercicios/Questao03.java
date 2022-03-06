package br.com.exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			// criei duas vari�veis para armazenar a mensagem e
			// a mensagem sem o espa�amento:

			String mensagemOriginal;
			String deletarEspacos;

			// Recebo a mensagem do usu�rio:
			System.out.println("Digite seu texto abaixo!!");
			mensagemOriginal = scan.nextLine();

			// Retirar os espa�os da mensagem recebida pelo usu�rio:
			deletarEspacos = mensagemOriginal.replaceAll(" ", "");

			// Armazeno em tamanhoT o tamanho (qtd de letras)
			int tamanhoT = deletarEspacos.length();

			// Defino aqui qual � a raiz quadrada do valor da qtd de letras
			// arredondo a raiz para cima
			double raizTamanhoT = Math.ceil(Math.sqrt(tamanhoT));
			// Aqui transformo a variavel de raiz que � double p/ int
			int valorInt = (int) raizTamanhoT;

			// Declarando uma matriz para armazenar cada uma das letras.
			// Defini o tamanho da matriz como valorInt x valorInt (3x3 por ex).
			String strGridVetor[][] = new String[valorInt][valorInt];
			
			//Variavel que armazena a qtd de vagas restantes
			int valoresNPreenchidos = valorInt * valorInt - tamanhoT;
			//Array de char de 1 posi��o - tamanho da qtd de vagas rest. 
			char[] repeticao = new char[valoresNPreenchidos];
			
			//Preenche o vetor CHAR, com espa�o, em todas as posi��es:
			Arrays.fill(repeticao, "+".charAt(0));
			
			//Concatena aa minha frase trabalhada os espa�os necessarios p
			//completar a matriz:
			deletarEspacos += new String(repeticao);
			
			int i = 0;
			int j = 0;
			
			
			//Percorre o array de strings, em q cada posi��o � um caractere.
			//Para cada string S dentro do meu array de strings. SPLIT retorna array
			for (String s : deletarEspacos.split("")) {
				strGridVetor[i][j] = s;
				j++;
				if (j >= valorInt) {
					i++;
					j = 0;
				}
			}

			// System.out.println(deletarEspacos);
			// System.out.println(tamanhoT);
			// System.out.println(valorInt);
			System.out.println("-------------------------");

			for (int y = 0; y < valorInt; y++) {
				for (int z = 0; z < valorInt; z++) {
					System.out.print(strGridVetor[y][z]);
				}
				System.out.println();
			}

			System.out.println("-------------------------");
			for (int y = 0; y < valorInt; y++) {
				for (int z = 0; z < valorInt; z++) {
					System.out.print(strGridVetor[z][y]);

				}
				System.out.print(" ");
			}

		}

	}
}
