package edu.kis.vh.nursery.list;

/**
 * A simple integer linked list implementation that allows pushing, popping,
 * and retrieving the top element.
 */

public class IntLinkedList {                // TODO: nieużywana klasa, można ją usunąć

    Node last;
    int i;

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return -1;
        return last.getValue();
    }

    public int pop() {
        if (isEmpty())
            return -1;
        int ret = last.getValue();
        last = last.prev;
        return ret;
    }

}

/**
 * A node in the doubly linked list that stores an integer value.
 */

class Node {

    private int value;
    protected Node prev, next;

    public Node(int i) {
        value = i;
    }

    public int getValue() {
        return value;
    }
}
