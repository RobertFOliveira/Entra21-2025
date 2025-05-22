package condicionais;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int idadePessoa;
		
		System.out.println("Qual a idade da pessoa? ");
		idadePessoa = sc.nextInt();
		
		if (idadePessoa < 16) {
			System.out.println("Não eleitor");
		} else if (idadePessoa >= 18 && idadePessoa <= 65 ){
			System.out.println("Eleitor obrigatório");
		} else if ((idadePessoa >= 16 && idadePessoa <= 17)
				|| idadePessoa >= 65){
			System.out.println("Eleitor facultativo");
		}

		
	}

}
