package login2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// 
		Scanner sc = new Scanner(System.in);
		
		int contaVezes = 1, somaValor = 0;
		
		while (contaVezes <= 10) {
			somaValor = somaValor + 1;
			contaVezes = contaVezes + 1;
		}
		System.out.println("O valor total da soma é: " + somaValor);
		
	}

}
