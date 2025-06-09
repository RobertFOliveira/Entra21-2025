package projetoVetoresMatrizesExercicio1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Atividade 1 – Leitura e Escrita
		//Crie um programa que leia 5 números inteiros e os armazene em um vetor. Depois, exiba todos os valores digitados.

		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[5];
		double somaNumeros = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Informe o número: " + (i+1)+ ": " );	
			numeros[i] = sc.nextInt();
			somaNumeros += numeros[i];
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(numeros[i]);
		}
	sc.close();
	}
	

}
