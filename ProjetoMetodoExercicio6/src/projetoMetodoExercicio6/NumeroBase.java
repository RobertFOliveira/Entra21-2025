package projetoMetodoExercicio6;

import java.util.Scanner;

public class NumeroBase {

	public static void main(String[] args) {
		// 6)
		// Faça um método que receba um número, esse será o número "base"
		// Dentro do método, faça o usuário entrar com mais dois números
		// Imprima qual dos dois últimos números está mais perto do primeiro número
		// "base"

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o número Base: ");
		int numeroBase = sc.nextInt();

		imprimirNumeros(numeroBase);

		sc.close();

	}

	public static void imprimirNumeros(int numeroBase) {
		Scanner sc = new Scanner(System.in);
		// Entrada de dados
		System.out.print("Informe o primeiro número: ");
		int numero1 = sc.nextInt();
		System.out.print("Informe o segundo número: ");
		int numero2 = sc.nextInt();

		// Calculo números próximos
		// int distanciaBase1 = base - numero1;
		// int distanciaBase2 = base - numero2;
		
		int distanciaBase1 = Math.abs(numeroBase - numero1);
		int distanciaBase2 = Math.abs(numeroBase - numero2);
		System.out.println("==============================================");
		
		if (distanciaBase1 < distanciaBase2) {
			System.out.println(" O número " + numero1 + " está mais próximo do número Base " + numeroBase);
		} else if (distanciaBase2 < distanciaBase1) {
			System.out.println(" O número " + numero2 + " está mais próximo do número Base " + numeroBase);
		} else {
			System.out.println("Os dois números estão mais próximos do número Base");
		}

	}

}
