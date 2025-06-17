package projetoDesafioFinalMonitoramentoDeEnergiaEletrica;

import java.util.Scanner;

public class Principal {

	// Constantes Globais
	public static final int NUMERO_MES = 12;
	public static final String[] MES_ANO = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
	
	
	public static void main(String[] args) {
		// Desenvolver um programa em Java que permita ao usuário: 
		// 1. Informar o consumo mensal (kWh) de 12 meses consecutivos. 
		// 2. Armazenar os valores em um vetor. 
		// 3. Utilizar funções para: 
		// o Calcular o consumo total; 
		// o Calcular a média mensal; 
		// o Identificar o mês com maior e menor consumo; 
		// o Classificar o consumo: 
		//  Até 150 kWh/mês → Baixo 
		//  De 151 a 300 kWh/mês → Moderado 
		//  Acima de 300 kWh/mês → Elevado 
		// 4. Apresentar um relatório final com todas as informações organizadas

		Scanner sc = new Scanner(System.in);
		// Entrada de dados
		int[] consumoMeses = new int[NUMERO_MES];
		
		for (int i = 0; i < NUMERO_MES; i++) {
			System.out.print("Informe o consumo de kwh do mês de " + MES_ANO[i] + ": ");
			consumoMeses[i] = sc.nextInt();
		}
		
		ConsumoTotalkwh(consumoMeses);
		sc.close();
	}

	// Calcular o consumo total; 
	public static void ConsumoTotalkwh(int[] consumoMeses) {
		int consumoTotal = 0;
		int media = 0;
		for (int consumo = 0; consumo < NUMERO_MES; consumo++) {
			consumoTotal += consumoMeses[consumo];
		}
		System.out.println("====================RELATÓRIOS=========================");
		System.out.println("O consumo total de kwh dos meses foi de: " + consumoTotal + "kwh");
		
		// Calcular a média mensal; 
		media = consumoTotal / NUMERO_MES;
		System.out.println("A média do consumo total dos meses é " + media + "kwh");
	}
	// o Identificar o mês com maior e menor consumo; 
	
	public static void MaiorConsumoKwh(int[][] maiorConsumo) {
		int maior = maiorConsumo[0][0];
		int mesMaior = 0, mesAnoMaior = 0;
		for (int i = 0; i < NUMERO_MES; i++) {
			for (int j = 0; j < MES_ANO; j++) {
				if (maiorConsumo[i][j] > maior) {
					maior = maiorConsumo[i][j];
					mesMaior = i;
					mesAnoMaior = j;
			}
		}
out.println("O maior consumo é: " + maior);	
		}
	}
	
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
	
	public static void maiorNumero(int [] vetor ) {
		int maior = vetor [0];
		for (int i = 1; i < vetor.length; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
			}
		}
		System.out.println("O maior número é: " + maior);
	}
	public static void menorNumero(int [] vetor ) {
		int menor = vetor [0];
		for (int i = 1; i < vetor.length; i++) {
			if (vetor [i] < menor) {
				menor = vetor[i];

	
}
