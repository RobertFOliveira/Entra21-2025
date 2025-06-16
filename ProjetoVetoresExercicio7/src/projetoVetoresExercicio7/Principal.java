package projetoVetoresExercicio7;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Atividade 7 – Menor e Maior Valor
		
		// Solicite 6 valores numéricos ao usuário e mostre qual é o maior e qual é o menor número informado.

		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[6];
		
		// Entrada de dados
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º número: ");
			numeros[i] = sc.nextInt();
		}
		int maior = numeros[0];
		int menor = numeros[0];
		for (int i = 1; i < numeros.length; i++) {
			if (numeros[i] > maior) {
				maior = numeros[i];
			}
			if (numeros[i] < menor) {
				menor = numeros[i];
			}
			
		}
		System.out.println("Maior número digitado: " + maior);
		System.out.println("Menor número digitado: " + menor);
		sc.close();

	}

}
