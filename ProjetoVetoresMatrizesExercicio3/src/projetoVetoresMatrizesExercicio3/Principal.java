package projetoVetoresMatrizesExercicio3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Atividade 3 – Média dos Valores
		// Peça para o usuário digitar 8 números. Calcule e exiba a média dos números inseridos.
		
		Scanner sc = new Scanner(System.in);
		// Expressão dos dados
		double[] numero = new double[8];
		double somaNumero = 0;
		
		// Entrada de dados
		for (int i = 0; i < numero.length; i++) {
			System.out.println("Informe o número na posição: " + (i+1) + ": ");
			numero[i] = sc.nextDouble();
			somaNumero += numero[i];
		}
		// Exibe os números inseridos
		for (int i = 0; i < numero.length; i++) {
			System.out.print(numero[i]);
			
		}
		// Cálculo e exibição da média.
		System.out.printf("A média de todos os números é: ", + (somaNumero / numero.length));
		
		
sc.close();
	}

}
