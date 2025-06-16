package projetoMetodoExemplocomParametro;

import java.util.Scanner;

public class ExemploComParametro {

	public static void multiplicarValores(int numero1, int numero2) {
		System.out.println(numero1 * numero2);
	}

	public static void main(String[] args) {
		//
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira um número");
		int numero = input.nextInt();
		
		aoQuadrado(numero);
	}

}
