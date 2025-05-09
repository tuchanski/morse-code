package models;

public class Node {

    private char data; //
    private Node left;
    private Node right;

    public Node() {
        this.left = null;
        this.right = null;
        this.data = '\0';
    }

    public char getData() {
        return data;
    }

    public void setData(char data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
