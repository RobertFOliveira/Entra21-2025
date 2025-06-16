package provaPraticaJunhoTemperaturas;

import java.util.Scanner;

public class Principal {
	// Constantes Globais
	public static final int NUMERO_CIDADES = 4;
	public static final int NUMERO_DIAS = 7;
	public static final String[] DIAS_SEMANA = { "Dom", "Seg", "Ter", "Qua", "Qui", "Sex", "Sáb" };
	public static final String[] NOMES_CIDADES = { "Blumenau", "Gaspar", "Joinville", "Pomerode" };

	public static void main(String[] args) {
		// Prova Prática
		// desenvolver um programa em Java para auxiliar na análise de temperaturas
		// registradas em
		// quatro cidades ao longo de uma semana. O sistema deve utilizar uma matriz
		// bidimensional (4x7), onde
		// cada linha representa uma cidade e cada coluna um dia da semana. O usuário
		// deverá informar as
		// temperaturas manualmente, cidade por cidade, dia por dia.

		// Organizar os dados e saídas de forma legível no console;
		// Utilizar pelo menos dois métodos além do método `main()` para modularizar seu
		// código;
		// Aplicar boas práticas de codificação como nomes claros de variáveis,
		// identação e comentários.
		// --------------------------------------------------------------------------------
		// Scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		// Matriz 4x7 para armazenar as temperaturas das cidades (linhas)
		// ao longo dos dias (colunas)
		double[][] temperaturas = new double[NUMERO_CIDADES][NUMERO_DIAS];
		// Entrada de dados: leitura das temperaturas para cidade e cada dia da semana
		for (int cidade = 0; cidade < NUMERO_CIDADES; cidade++) {
			System.out.println(
					"Informe as temperaturas da cidade de " + NOMES_CIDADES[cidade] + " para os dias da semana:");

			for (int dia = 0; dia < NUMERO_DIAS; dia++) {
				System.out.print(" " + DIAS_SEMANA[dia] + ": ");
				temperaturas[cidade][dia] = sc.nextDouble();
			}
		}
		// Chamadas de métodos para geração de relatõrios
		MediaPorCidade(temperaturas);
		MaiorMenorTemperatura(temperaturas);
		ContarDiasInferior15(temperaturas);
		CalculoTemperaturaMediaGeral(temperaturas);
		sc.close(); // Fechamento do Scanner
	}

	// -----------------------------------------------------------------------------
	// Calcular e exibir a média de temperatura semanal de cada cidade;
	// Método para calcular e exibir a média semanal de temperatura por cidade
	public static void MediaPorCidade(double[][] temp) {
		System.out.println("=========== RELATÓRIOS ============");
		System.out.println("\nMédia semanal por Cidade");
		for (int cidade = 0; cidade < NUMERO_CIDADES; cidade++) {
			double soma = 0;
			for (int dia = 0; dia < NUMERO_DIAS; dia++) {
				soma += temp[cidade][dia];
			}
			double media = soma / NUMERO_DIAS;
			System.out.printf(" Cidade %s: %.2f°C%n", NOMES_CIDADES[cidade], media);
		}
	}

	// ---------------------------------------------------------------------------
	// Identificar e exibir a maior e a menor temperatura registradas entre todas as
	// cidades e dias;
	// Método para identificar e exibir a maior e a menor temperatura entre todas as
	// cidades
	public static void MaiorMenorTemperatura(double[][] temp) {
		double maior = temp[0][0]; // Constantes
		double menor = temp[0][0]; // Constantes
		int cidadeMaior = 0, diaMaior = 0, cidadeMenor = 0, diaMenor = 0;
		// Laços para percorrer toda a matriz
		for (int cidade = 0; cidade < NUMERO_CIDADES; cidade++) {
			for (int dia = 0; dia < NUMERO_DIAS; dia++) {
				if (temp[cidade][dia] > maior) {
					maior = temp[cidade][dia];
					cidadeMaior = cidade;
					diaMaior = dia;
				}
				if (temp[cidade][dia] < menor) {
					menor = temp[cidade][dia];
					cidadeMenor = cidade;
					diaMenor = dia;
				}
			}
		}
		// Impressão da Maior e Menor temperaturas dos resultados
		System.out.println("\nMaior e Menor Temperatura");
		System.out.printf(" Maior temperatura: %.2f°C   (Cidade %s, %s)%n", maior, NOMES_CIDADES[cidadeMaior],
				DIAS_SEMANA[diaMaior]);
		System.out.printf(" Menor temperatura: %.2f°C   (Cidade %s, %s)%n", menor, NOMES_CIDADES[cidadeMenor],
				DIAS_SEMANA[diaMenor]);
		// Informações adicionais com os dias mais quentes e mais frios
		System.out.printf("%n Dia mais quente: %s, Cidade %s ", DIAS_SEMANA[diaMaior], NOMES_CIDADES[cidadeMaior]);
		System.out.printf("\n Dia mais frio: %s, Cidade %s \n", DIAS_SEMANA[diaMenor], NOMES_CIDADES[cidadeMenor]);
	}

	// --------------------------------------------------------------------------
	// Para cada cidade, contar e exibir a quantidade de dias em que a temperatura
	// foi inferior a 15°C;
	// Método para contar e exibir quantos dias cada cidade teve temperaturas abaixo
	// de 15°
	public static void ContarDiasInferior15(double[][] temp) {
		System.out.println("\nDias em que a temperatura foi inferior a 15°C: ");
		for (int cidade = 0; cidade < NUMERO_CIDADES; cidade++) {
			int contador = 0;
			for (int dia = 0; dia < NUMERO_DIAS; dia++) {
				if (temp[cidade][dia] < 15) {
					contador++;
				}
			}
			System.out.printf(" Cidade %s: %d dia(s)%n", NOMES_CIDADES[cidade], contador);
		}
	}

	// ----------------------------------------------------------------------------
	// Cálculo da temperatura média geral;
	// Método para calcular e exibir a temperatura média geral considerando todas as
	// cidades e dias
	public static void CalculoTemperaturaMediaGeral(double[][] temp) {
		System.out.println("\nMédia geral das temperaturas");
		double somaMediaGeral = 0;
		int totalMediaGeral = NUMERO_CIDADES * NUMERO_DIAS;

		for (int cidade = 0; cidade < NUMERO_CIDADES; cidade++) {
			for (int dia = 0; dia < NUMERO_DIAS; dia++) {
				somaMediaGeral += temp[cidade][dia];
			}
		}
		// Cálculo da média geral
		double mediaGeral = somaMediaGeral / totalMediaGeral;
		// Impressão da média
		System.out.printf("\n A média geral das Temperaturas é de: %.2f°C%n", mediaGeral); // print formatado
	}

}
