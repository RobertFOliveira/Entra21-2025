package exercicio5ValorProduto;

import java.util.Scanner;

public class Principal {

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
		
		Scanner sc = new Scanner(System.in);
		
		//Entrada de dados
		
		// Declaração de variaveis

		double valorProduto, valorFinalProduto = 0;
		int condPagamento;
		
		// Entrada de cados
		System.out.println("Condições de Pagamento");
		System.out.println("1 À vista em dinheiro ou cheque, recebe 10% de desconto \n" + 
				"2 À vista no cartão de crédito, recebe 15% de desconto\n" + 
				"3 Em duas vezes, preço normal de etiqueta sem juros \n" + 
				"4 Em três vezes, preço normal de etiqueta mais juros de 10% \n");
		System.out.println("Informe condição de pagamento");
		condPagamento = sc.nextInt();
		System.out.println("Informe o valor do produto");
		valorProduto = sc.nextDouble();

		// Calcular o valor do produto
		switch (condPagamento) {
		case 1:
			valorFinalProduto = valorProduto * 0.90;
			break;
		case 2:
			valorFinalProduto = valorProduto * 0.85;
			break;
		case 3:
			valorFinalProduto = valorProduto;
			break;
		case 4:
			valorFinalProduto = valorProduto * 1.10;
			break;
		default: System.out.println("Valor fora dos padrões || Programa cancelado");
				System.exit(0);
			
		}

		// Imprimir Valor Final do Produto
		System.out.printf("O produto foi vendido por %.2f%n",valorFinalProduto);
		
		
		sc.close();
		// Mensagem final
		System.out.println("Obrigado por usar o nosso programa. Tchau!");
	}
	

	}


