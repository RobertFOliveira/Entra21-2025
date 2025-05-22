package condicionais2;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		int idadePessoa;
		idadePessoa = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade da Pessoa: "));
		if (idadePessoa < 18) { 
			JOptionPane.showMessageDialog(null, "Menor de idade!");
		} else if (idadePessoa >= 18 && idadePessoa <= 64){
			JOptionPane.showMessageDialog(null, "Maior de idade");
		}	else {
			JOptionPane.showMessageDialog(null, "Idoso");
			}
		}
}

