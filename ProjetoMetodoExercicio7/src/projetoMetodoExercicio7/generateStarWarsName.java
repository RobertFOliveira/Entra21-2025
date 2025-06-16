package projetoMetodoExercicio7;

import java.util.Scanner;

public class generateStarWarsName {

	public static void main(String[] args) {
		// A fórmula, supostamente, é:
		// Seu primeiro nome na série Star Wars:
		// i.Pegue as três primeiras letras de seu sobrenome
		// ii.Adicione a ele as duas primeiras letras de seu nome
		// Seu sobrenome na série Star Wars:
		// i.Pegue as duas primeiras letras do sobrenome de solteira de sua mãe
		// ii.Adicione a ele as três primeiras letras do nome da cidade onde você nasceu
		// Crie um método chamado generateStarWarsName que gera um nome completo Star
		// Wars conforme descrito.
		// Imprima o seu nome Star Wars
		// As entradas serão os nomes completos.
		// Para separar, por exemplo as três primeiras letras do seu sobrenome, use o
		// método .substring() das Strings

		Scanner sc = new Scanner(System.in);
		// Entrada de dados
		System.out.println("Informe o seu nome: ");
		String nome = sc.nextLine();
		System.out.println("Informe o seu sobrenome: ");
		String sobreNome = sc.nextLine();
		System.out.println("Informe o sobrenome da sua Mãe: ");
		String sobreNomeMae = sc.nextLine();
		System.out.println("Informe nome da cidade onde você nasceu: ");
		String cidadeNascimento = sc.nextLine();

		// Gerar e exibir o nome Star Wars
		String nomeStarWars = generateStarWarsName(nome, sobreNome, sobreNomeMae, cidadeNascimento);
		System.out.println("\nSeu nome Star Wars é: " + nomeStarWars);

		sc.close();
	}

	// Metodo para gerar o nome
	public static String generateStarWarsName(String nome, String sobreNome, String sobreNomeMae,
			String cidadeNascimento) {
		// Primeiras partes com substring e verificações de tamanho

		String parteNome = pegarParte(sobreNome, 3) + pegarParte(nome, 2);
		String parteSobrenome = pegarParte(sobreNomeMae, 2) + pegarParte(cidadeNascimento, 3);
		// capitalizar corretamente
		parteNome = capitalizar(parteNome);
		parteSobrenome = capitalizar(parteSobrenome);

		return parteNome + " " + parteSobrenome;
	}

	// Método para pegar apenas os primeiros caracteres de uma string (com
	// segurança)
	public static String pegarParte(String texto, int quantidade) {
		texto = texto.trim(); // remove espaços em branco no início/fim
		if (texto.length() < quantidade) {
			return texto.toLowerCase(); // retorna tudo se for menor
		}
		return texto.substring(0, quantidade).toLowerCase();
	}

	// Método para deixar a primeira letra maiúscula e o resto minúsculo
	public static String capitalizar(String texto) {
		if (texto.isEmpty())
			return texto;
		return texto.substring(0, 1).toUpperCase() + texto.substring(1).toLowerCase();

	}
}
