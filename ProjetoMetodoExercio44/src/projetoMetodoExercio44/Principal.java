package projetoMetodoExercio44;

import java.util.Iterator;

public class Principal {

	public static void main(String[] args) {
		//
		int vetor[] = {8, 6, 5, 54, 12, 7 };

		econtrarMaiorValor(vetor);
		econtrarMenorValor(vetor);
		calcularMedia(vetor);
	}

	public static void econtrarMaiorValor(int vetor[]) {
		int maiorValor = Integer.MIN_VALUE;

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > maiorValor) {
				maiorValor = vetor[i];
			}
		}
		System.out.println("Maior valor: " + maiorValor);
	}

	public static void econtrarMenorValor(int vetor[]) {
		int menorValor = Integer.MAX_VALUE;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[1] < menorValor) {
				menorValor = vetor[i];
			}
		}
		System.out.println("Menor valor: " + menorValor);
	}

	public static void calcularMedia(int vetor[]) {
		double soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		double media = soma / vetor.length;
		System.out.println("Média dos valores: " + media);
	}
}
