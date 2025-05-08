package models;

public class Node {

    private char data;
    private Node left;
    private Node right;

    public Node() {
        this.left = null;
        this.right = null;
        this.data = '\0';
    }

}
