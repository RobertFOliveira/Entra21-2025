package condicionais6AumentoSalario;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		// Calcular o aumento de salário de acordo com o cargo, ler salário e o código
		// do cargo.
		// Calcular o aumento salarial de acordo com o cargo da pessoa conforme a tabela
		// abaixo.
		// Imprimir o nome do cargo, o valor do aumento e o novo salário.
		// Código Cargo % Aumento
		// 1 Serviços Gerais 50%
		// 2 Vígia 30%
		// 3 Recepcionista 25%
		// 4 Vendedor 15%

		Scanner scanner = new Scanner(System.in);

		// Entrada de dados

		System.out.println("Digite o salário atual: R$ ");
		double salario = scanner.nextDouble();

		System.out.println("Digite o código do cargo (1 a 4):");
		int codigoCargo = scanner.nextInt();

		String nomeCargo = "";
		double percentualAumento = 0;

		// Determina o cargo e percentual de aumento
		switch (codigoCargo) {
		case 1:
			nomeCargo = "Serviços Gerais";
			percentualAumento = 0.50;
			break;
		case 2:
			nomeCargo = "Vigia";
			percentualAumento = 0.30;
			break;
		case 3:
			nomeCargo = "Recepcionista";
			percentualAumento = 0.25;
			break;
		case 4:
			nomeCargo = "Vendedor";
			percentualAumento = 0.15;
			break;

		default:
			System.out.println("Código de cargo inválido.");
			scanner.close();
			return;

		}

		// Cálculo do aumento e novo salário
		double valorAumento = salario * percentualAumento;
		double novoSalario = salario + valorAumento;

		// Saída
		System.out.println("\nCargo: " + nomeCargo);
		System.out.printf("Valor do aumento: R$ %.2f%n", valorAumento);
		System.out.printf("Novo salário R$ %.2f%n", novoSalario);

		scanner.close();
	}
}
