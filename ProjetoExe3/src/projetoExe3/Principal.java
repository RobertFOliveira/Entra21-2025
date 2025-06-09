package projetoExe3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//
		// 3.Leia pares de números inteiros até que a soma do primeiro seja maior que
		// 100
		// e o segundo seja menor que -50, ou até que o número total de pares lidos seja
		// 30.
		// No final, imprima quantos pares foram lidos e
		// a média do primeiro número dos pares.

		// declaração de variáveis

		int primNumero, segundoNumero = 0, somaPrimeiro = 0, qtdParesInformados = 1;

		// Classe scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		/*
		 * entrada de dados e laço de repetição enquanto a soma for menor ou igual a
		 * 1000 e quantidade, números
		 */
		while ((somaPrimeiro <= 100 && segundoNumero <= -50) || qtdParesInformados <= 4) {
			System.out.println("Digite o primeiro número: ");
			primNumero = sc.nextInt();
			somaPrimeiro += primNumero;
			// somaPrimeiro = somaPrimeiro + primNumero; // Opção de uso
			System.out.println("Digite o segundo número");
			segundoNumero = sc.nextInt();
			
			qtdParesInformados++;
			// qtdParesInformado = qtdParesInformados + 1; // Opção de uso
		}
		
		System.out.println("Quantidade pares de números digitados: " + qtdParesInformados);
		System.out.println("Soma total de pares de números: " + somaPrimeiro);
		System.out.println("Média do primeiro número: " + (somaPrimeiro / qtdParesInformados));
		sc.close();
	}

}
