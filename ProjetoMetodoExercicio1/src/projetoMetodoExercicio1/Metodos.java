package projetoMetodoExercicio1;

import java.util.Scanner;

public class Metodos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 4 para as estações do ano: \n1 = Verão, \n2 = Outono, \n3 = Inverno, \n4 = Primavera");
        
        int escolha = sc.nextInt();  // Ler o número escolhido pelo usuário
        
        switch (escolha) {
            case 1:
                verao();
                break;
            case 2:
                outono();
                break;
            case 3:
                inverno();
                break;
            case 4:
                primavera();
                break;
            default:
                System.out.println("Número inválido!");
        }
        
        sc.close();
    }
    
    // Métodos sem parâmetros fora do main:
    static void verao() {
        System.out.println("É Verão");
        System.out.println("E o tempo está quente");
    }
    
    static void outono() {
        System.out.println("É Outono");
    }
    
    static void inverno() {
        System.out.println("É Inverno");
        System.out.println("E está frio");
    }
    
    static void primavera() {
        System.out.println("É Primavera");
    }
}
