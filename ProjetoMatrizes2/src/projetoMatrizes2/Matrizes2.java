package projetoMatrizes2;

import java.util.Scanner;

public class Matrizes2 {

	public static void main(String[] args) {
		String vetNomes[]    = {"João","Maria","José"};
		double vetMedia[]    = new double[3]; // uma média para cada aluno
        String vetSituacao[] = new String[3]; // uma situação para cada aluno
        double matNotas[][]  = new double[3][3]; // uma linha de 3 notas para cada aluno
	    // acumulador de notas
        double acumNotas  = 0, menorMedia = 0, maiorMedia = 0;
        int    contaNotas = 0;
        char   primVez = 'S';
        
        Scanner sc = new Scanner(System.in);
       
        for (int lin = 0; lin < 3; lin++) {
        	acumNotas = 0; // para cada novo aluno "limpa" o acumulador de notas
        	// entrada das três notas para cada aluno ("lin" fica estático e "col" varia)
        	for (int col = 0; col < 3; col++) {
				System.out.println("Informe a " + (col + 1) + "ª nota do aluno " + vetNomes[lin] + ": ");
				matNotas[lin][col] = sc.nextDouble();	
				if (matNotas[lin][col] < 7.5) {
            		contaNotas++;
            	}
				acumNotas = acumNotas + matNotas[lin][col]; // acumula a nota informada
			}
        	vetMedia[lin] = acumNotas / 3; // calcula a média e armazena no vetor de médias
        	                               // com base no "lin" que indica o aluno que está
        	                               // sendo processado no momento
        	// verifica qual a menor a a maior média dentre os alunos
        	if (primVez == 'S') {
        		menorMedia = vetMedia[lin];
        		maiorMedia = vetMedia[lin];
        		primVez = 'N';
        	}
        	if (vetMedia[lin] < menorMedia) {
        		menorMedia = vetMedia[lin];
        	} else if (vetMedia[lin] > maiorMedia) {
        				maiorMedia = vetMedia[lin];
        	}
        	
        	vetSituacao[lin] = testaSituacao(vetMedia[lin]);
		}
        imprimeBoletim(vetNomes, vetMedia, vetSituacao, matNotas);
        System.out.println("Existem " + contaNotas + " notas abaixo de 7,5");
        System.out.println("A menor média é : " + menorMedia);
        System.out.println("A maior média é : " + maiorMedia);
        System.out.println("** Fim de Programa **"); 
        sc.close();
	}
	
	
	
	/* ****************** */
	/* IMPRIME BOLETIM    */
	/* ****************** */	
	static void imprimeBoletim(String pVetNomes[], double[] pVetMedia, String pVetSituacao[],
			                   double[][] pMatNotas) {
		
		System.out.println("************* BOLETIM ESCOLAR **************");
		
		for (int lin = 0; lin < 3; lin++) {
			System.out.println("Aluno: " + pVetNomes[lin] + "   Média : " + pVetMedia[lin] + 
					           "     Situação : " + pVetSituacao[lin]);
			System.out.print("Notas: ");
			for (int col = 0; col < 3; col++) {
				if (col < 2) {
					System.out.print(pMatNotas[lin][col] + " - ");
				} else {
					System.out.print(pMatNotas[lin][col]);
				}
			}
			System.out.println("");
		}
	}
	
	/* ****************** */
	/* TESTA SITUAÇÃO     */
	/* ****************** */	
	
	static String testaSituacao(double pMedia) {
		String situacao = "";
		
    	if (pMedia >= 0 && pMedia <= 4.99) {
    		situacao = "REPROVADO";
    	} else if (pMedia >= 5 && pMedia <= 6.99) {
    		situacao = "EM RECUPERAÇÃO";
    	} else {
    		situacao = "APROVADO";
    	}
		return situacao;
	}
}
