# Decodificador de Código Morse com Árvore Binária

## 📋 Descrição

Este projeto simula um **decodificador de mensagens em código Morse** em Java, utilizando uma **árvore binária** para representar os caminhos dos caracteres do alfabeto.

O objetivo foi implementar a árvore de forma manual, sem utilizar estruturas de dados prontas, e permitir a decodificação de mensagens, visualização da árvore e busca de códigos Morse.

---

## 🛠️ Estrutura do Código

- **Node.java**
  Representa um nó da árvore binária, contendo:

  - `data` (Caractere representado)
  - `left` (Filho esquerdo → representa o ponto `.`)
  - `right` (Filho direito → representa o traço `-`)

- **MorseTree.java**
  Implementa a árvore de decodificação Morse:

  - Método `buildTree()` → Constrói a árvore com os símbolos do alfabeto.
  - Método `insert(String morse, char symbol)` → Insere um caractere com base no código Morse.
  - Método `translateMorseToAlphabet(String morseCode)` → Traduz um código Morse completo para texto.
  - Método `search(char symbol)` → Retorna o código Morse de um caractere.
  - Método `findSymbol()` e `searchRecursive()` → Auxiliares para busca e tradução.
  - Método `showTree()` → Mostra a estrutura da árvore.

- **Main.java**
  Interface de interação no console:

  - Menu para o usuário escolher entre visualizar a árvore, buscar código Morse ou traduzir mensagens.

---

## 🎮 Como Rodar

1. Compile os arquivos `.java`:

   ```bash
   javac *.java
   ```

2. Execute o programa:

   ```bash
   java Main
   ```

---

## 👨‍💻 Integrantes

- Guilherme Tuchanski Rocha
- Luiz Henrique Matoso

---

## ✅ Regras Seguidas

- ❌ Não usamos arrays, listas prontas ou coleções.
- ❌ Não usamos StringBuilder, ArrayList, LinkedList, etc.
- ✅ Usamos apenas `String`, `int`, `try-catch`, `throws`, e manipulação manual de nós.
- ✅ `length` foi utilizado apenas para Strings.
- ✅ Implementação 100% manual da estrutura em árvore binária.
