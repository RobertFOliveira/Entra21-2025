package projetoVetoresMatrizesExercicioAula1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Uso do Scanner
		Scanner sc = new Scanner(System.in);
		
		String vetNomes[] = new String[5];
		// entrada de dados
		for (int cont = 0; cont < 5; cont++) {
			System.out.print("Informe o " + (cont+1) + "º nome: ");
			vetNomes[cont] = sc.next();
		}
		// Saída de dados
		
		for (int cont = 0; cont < vetNomes.length; cont++) {
			System.out.println("Os nomes digitados são: " + cont + "ª posição: " + vetNomes[cont]);
		}
		
sc.close();
	}

}
