package projetoExe1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//
		// 1. Leia números do usuário até que a soma ultrapasse 1000 ou
		// até que sejam digitados pelo menos 20 números.
		// No final, mostre a quantidade de números digitados, a soma total e a média.

		// declaração de variáveis

		int nrInformado, somaNumeros = 0, qtdNrInformados = 0;

		// Classe scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		/*
		 * entrada de dados e laço de repetição enquanto a soma for menor ou igual a 1000
		 * e quantidade, números 
		 */
		while (somaNumeros <= 1000 && qtdNrInformados <= 20) {
			System.out.println("Digite um número inteiro: ");
			nrInformado = sc.nextInt();
			somaNumeros += nrInformado;
			// somaNumeros = somaNumeros + nrInformado; // Opção de uso
			qtdNrInformados++;
			// qtdNrInformados = qtdNrInformados + 1; // Opção de uso

		}
		System.out.println("Quantidade números digitados: " + qtdNrInformados);
		System.out.println("Soma total números: " + somaNumeros);
		System.out.println("Média dos números: " + (somaNumeros/qtdNrInformados));
		sc.close();
	}

}
