package condicionais;

import java.util.Scanner;

import javax.swing.JOptionPane;


public class Principal {

	public static void main(String[] args) {
		//Scanner sc = new Scanner (System.in);
		int idadePessoa;
		//System.out.println("Informe a idade da pessoa: ");
		//idadePessoa = sc.nextInt();
		//if (idadePessoa >= 18) {
			//System.out.println("Entrada liberada");
			//idadePessoa = sc.nextInt("informe a idade da pessoa");
			//idadePessoa - sc.nextInt();
			idadePessoa = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade da pessoa"));
			if(idadePessoa >= 18) {
				
				JOptionPane.showMessageDialog(null, "Entrada liberada!");
			}
			else {JOptionPane.showMessageDialog(null, "Entrada não liberada!");
		}
		
		

	}

}
