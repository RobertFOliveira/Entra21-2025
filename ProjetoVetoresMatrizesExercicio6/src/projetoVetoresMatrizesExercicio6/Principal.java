package projetoVetoresMatrizesExercicio6;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Atividade 6 – Procurando um Número
		// Leia 7 valores e peça um número para o usuário. Mostre se esse número está no vetor e em qual posição.

		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[7];
		// Leitura de 7 valores
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Informe o " + (i + 1) + "º número: ");
			numeros[i] = sc.nextInt();
		}
		// Perguntar o número para buscar
		System.out.println("Digite o número que deseja buscar: ");
		int numerobuscado = sc.nextInt();
		
		// Procurar o número
		boolean encontrado = false;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == numerobuscado) {
				System.out.println("Número encontrado na posição " + i);
				encontrado = true;
				break;
			}
		}
		
		if (encontrado) {
			System.out.println("Número não encontrado no vetor: ");
		}
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
			
		}
		
		
sc.close();
	}

}
