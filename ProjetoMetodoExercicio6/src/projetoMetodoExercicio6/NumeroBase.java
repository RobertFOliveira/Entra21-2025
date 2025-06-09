package projetoMetodoExercicio6;

import java.util.Scanner;

public class NumeroBase {

	public static void main(String[] args) {
		// 6)
		// Faça um método que receba um número, esse será o número "base"
		// Dentro do método, faça o usuário entrar com mais dois números
		// Imprima qual dos dois últimos números está mais perto do primeiro número "base"
	
		
		Scanner sc = new Scanner(System.in);
		
		int numeroBase;
		
		System.out.println("Informe um número: ");
				numeroBase = sc.nextInt();
		
		numeros(numeroBase);
		
		sc.close();

	}
	


	public static void numeros(int numeroBase) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Informe o " + (i + 1) + "º número: ");
			int[] numeros = new int[2];
		}
	
		
	}

}
