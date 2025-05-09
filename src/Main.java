import models.MorseTree;

public class Main {
    public static void main(String[] args) {
        MorseTree tree = new MorseTree();

        // Teste 1: Mostrar a árvore (opcional)
        System.out.println("Árvore de Morse:");
        tree.showTree();

        // Teste 2: Buscar o código Morse de uma letra
        char letra = 'S';
        String codigoMorse = tree.search(letra);
        System.out.println("\nLetra: " + letra + " -> Código Morse: " + codigoMorse);

        // Teste 3: Decodificar uma palavra em Morse
        String morse = "... --- ...";
        String palavra = tree.translateMorseToAlphabet(morse);
        System.out.println("\nCódigo Morse: " + morse + " -> Palavra: " + palavra);

        // Teste 4: Outra palavra
        String morse2 = ".- .-.. .-.. ---";
        String palavra2 = tree.translateMorseToAlphabet(morse2);
        System.out.println("\nCódigo Morse: " + morse2 + " -> Palavra: " + palavra2); // "ALLO"

        // Teste 5: Palavra com número
        String morse3 = ".---- ..--- ...--"; // 1 2 3
        String palavra3 = tree.translateMorseToAlphabet(morse3);
        System.out.println("\nCódigo Morse: " + morse3 + " -> Palavra: " + palavra3); // "123"
    }
}
