package projetoMetodoExercicio22;

import java.util.Scanner;

public class MetodoNome {

	public static void main(String[] args) {
		//
		Scanner input = new Scanner(System.in);

		System.out.println("Insira o nome do seu colega: ");
		String nome = input.next();

		if (nome.equalsIgnoreCase("Carlos")) {
			carlos();
		} else if (nome.equalsIgnoreCase("Luis")) {
			luis();
		}
	}

	public static void carlos() {
		System.out.println("O nome dele é Carlos");
		System.out.println("33 anos");
		System.out.println("Ele é Estudante do SENAI");
	}

	public static void luis() {
		System.out.println("O nome dele é Luis");
		System.out.println("34 anos");
		System.out.println("Ele é Estudante do SENAI");
	}

}
