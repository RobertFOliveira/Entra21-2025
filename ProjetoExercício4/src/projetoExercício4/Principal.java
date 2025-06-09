package projetoExercício4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//

		// 4. Solicite ao usuário que digite números positivos para preencher uma lista
		// até que a soma dos números
		// digitados seja múltipla de 7 e o tamanho da lista seja maior que 10.
		// Após o loop, imprima a lista completa e a soma dos elementos.

		// Classe scanner para entrada de dados
		Scanner sc = new Scanner(System.in);

		int numInformado, somaNumeros = 1, qtdNumInformados = 1, resto;
		int numInf1, numInf2, numInf3, numInf4, numInf5, numInf6, numInf7, numInf8, numInf9, numInf10;

		/*
		 * 4. Solicite ao usuário que digite números positivos para preencher uma lista
		 * até que a soma dos números // digitados seja múltipla de 7 e o tamanho da
		 * lista seja maior que 10. // Após o loop, imprima a lista completa e a soma
		 * dos elementos. (!(soma % 7 == 0 && numeros.size() > 10))
		 */
		// calculo
		var primeiraVez = true;

		while (somaNumeros % 7 != 0 && qtdNumInformados <= 10) {
			System.out.print("Digite o número positivo: ");
			numInformado = sc.nextInt();
			somaNumeros += numInformado;
			qtdNumInformados++;
			if (primeiraVez) {
				somaNumeros--;
				primeiraVez = false;
			}

			switch (qtdNumInformados) {
			case 1: {
				numInf1 = numInformado;
				break;
			}
			case 2: {
				numInf2 = numInformado;
				break;
			}
			case 3: {
				numInf3 = numInformado;
				break;
			}
			case 4: {
				numInf4 = numInformado;
				break;
			}
			case 5: {
				numInf5 = numInformado;
				break;
			}
			case 6: {
				numInf6 = numInformado;
				break;
			}
			case 7: {
				numInf7 = numInformado;
				break;
			}
			case 8: {
				numInf8 = numInformado;
				break;
			}
			case 9: {
				numInf9 = numInformado;
				break;
			}
			case 10: {
				numInf10 = numInformado;
				break;
			}

			}
		}
		System.out.println("Lista completa dos números: ");
		System.out.println("A soma dos números são: " + somaNumeros);
		System.out.println("Fim");
		sc.close();

	}

}
