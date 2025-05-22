package condicionais6SwitchCaseAumentoSalario;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// Solicita o salário atual
		String salarioAtu = JOptionPane.showInputDialog("Informe o salário atual: R$ ");
		double salario = Double.parseDouble(salarioAtu);

		// Solicita o código do cargo
		String codigoStr = JOptionPane.showInputDialog("Informe o código do cargo:\n" + "1 - Serviços Gerais\n"
				+ "2 - Vigia\n" + "3 - Recepcionista\n" + "4 - Vendedor");
		int codigoCargo = Integer.parseInt(codigoStr);

		String nomeCargo = "";
		double percentualAumento = 0;

		// Determina o cargo e o percentual de aumento
		switch (codigoCargo) {
		case 1:
			nomeCargo = "Serviços Gerais";
			percentualAumento = 0.50;
			break;
		case 2:
			nomeCargo = "Vigia";
			percentualAumento = 0.30;
			break;
		case 3:
			nomeCargo = "Recepcionista";
			percentualAumento = 0.25;
			break;
		case 4:
			nomeCargo = "Vendedor";
			percentualAumento = 0.15;
			break;

		default:
			JOptionPane.showMessageDialog(null, "Código de cargo inválido");
			return;

		}
		// Calcula o aumento e o novo salário
		double valorAumento = salario * percentualAumento;
		double novoSalario = salario + valorAumento;

		// Exibe os resultados
		String mensagem = String.format("Cargo: %s\nValor do aumento: R$ %.2f\nNovo salário: R$ %.2f", nomeCargo,
				valorAumento, novoSalario);
		JOptionPane.showMessageDialog(null, mensagem);

	}

}
