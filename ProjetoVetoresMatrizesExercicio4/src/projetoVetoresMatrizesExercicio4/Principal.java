package projetoVetoresMatrizesExercicio4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Atividade 4 – Valores Maiores que a Média
		// A partir dos dados da atividade anterior, mostre quais valores são maiores que a média..
		Scanner sc = new Scanner(System.in);
		
		// Expressão dos dados
		double[] numero = new double[8];
		double somaNumero = 0;
		
		// Entrada de dados
		for (int i = 0; i < numero.length; i++) {
			System.out.print("Informe o número na posição: " + (i+1) + ": ");
			numero[i] = sc.nextDouble();
			somaNumero += numero[i];
		}
		// Exibe os números inseridos
		for (int i = 0; i < numero.length; i++) {
			System.out.print(numero[i]);
		}
		// Cálculo e exibição da média.
		double media = somaNumero / numero.length;
		System.out.println("\nA média de todos os números digitados é: " + media);
	
		for (int i = 0; i < numero.length; i++) {
			if (numero[i] > media) {
				System.out.println("Valor maior que " + media + ": " + numero[i]);
				System.out.printf("Número na posição %d: %.2f\n", (i + 1), numero[i]);
			}
		}
		
	sc.close();	
	}

}
