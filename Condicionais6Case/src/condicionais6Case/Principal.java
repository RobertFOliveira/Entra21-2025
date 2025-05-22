package condicionais6Case;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        try {
            int numeroInformado = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));

            // Expressão switch com valor de numeroInformado
           
            String mensagem;
            switch (numeroInformado) {
                case 10:
                    mensagem = "Você digitou 10";
                    break;
                case 20:
                    mensagem = "Você digitou 20";
                    break;
                case 30:
                    mensagem = "Você digitou 30";
                    break;
                default:
                    mensagem = "Você digitou um número diferente de 10, 20 ou 30";
                    break;
            }

            // Mostra a mensagem final ao usuário em uma janela
            JOptionPane.showMessageDialog(null, mensagem);

        } catch (NumberFormatException e) {
            // Mensagem de erro para entradas não numéricas
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, digite um número inteiro.");
        }
    }
}

