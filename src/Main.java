import models.MorseTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MorseTree tree = new MorseTree();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n-=-=-= MENU INTERATIVO - CÓDIGO MORSE =-=-=-");
            System.out.println("1 - Mostrar árvore Morse");
            System.out.println("2 - Buscar código Morse de uma letra");
            System.out.println("3 - Decodificar uma palavra em Morse");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\nÁrvore de Morse:");
                    tree.showTree();
                    break;

                case 2:
                    System.out.print("Digite uma letra (A-Z ou 0-9): ");
                    char letra = scanner.nextLine().toUpperCase().charAt(0);
                    String morse = tree.search(letra);
                    if (morse != null) {
                        System.out.println("Código Morse: " + morse);
                    } else {
                        System.out.println("Letra não encontrada.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o código Morse: ");
                    String morseCode = scanner.nextLine();
                    String palavra = tree.translateMorseToAlphabet(morseCode);
                    System.out.println("Palavra decodificada: " + palavra);
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}
