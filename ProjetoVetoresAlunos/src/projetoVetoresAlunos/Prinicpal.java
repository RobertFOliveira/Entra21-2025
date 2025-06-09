package projetoVetoresAlunos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Prinicpal {

	public static void main(String[] args) {
		// Alunos
		
		Scanner sc = new Scanner(System.in);
		double [] notas = new double[3];
		double somaNotas = 0;
		
		for (int i = 0; i < 3; i++) {
		//notas[1] = JOptionPane.showInputDialog("Informe a nota: " + (i+1) + ": ");
		System.out.print("Informe a nota: " +(i+1)+ ": ");
		notas[i] = sc.nextDouble();
		somaNotas += notas[i];
		}
		for (int i = 0; i < 3; i++) {
			System.out.println(notas[i]);
		}
		
		System.out.println("Média do aluno: " + (somaNotas/3));
		
		
		
sc.close();
	}

}
