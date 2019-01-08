package com.codecool.linkedList;

public class Node {
    private int info;
    private Node next;
    private boolean hasNext;

    public Node(int info) {
        this.info = info;
        this.hasNext = false;
    }

    public Node getNext() {
        return next;
    }

    public int getInfo() {
        return info;
    }

    public void setNext(Node next) {
       this.next = next;
       this.hasNext = true;

    }

    public boolean isHasNext() {
        return hasNext;
    }
}
