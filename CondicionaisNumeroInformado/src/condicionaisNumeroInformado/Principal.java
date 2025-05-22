package condicionaisNumeroInformado;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		// Exercício Número Informado

        String precoStr = JOptionPane.showInputDialog("Informe o preço do produto:");
        double preco = Double.parseDouble(precoStr);
        
        
		int numeroInformado = Integer.parseInt(JOptionPane.showInputDialog("Informe um número:\n" + "10, 20 ou 30"));
		
		// Expressão SWITCH com valor de numeroInformado

		switch (numeroInformado) {
		case 10:
			System.out.println("10");

			break;
		case 20:
			System.out.println("20");
			break;

		case 30:
			System.out.println("30");
			break;

		default:
			System.out.println("Não em 10, 20 ou 30");
			break;
		}
	}

}
