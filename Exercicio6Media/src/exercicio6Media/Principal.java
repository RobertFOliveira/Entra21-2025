package exercicio6Media;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// 6. Escreva um algoritmo que leia o número de identificação, 
		// as 3 notas obtidas por um aluno nas 3 verificações e a média dos
		// exercícios que fazem parte da avaliação, e calcule a média de aproveitamento, usando a fórmula:
		//	MA = (nota1 + nota 2 * 2 + nota 3 * 3 + ME)/7
		//	A atribuição dos conceitos obedece a tabela abaixo. 
		// O algoritmo deve escrever o número do aluno, suas notas, a média dos
		//	exercícios, a média de aproveitamento, o conceito correspondente 
		//	e a mensagem 'Aprovado' se o conceito for A ou B e
		//	'Reprovado' se o conceito for C.
		//	Média de aproveitamento Conceito
		//	>= 8,0 		A
		//	>= 6,0 e < 8,0 B
		//	>= 0,0 e < 5,0 C
		
		Scanner sc = new Scanner(System.in);
		
		// Declaração de variaveis
		double nota1, nota2, nota3, mediaCalculada;
        // Leitura dos dados
        System.out.print("Informe o número de identificação do aluno: ");
        int numeroAluno = sc.nextInt();
		      
        System.out.print("Informe a nota 1: ");
        double nota1 = sc.nextDouble();

        System.out.print("Informe a nota 2: ");
        double nota2 = sc.nextDouble();

        System.out.print("Informe a nota 3: ");
        double nota3 = sc.nextDouble();

        double mediaExercicios = sc.nextDouble();
		System.out.print("Informe a nota 1: ");
		System.out.print("Informe a nota 2: ");
		System.out.print("Informe a nota 3: ");
		nota3 = sc.nextDouble();
		
		// Cálculo da média de aproveitamento
		mediaCalculada = (nota1 + nota2 + nota3) / 3;
		
		var conceitoAluno = 'A';
		if (conceitoAluno >= 8) {
			conceitoAluno = 'A';
		} else if (conceitoAluno >= 6.0 && conceitoAluno <= 7.99) {
			conceitoAluno = 'B';
		} else {
			conceitoAluno = 'C';
		}
		
		System.out.println(conceitoAluno);
		if (mediaCalculada >= 8) {
			
		}

	}

}
