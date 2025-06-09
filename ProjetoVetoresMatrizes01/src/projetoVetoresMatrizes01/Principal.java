package projetoVetoresMatrizes01;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// Aula Vetores e Matrizes

		Scanner sc = new Scanner(System.in);

		int[] idade = new int[3];
		idade[0] = 20;
		idade[2] = 30;
		idade[1] = 15;

		System.out.println("Posição 2: " + idade[2]);

		String[] nomes = new String[3];
		nomes[0] = "Bob";
		nomes[1] = "Rose";
		nomes[2] = "Maria";

		System.out.println("Informe o mome Posição 2: ");
		nomes[1] = JOptionPane.showInputDialog("Informe a idade: " + nomes[1]);
		nomes[2] = sc.nextLine();
		System.out.println("Você informou o nome:" + nomes[2]);

		double[] notas = new double[3];
		// nota[0] = 7;
		// nota[1] = 9.5;
		// nota[2] = 8;

		System.out.println("Informe a primeira nota ");
		notas[0] = sc.nextDouble();
		//notas[0] = JOptionPane.showInputDialog("Informe a primeira nota: " + notas[0]);

		System.out.println("Informe a segunda nota ");
		notas[1] = sc.nextDouble();

		System.out.println("Informe a terceira nota ");
		notas[2] = sc.nextDouble();

		// Mostrar notas
		System.out.println("Notas: \n" + notas[0] + ", " + notas[1] + ", " + notas[2]);
		sc.close();
	}

}
