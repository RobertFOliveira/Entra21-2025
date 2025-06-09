package projetoMetodoExercicio1;

import java.util.Scanner;

public class Metodos2 {

	public static void main(String[] args) {
		//

		Scanner sc = new Scanner(System.in);

		int estacao = sc.nextInt();

		if (estacao == 1) {
			imprimirVerao();
		} else if (estacao == 2) {
			imprimirOutono();
		} else if (estacao == 3) {
			imprimirInverno();
		} else if (estacao == 4) {
			imprimirPrimavera();
		}
		sc.close();
	}

	public static void imprimirVerao() {
		System.out.println("É verão\nE o tempo está quente");
	}

	public static void imprimirOutono() {
		System.out.println("É outono\nE as folhas estão caindo");
	}

	public static void imprimirInverno() {
		System.out.println("É inverno\nE está frio");
	}

	public static void imprimirPrimavera() {
		System.out.println("É primavera\nÉ primavera ");
	}

}
