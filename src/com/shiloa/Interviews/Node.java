package com.shiloa.Interviews;

/**
 * Linked List Node class
 */
class Node<T> {
    private T data;
    private Node<T> prev;
    private Node<T> next;

    Node(T data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

    Node(T data, Node<T> prev, Node<T> next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    /**
     * Data setter/getter
     */
    T getData() { return this.data; }
    void setData(T data) { this.data = data; }

    /**
     * Previous node setter/getter
     */
    Node<T> getPrev() { return this.prev; }
    void setPrev(Node<T> prev) { this.prev = prev; }

    /**
     * Next node setter/getter
     */
    Node<T> getNext() { return this.next; }
    void setNext(Node<T> next) { this.next = next; }
}
