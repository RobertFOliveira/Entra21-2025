package projetoMetodoExercicio5;

import java.util.Scanner;

public class Principal {

	public static void entradasUsuarios(int numero1, int numero2) {

	}

	public static void main(String[] args) {
		// Faça um código que receba duas entradas do usuário
		// Imprima essas duas entradas ao cubo se:
		// Algum dos dois números for 5 ou a soma deles for 5 ou a diferença deles for 5
		// Se nenhuma dessas condições forem satisfeitas, imprima o quadrado dos números.

		Scanner sc = new Scanner(System.in);
		// Entrada de dados
		int numero1, numero2;

		System.out.print("1º Usuário informe um número: ");
		numero1 = sc.nextInt();

		System.out.print("2º Usuário informe um número: ");
		numero2 = sc.nextInt();
		// Calculo
		if (numero1 == 5 || numero2 == 5 || (numero1 + numero2) == 5 || Math.abs(numero1 - numero2) == 5) {
			System.out.println("Cubos:");
			System.out.println(numero1 + "³ = " + (numero1 * numero1 * numero1));
			System.out.println(numero2 + "³ = " + (numero2 * numero2 * numero2));
		} else {
			System.out.println("Quadrados: ");
			System.out.println(numero1 + "² = " + (numero1 * numero1));
			System.out.println(numero2 + "² = " + (numero2 * numero2));

		}

		sc.close();
	}

}
