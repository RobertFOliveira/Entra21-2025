package login;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String usuarioCorreto = "admin";
		String senhaCorreta = "1234";

		System.out.print("Digite o Usuário: ");
		String usuarioDigitado = sc.next();
		System.out.println();
		System.out.print("Digite a Senha...: ");
		String senhaDigitada = sc.next();

		if (usuarioDigitado.equalsIgnoreCase(usuarioCorreto) && senhaDigitada.equals(senhaCorreta)) {
			System.out.println("Login efetuado com sucesso");
		} else {
			System.out.println("Credenciais inválidos. Verifique");
		}

		System.out.println("Programa finalizado");
		sc.close();

	}

}
