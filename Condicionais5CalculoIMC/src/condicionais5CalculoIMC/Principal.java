package condicionais5CalculoIMC;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double imcCalculado, pesoPessoa, alturaPessoa;
		int idadePessoa;

		// Pede peso da pessoa
		System.out.println("Informe o peso da pessoa (em kg):");
		pesoPessoa = sc.nextDouble();
		// Pede altura da pessoa
		System.out.println("Informe a altura da pessoa (em metros)");
		alturaPessoa = sc.nextDouble();
		System.out.println("Informe a idade da pessoa (em anos)");
		idadePessoa = sc.nextInt();
		// Calcular o IMC

		imcCalculado = pesoPessoa / (alturaPessoa * alturaPessoa);

		// testar o valor ddo IMC e mostrar a mensagem
		if ((imcCalculado >= 16.0 && imcCalculado <= 16.9) || (idadePessoa < 18)) {
			System.out.println("Muito abaixo do peso");
		} else if (imcCalculado >= 17.0 && imcCalculado <= 18.4) {
			System.out.println("Abaixo do peso");
		} else if (imcCalculado >= 18.5 && imcCalculado <= 24.9) {
			System.out.println("Peso normal");
		} else if (imcCalculado >= 25.0 && imcCalculado <= 29.9) {
			System.out.println("Acima do peso");
		} else if (imcCalculado >= 30.0 && imcCalculado <= 34.9) {
			System.out.println("Obesidade grau I");
		} else if (imcCalculado >= 35.0 && imcCalculado <= 40.0) {
			System.out.println("Obesidade grau II");
		} else if (imcCalculado >= 40.0) {
			System.out.println("Obesidade grau III");
		} else if (imcCalculado < 16.0) {
		System.out.println("Valor calculado fora dos padrões");
		}
		System.out.printf("O IMC da pessoa é: %.2f\n", imcCalculado);
		sc.close();
	}
}
