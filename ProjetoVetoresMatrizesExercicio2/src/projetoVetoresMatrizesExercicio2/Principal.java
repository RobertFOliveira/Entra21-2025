package projetoVetoresMatrizesExercicio2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Atividade 2 – Soma dos Elementos
		// Leia 10 números inteiros e armazene-os em um vetor.
		// Ao final, mostre a soma de todos os valores armazenados.

		Scanner sc = new Scanner(System.in);
		// Expressão
		int[] numerosInteiros = new int[10];
		double somaNumeros = 0;
		// Entrada de dados
		for (int i = 0; i < 10; i++) {
			System.out.print("Informe o número: " + (i + 1) + ": ");
			numerosInteiros[i] = sc.nextInt();
			somaNumeros += numerosInteiros[i];
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(numerosInteiros[i]);
		}
		// Método para Soma dos números
		System.out.println("A soma de todos os números é: " + (somaNumeros));
		sc.close();
	}

}
