package projetoMatrizes1;

import java.util.Scanner;

public class MatrizesMedia {

	public static void main(String[] args) {

		String vetNomes[] = { "João", "Maria", "José", "Adão", "Eva", "Camelo" };
		double vetMedia[] = new double[6]; // uma média de cada aluno
		String vetSituacao[] = new String[6]; // uma situação para cada aluno
		double matNotas[][] = new double[6][3]; // uma linha de 3 notas para cada aluno
		// acumulador de notas
		double acumNotas = 0;

		Scanner sc = new Scanner(System.in);

		for (int lin = 0; lin < 6; lin++) {
			acumNotas = 0; // para cada novo aluno limpa o acumulador de notas
			// Entrada das três notas para cada aluno ("lin" fica estático e "col" varia)
			for (int col = 0; col < 3; col++) {
				System.out.print("Informa a " + (col + 1) + "ª nota do aluno " + vetNomes[lin] + ": ");
				matNotas[lin][col] = sc.nextDouble();
				acumNotas = acumNotas + matNotas[lin][col];
			}
			vetMedia[lin] = acumNotas / 3; // calcula a média e armazena no vetor de médias
											// com base no "lin" que indica o aluno que está
											// sendo processado no momento
			// testar a situação do aluno e armazenar no rescpecitov vetor (vetSituação)

			vetSituacao[lin] = testaSituacao(vetMedia[lin]);
			System.out.println("A média do aluno" + vetNomes[lin] + "é " + vetMedia[lin]);
		}
		sc.close();
	}

	static String testaSituacao(double pMedia) {
		String situacao = "";

		if (pMedia <= 4.99) {
			situacao = "REPROVADO";
		} else if (pMedia >= 5 && pMedia <= 6.99) {
			situacao = "EM RECUPERAÇÃO";
		} else {
			situacao = "APROVADO";
		}
		System.out.println("A situação do aluno é " + situacao);
		return situacao;
	

	}

}
