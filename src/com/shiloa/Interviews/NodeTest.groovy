package com.shiloa.Interviews

class NodeTest extends GroovyTestCase {

    void testDefaultConstructor() {
        Node<Integer> node = new Node<Integer>(5);
        assertEquals(node.getData(), 5);
        assertNull(node.getPrev());
        assertNull(node.getNext());
    }

    void testExtendedConstructor() {
        Node<Integer> prev = new Node<Integer>(4)
        Node<Integer> next = new Node<Integer>(6)
        Node<Integer> node = new Node<Integer>(5, prev, next);
        assertEquals(node.getData(), 5);
        assertEquals(node.getPrev().getData(), 4);
        assertEquals(node.getNext().getData(), 6);
    }

    void testNodeSetters() {
        Node<Integer> prev = new Node<Integer>(4)
        Node<Integer> next = new Node<Integer>(6)
        Node<Integer> node = new Node<Integer>(5);

        node.setNext(next);
        node.setPrev(prev);
        assertEquals(node.getPrev().getData(), 4);
        assertEquals(node.getNext().getData(), 6);
    }
}
