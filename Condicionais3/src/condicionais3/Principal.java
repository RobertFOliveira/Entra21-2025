package condicionais3;

import java.util.Scanner;
public class Principal {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int idadePessoa;

		System.out.println("Informe a idade da pessoa");
		idadePessoa = sc.nextInt();
		
		if (idadePessoa < 18) {
			System.out.println("Menor de idade");
		} else if (idadePessoa >= 18 && idadePessoa <= 64) {
			
			System.out.println("Maior de idade");
		} else {
			System.out.println("Idoso");
		}

	}

}
