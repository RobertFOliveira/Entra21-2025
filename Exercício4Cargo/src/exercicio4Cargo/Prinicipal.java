package exercicio4Cargo;

import java.util.Scanner;

public class Prinicipal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Declaração de variaveis

		double valorSalarioPessoa, valorSalarioNovo = 0, valorAbono = 0;
		int cargoPessoa;
		char encerraProg = 'N';

		while (encerraProg == 'N') {

			String descCargo = "";

			// Entrada de cados
			System.out.println("Cargos");
			System.out.println("1 - Serviços Gerais \n" + "2 - Vigia\n" + "3 - Recepcionista \n" + "4 - Vendedor \n");
			System.out.print("Informe o seu cargo: ");
			cargoPessoa = sc.nextInt();
			System.out.print("Informe o seu salário atual: ");
			valorSalarioPessoa = sc.nextDouble();

			// Testar cargo e aplicar
			switch (cargoPessoa) {
			case 1:
				valorAbono = valorSalarioPessoa * 0.50;
				valorSalarioNovo = valorSalarioPessoa + valorAbono;
				descCargo = "Serviços Gerais";
				break;
			case 2:
				valorAbono = valorSalarioPessoa * 0.30;
				valorSalarioNovo = valorSalarioPessoa + valorAbono;
				descCargo = "Vigia";
				break;
			case 3:
				valorAbono = valorSalarioPessoa * 0.25;

				descCargo = "Recepcionista";
				break;
			case 4:
				valorAbono = valorSalarioPessoa * 0.15;
				descCargo = "Vendedor";
				break;

			}

			valorSalarioNovo = valorSalarioPessoa + valorAbono;

			// Imprimir cargo, valor Abono e salário Novo
			System.out.println("Cargo....:" + descCargo);
			System.out.println("Cargo....:" + "R$ " + valorAbono);
			System.out.println("Cargo....:" + "R$ " + valorSalarioNovo);
			System.out.println("Finaliza o programa? (S/N)");
			encerraProg = sc.next().toUpperCase().charAt(0);

		}
		sc.close();

	}

}
