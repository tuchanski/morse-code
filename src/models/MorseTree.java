package models;

public class MorseTree {

    private Node root;

    public MorseTree() {
        root = new Node();
        buildTree(); // Popula a árvore binária
    }

    public String search(char symbol) {
        // Chama o método searchRecursive para procurar o código morse correspondente ao símbolo
        return searchRecursive(root, "", symbol);
    }

    public void showTree() {
        // Chama o método showTreeRecursive para mostrar a árvore no console
        showTreeRecursive(root, 0);
    }

    // Pega uma palavra escrita em código Morse e converte cada trecho de código para uma letra normal
    public String translateMorseToAlphabet(String morseCode) {
        String result = "";
        String current = "";

        for (int i = 0; i < morseCode.length(); i++) {
            char ch = morseCode.charAt(i);

            // Se o caractere atual for um espaço, significa que terminou uma letra em código morse
            if (ch == ' ') {
                char symbol = findSymbol(root, current, 0);
                result += symbol;

                // Reseta o current para começar a próxima letra
                current = "";
            } else {
                // Se não for espaço, adiciona o caractere atual a sequência em construção
                current += ch;
            }
        }

        // Caso tenha sobrado uma última sequência sem espaço no final
        if (current.length() > 0) {
            char symbol = findSymbol(root, current, 0);
            result += symbol;
        }

        return result;
    }

    private char findSymbol(Node node, String code, int index) {

        // Se o índice chegou ao final do código morse, significa que percorremos todos os símbolos
        // e estamos no nó correspondente a letra desejada

        if (index == code.length()) {
            return node.getData();
        }

        // Se o caractere atual for '.', seguimos para o filho a esquerda
        if (code.charAt(index) == '.') {
            return findSymbol(node.getLeft(), code, index + 1);
        } else {
            // Caso contrário ('-'), seguimos para o filho a direita
            return findSymbol(node.getRight(), code, index + 1);
        }
    }

    private String searchRecursive(Node node, String path, char target) {


        // Caso o nó seja nulo, chegamos num beco sem saída da árvore
        if (node == null) {
            return null;
        }

        // Se o caractere armazenado no nó for igual ao caractere procurado, retornamos o caminho atual
        if (node.getData() == target) {
            return path;
        }

        // Faz uma chamada recursiva para a subárvore da esquerda, adicionando '.' ao caminho
        String leftResult = searchRecursive(node.getLeft(), path + ".", target);

        // Se encontramos o caractere na subárvore da esquerda, retornamos o caminho correspondente
        if (leftResult != null) {
            return leftResult;
        }

        // Caso não tenha encontrado a esquerda, buscamos na subárvore da direita, adicionando '-'
        return searchRecursive(node.getRight(), path + "-", target);
    }

    private void showTreeRecursive(Node node, int level) {

        // Se o nó for nulo não tem o que mostrar
        if (node == null) {
            return;
        }

        // Primeiro visita recursivamente o filho da direita
        showTreeRecursive(node.getRight(), level + 1);

        // Espaços para dar identação visual conforme a profundidade (nível) do nó
        for (int i = 0; i < level; i++) {
            System.out.print("   ");
        }

        // Se o nó tem um caractere válido
        if (node.getData() != '\0') {
            System.out.println(node.getData());
        }

        // Caso contrário, para representar um nó vazio
        else {
            System.out.println("*");
        }

        // Depois visita recursivamente o filho da esquerda
        showTreeRecursive(node.getLeft(), level + 1);
    }

    private void insert(String morse, char symbol) {

        // Nó raiz da árvore
        Node current = root;

        for (int i = 0; i < morse.length(); i++) {

            char ch = morse.charAt(i); // Caractere atual

            // Se o caractere for um '.' vai para o filho a esquerda
            if (ch == '.') {
                if (current.getLeft() == null) {
                    current.setLeft(new Node());
                }
                // Avança para o nó a esquerda
                current = current.getLeft();

            }

            // Se o caractere for '-' vai para o filho a direita
            else if (ch == '-') {
                if (current.getRight() == null) {
                    current.setRight(new Node());
                }
                // Avança para o nó a direita
                current = current.getRight();
            }
        }

        // Após percorrer todo o codigo morse, define o simbolo no nó atual
        current.setData(symbol);
    }

    private void buildTree() {
        // Constrói a árvore de morse inserindo os caracteres correspondentes
        insert(".-", 'A');
        insert("-...", 'B');
        insert("-.-.", 'C');
        insert("-..", 'D');
        insert(".", 'E');
        insert("..-.", 'F');
        insert("--.", 'G');
        insert("....", 'H');
        insert("..", 'I');
        insert(".---", 'J');
        insert("-.-", 'K');
        insert(".-..", 'L');
        insert("--", 'M');
        insert("-.", 'N');
        insert("---", 'O');
        insert(".--.", 'P');
        insert("--.-", 'Q');
        insert(".-.", 'R');
        insert("...", 'S');
        insert("-", 'T');
        insert("..-", 'U');
        insert("...-", 'V');
        insert(".--", 'W');
        insert("-..-", 'X');
        insert("-.--", 'Y');
        insert("--..", 'Z');
        insert("-----", '0');
        insert(".----", '1');
        insert("..---", '2');
        insert("...--", '3');
        insert("....-", '4');
        insert(".....", '5');
        insert("-....", '6');
        insert("--...", '7');
        insert("---..", '8');
        insert("----.", '9');
    }

}
