package condicionais7CondicaodePagamento;

import java.util.Scanner;

public class Prinicipal {

	public static void main(String[] args) {
		// 5. Elabore um algoritimo que calcule o que deve ser pago por um produto,
		// considerando o preço normal de etiqueta e a escolha da condição de pagamento.
		// Utilize os códigos da tabela a seguir para ler qual a condição de pagamento
		// escolhida
		// e efetuar o cálculo adequado.
		// Código Condição de pagamento
		// 1 À vista em dinheiro ou cheque, recebe 10% de desconto
		// 2 À vista no cartão de crédito, recebe 15% de desconto
		// 3 Em duas vezes, preço normal de etiqueta sem juros
		// 4 Em três vezes, preço normal de etiqueta mais juros de 10%

		Scanner scanner = new Scanner(System.in);

		// Entrada de dados
		System.out.println("Informe o preço do produto: R$ ");
		double precoEtiqueta = scanner.nextDouble();

		// Exibe opções de pagamento
		System.out.println("\nEscolha a condição de pagamento:");
		System.out.println("1 - À vista em dinheiro ou cheque (10% de desconto)");
		System.out.println("2 - À vista no cartão de crédito (15% de desconto)");
		System.out.println("3 - Em duas vezes (preço normal, sem juros)");
		System.out.println("4 - Em três vezes (com 10% de juros)");

		System.out.println("Digite o código da condição de pagamento (1 a 4):");
		int codigo = scanner.nextInt();

		double valorFinal;

		// Determina a condição de pagamento
		switch (codigo) {
		case 1:
			valorFinal = precoEtiqueta * 0.90;
			System.out.printf("Pagamento à vista em dinheiro ou cheque.\nValor com 10% de desconto: R$ %.2f%n", valorFinal);
			break;
		case 2:
			valorFinal = precoEtiqueta * 0.85;
			System.out.printf("Pagamento à vista no cartão de crédito.\nValor com 15% de desconto: R$ %.2f%n", valorFinal);
			break;
		case 3:
			valorFinal = precoEtiqueta;
			System.out.printf("Pagamento em 2x sem juros.\n2 parcelas de R$ %.2f\nTotal: R$ %.2f%n", valorFinal / 2,
					valorFinal);
			break;
		case 4:
			valorFinal = precoEtiqueta * 1.10;
			System.out.printf("Pagamento em 3x com 10%% de juros.\n3 parcelas de R$ %.2f\nTotal: R$ %.2f%n",
					valorFinal / 3, valorFinal);
			break;

		default:
			System.out.println("Código de condição de pagamento inválido.");

		}
		scanner.close();

	}

}
