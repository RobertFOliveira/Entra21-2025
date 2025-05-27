package projetoExercício2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Leia números inteiros positivos do usuário até que ele digite um número que já tenha sido informado
		// antes (sem usar estruturas prontas para verificação). Calcule e imprima a média dos números únicos
		// digitados. 

		Scanner sc = new Scanner(System.in);
		
		int [] numeros = new int[1000];
		int quantidade = 0, soma = 0;
		
		
		while (true) {  
			System.out.println("Digite números inteiros positivos: ");
			int numero = sc.nextInt();
			if (numero <= 0) {
				System.out.println("Apenas números positivos são permitidos.");
				continue;
			}
			// Verifica se o número já foi dititado
			boolean repetido = false;
			for (int i = 0; i < quantidade; i++) {
				if (numeros[i] == numero) {
					repetido = true;
					break;
				}
			}
			if (repetido) {
				System.out.println("Número repetido! Encerrado...");
				break;
			}
			//Amazena e soma o número
			numeros[quantidade] = numero;
			quantidade++;
			soma += numero;
		}
		if (quantidade > 0) {
			double media = (double) soma / quantidade;
			System.out.println("Média dos números digitados: " + media);
		} else {
			System.out.println("Nenhum número foi digitado.");
		}
	
		sc.close();
	}

}
