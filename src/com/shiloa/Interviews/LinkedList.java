package com.shiloa.Interviews;

import java.util.Objects;

/**
 * A LinkedList implementation.
 *
 * Mayhaps it's even doubly linked (gasp!).
 */
class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int length;

    LinkedList() {
        this.head = null;
        this.length = 0;

    }

    LinkedList(Node<T> head) {
        this.head = head;
        this.tail = head;
        this.length = 1;
    }

    Node<T> getHead() {
        return this.head;
    }

    void addNode(Node<T> node) {
        if (this.length == 0) {
            this.head = node;
            this.tail = node;
        } else {
            node.setPrev(this.tail);
            this.tail.setNext(node);
            this.tail = node;
        }
        this.length++;
    }

    Node<T> getNodeAt(int index) {
        if (index > this.length) {
            return null;
        }

        Node<T> current = this.head;

        for (int i = 0 ; i < index ; i++) {
            current = current.getNext();
        }

        return current;
    }

    Node<T> removeNodeAt(int index) {
        if (index > this.length) {
            return null;
        }

        Node<T> current = this.head;

        if (index == 0) {
            // only 1 node exists
            if (this.head == this.tail) {
                this.head = this.tail = null;
                this.length = 0;
                return current;
            } else {
                this.head = current.getNext();
                this.length--;
                return current;
            }
        }

        for (int i = 0 ; i < index ; i++) {
            current = current.getNext();
        }

        Node<T> prev = current.getPrev();
        Node<T> next = current.getNext();

        if (!Objects.isNull(prev) && !Objects.isNull(next)) {
            prev.setNext(next);
            next.setPrev(prev);
        }

        this.length--;
        return current;

    }

    int getLength() { return this.length; }

    public String toString() {
        Node<T> current = this.head;
        String str = "";
        while(!Objects.isNull(current)) {
            str += current.getData().toString() + " ";
            current = current.getNext();
        }
        return str.trim();
    }
}
