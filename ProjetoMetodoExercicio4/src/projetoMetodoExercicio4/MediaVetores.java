package projetoMetodoExercicio4;

import java.util.Scanner;

public class MediaVetores {

	public static void main(String[] args) {
		// Faça um programa que descubra:
		// a) O maior elemento de um vetor
		// b) O menor elemento de um vetor
		// c) A média dos valores
		
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[5];
		// Entrada de dados
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Informe o " + (i + 1) + "º número: ");
			numeros[i] = sc.nextInt();
		}
		maiorNumero(numeros);
		menorNumero(numeros);
		mediaNumero(numeros);
		
		sc.close();
	}

	public static void maiorNumero(int [] vetor ) {
		int maior = vetor [0];
		for (int i = 1; i < vetor.length; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
			}
		}
		System.out.println("O maior número é: " + maior);
	}
	public static void menorNumero(int [] vetor ) {
		int menor = vetor [0];
		for (int i = 1; i < vetor.length; i++) {
			if (vetor [i] < menor) {
				menor = vetor[i];
			}
			
		}
		System.out.println("O menor número é: " + menor);
	}
	public static void mediaNumero(int [] vetor ) {
		int soma = 0;
		for (int num : vetor) {
			soma += num;
		}
		double media = (double) soma / vetor.length;
		System.out.println("A media dos números é: " + media);
	}
	
}
