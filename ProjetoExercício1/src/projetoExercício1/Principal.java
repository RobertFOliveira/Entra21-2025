package projetoExercício1;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// 1. Leia números do usuário até que a soma ultrapasse 1000 ou 
		// até que sejam digitados pelo menos 20 números.
		// No final, mostre a quantidade de números digitados, a soma total e a média. 

		Scanner sc = new Scanner(System.in);
		
		double soma = 0, valor;
		int contador = 0;
	
		
		// Entrada de dados
		
		while (soma <= 1000 && contador < 20) {
			System.out.println("Digite um número: ");
			
			if (sc.hasNextDouble()){
			valor = sc.nextDouble();
			soma += valor;
			contador ++;
			}		
		}
		
		System.out.println(contador);
		System.out.println(soma);
		
	}

}
