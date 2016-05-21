package com.shiloa.Interviews

class LinkedListTest extends GroovyTestCase {
    private Node<Integer> head;

    @Override
    void setUp() {
        super.setUp()
        head = new Node<Integer>(1);
    }

    void testConstructor() {
        LinkedList<Integer> list = new LinkedList(head);
        assertEquals(list.getHead(), head);
        assertEquals(list.getHead().getData(), 1);
        assertEquals(list.getLength(), 1);
    }

    void testAddNode() {
        LinkedList<Integer> list = new LinkedList(head);
        list.addNode(new Node<Integer>(2));
        assertEquals(list.getHead().getNext().getData(), 2);
        assertEquals(list.getLength(), 2);
    }

    void testGetNodeAt() {
        LinkedList<Integer> list = new LinkedList(head);
        list.addNode(new Node<Integer>(2));
        list.addNode(new Node<Integer>(3));
        list.addNode(new Node<Integer>(4));
        list.addNode(new Node<Integer>(5));

        // ensure we return null for an unreasonable index
        assertNull(list.getNodeAt(100));

        assertEquals(list.getNodeAt(3).getData(), 4);
        assertEquals(list.getNodeAt(3).getPrev().getData(), 3);
    }

    void testRemoveNodeAt() {
        LinkedList<Integer> list = new LinkedList(head);
        list.addNode(new Node<Integer>(2));
        list.addNode(new Node<Integer>(3));
        list.addNode(new Node<Integer>(4));
        list.addNode(new Node<Integer>(5));
        assertEquals(list.getLength(), 5)
        assertEquals(list.toString(), "1 2 3 4 5")

        Node<Integer> removed = list.removeNodeAt(3);
        assertEquals(list.toString(), "1 2 3 5")

        list.removeNodeAt(2);
        assertEquals(list.toString(), "1 2 5")

        list.removeNodeAt(0);
        list.removeNodeAt(0);
        list.removeNodeAt(0);
        assertEquals(list.toString(), "")
    }

    void testRemoveNodeAtLastPosition() {
        LinkedList<Integer> list = new LinkedList(head);
        list.addNode(new Node<Integer>(2));
        list.addNode(new Node<Integer>(3));
        list.addNode(new Node<Integer>(4));
        list.addNode(new Node<Integer>(5));
        assertEquals(list.getLength(), 5)
        assertEquals(list.toString(), "1 2 3 4 5")

        list.remove(5);
        assertEquals(list.toString(), "1 2 3 4")
        list.remove(2);
        assertEquals(list.toString(), "1 3 4")
    }
}
