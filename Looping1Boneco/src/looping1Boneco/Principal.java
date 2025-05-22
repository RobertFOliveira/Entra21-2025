package looping1Boneco;

public class Principal {

    public static void main(String[] args) {
        int posicao = 0;
        boolean indoParaDireita = true;
        int larguraConsole = 30;

        while (true) {
            // Limpa o console (simulado imprimindo várias linhas em branco)
            for (int i = 0; i < 50; i++) {
                System.out.println();
            }

            // Imprime espaços até a posição atual
            for (int i = 0; i < posicao; i++) {
                System.out.print(" ");
            }

            // Imprime o personagem
            System.out.println("🤖");

            // Pausa para "animar"
            try {
                Thread.sleep(100); // 100 milissegundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Atualiza a posição
            if (indoParaDireita) {
                posicao++;
                if (posicao == larguraConsole) {
                    indoParaDireita = false;
                }
            } else {
                posicao--;
                if (posicao == 0) {
                    indoParaDireita = true;
                }
            }
        }
    }


}

	
