package exercicio6Media2;

import java.util.Scanner;

public class Principal {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Leitura dos dados
		System.out.print("Informe o número de identificação do aluno: ");
		int numeroAluno = sc.nextInt();

		System.out.print("Informe a nota 1: ");
		double nota1 = sc.nextDouble();

		System.out.print("Informe a nota 2: ");
		double nota2 = sc.nextDouble();

		System.out.print("Informe a nota 3: ");
		double nota3 = sc.nextDouble();

		System.out.print("Informe a média dos exercícios: ");
		double mediaExercicios = sc.nextDouble();

		// Cálculo da média de aproveitamento
		double mediaAproveitamento = (nota1 + nota2 * 2 + nota3 * 3 + mediaExercicios) / 7;

		// Determinação do conceito
		char conceito;
		if (mediaAproveitamento >= 8.0) {
			conceito = 'A';
		} else if (mediaAproveitamento >= 6.0) {
			conceito = 'B';
		} else {
			conceito = 'C';
		}

		// Saída
		System.out.println("\n==== Resultado ====");
		System.out.println("Número do aluno: " + numeroAluno);
		System.out.println("Nota 1: " + nota1);
		System.out.println("Nota 2: " + nota2);
		System.out.println("Nota 3: " + nota3);
		System.out.println("Média dos exercícios: " + mediaExercicios);
		System.out.printf("Média de aproveitamento: %.2f\n", mediaAproveitamento);
		System.out.println("Conceito: " + conceito);

		if (conceito == 'A' || conceito == 'B') {
			System.out.println("Situação: Aprovado");
		} else {
			System.out.println("Situação: Reprovado");
		}
// Saída
		sc.close();
	}

}
