package projetoum;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Declaração de variaveis
		String nomePessoa;
		int idadePessoa;
		float horasTrabalhadas, valorHora = 25.0f;
		double salarioTotal;
		boolean demitido = false;

		/*
		 * entrada de dados utilizando scanner pela primeira vez
		 */
		Scanner sc = new Scanner(System.in);
		// ln = nova linha =
		// mostra a expressão e pula para a linha debaixo
// entradas de dados
		System.out.print("Informe o seu nome: ");
		nomePessoa = sc.nextLine();
		System.out.print("Informe horas trabalhadas: ");
		horasTrabalhadas = sc.nextFloat();
		System.out.print("Informe a sua idade:");
		idadePessoa = sc.nextInt();
		System.out.print("Informe o valor hora: ");
		valorHora = sc.nextFloat();
		salarioTotal = horasTrabalhadas * valorHora;

		// saída de dados
		System.out.println("Acho que o nome que você informou é: " + nomePessoa);
		System.out.println("Seu nome é: " + nomePessoa + " e sua idade é: " + idadePessoa);
		System.out.println("Horas Trabalhadas: " + horasTrabalhadas);
		System.out.println("Valor da hora: " + valorHora);
		System.out.println("Salário: R$ " + salarioTotal);
		sc.close();
	}

}
