package projetoMetodoExercicio3;

import java.util.Scanner;

public class MetodoscomParametros {

	public static void main(String[] args) {
		// Faça um programa que exiba o número que o usuário entrou como parâmetro e os
		// 20
		// números que vem após esse número
		// (O parâmetro do método deve ser o número inserido pelo usuário)

		Scanner sc = new Scanner(System.in);

		int numero = 0;

		System.out.print("Informe um número: ");
		numero = sc.nextInt();

		imprimirsequencia(numero);

		sc.close();
	}

	public static void imprimirsequencia(int numero) {
		for (int i = numero; i <= numero + 20; i++) {
			System.out.println(i);
		}
	}
}
