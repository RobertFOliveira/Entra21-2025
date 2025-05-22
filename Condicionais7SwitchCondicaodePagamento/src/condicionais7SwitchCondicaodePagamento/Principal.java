package condicionais7SwitchCondicaodePagamento;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// 5. Elabore um algoritimo que calcule o que deve ser pago por um produto,
		// considerando o preço normal de etiqueta e a escolha da condição de pagamento.
		// Utilize os códigos da tabela a seguir para ler qual a condição de pagamento
		// escolhida
		// e efetuar o cálculo adequado.
		// Código Condição de pagamento
		// 1 À vista em dinheiro ou cheque, recebe 10% de desconto
		// 2 À vista no cartão de crédito, recebe 15% de desconto
		// 3 Em duas vezes, preço normal de etiqueta sem juros
		// 4 Em três vezes, preço normal de etiqueta mais juros de 10%

		
		   // Solicita o valor do produto
        String precoStr = JOptionPane.showInputDialog("Informe o preço do produto:");
        double preco = Double.parseDouble(precoStr);

        // Solicita o código da condição de pagamento
        String codigoStr = JOptionPane.showInputDialog(
                "Informe a condição de pagamento:\n" +
                "1 - À vista em dinheiro ou cheque (10% de desconto)\n" +
                "2 - À vista no cartão de crédito (15% de desconto)\n" +
                "3 - Em duas vezes (preço normal)\n" +
                "4 - Em três vezes com juros (10% de juros)"
        );
        int codigo = Integer.parseInt(codigoStr);

        double total = 0.0;
        String mensagem;

        switch (codigo) {
            case 1:
                total = preco * 0.90;
                mensagem = "Pagamento à vista em dinheiro ou cheque.\nTotal a pagar com 10% de desconto: R$ " + total;
                break;
            case 2:
                total = preco * 0.85;
                mensagem = "Pagamento à vista no cartão de crédito.\nTotal a pagar com 15% de desconto: R$ " + total;
                break;
            case 3:
                total = preco;
                mensagem = "Pagamento em duas vezes sem juros.\nTotal a pagar: R$ " + total + 
                           "\nDuas parcelas de R$ " + (total / 2);
                break;
            case 4:
                total = preco * 1.10;
                mensagem = "Pagamento em duas vezes com 10% de juros.\nTotal a pagar: R$ " + total +
                           "\nDuas parcelas de R$ " + (total / 3);
                break;
            default:
                mensagem = "Código de condição de pagamento inválido!";
                break;
        }

        // Mostra o resultado
        JOptionPane.showMessageDialog(null, mensagem);
    }
}