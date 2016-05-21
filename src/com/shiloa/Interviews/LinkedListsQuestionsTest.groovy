package com.shiloa.Interviews

class LinkedListsQuestionsTest extends GroovyTestCase {

    private LinkedList<Integer> list;

    @Override
    void setUp() {
        super.setUp()
        list = new LinkedList<Integer>();
        list.addNode(new Node<Integer>(1));
        list.addNode(new Node<Integer>(2));
        list.addNode(new Node<Integer>(4));
        list.addNode(new Node<Integer>(1));
        list.addNode(new Node<Integer>(1));
        list.addNode(new Node<Integer>(3));
        list.addNode(new Node<Integer>(2));
        list.addNode(new Node<Integer>(3));
        list.addNode(new Node<Integer>(4));
    }

    void testRemoveDuplicates() {
        assertEquals("1 2 4 1 1 3 2 3 4", list.toString())
        LinkedListsQuestions.removeDuplicates(list);
        assertEquals("1 2 4 3", list.toString())
        System.out.println(list.toString());
    }

    void testFindKthToLastNode() {
        Node<Integer> node = LinkedListsQuestions.findKthToLastNode(list, 3);
        assertEquals(3, node.getData());
    }

    void testHasLoop() {
        Node<Integer> n1 = new Node<Integer>(1);
        Node<Integer> n2 = new Node<Integer>(2);
        Node<Integer> n3 = new Node<Integer>(3);
        Node<Integer> n4 = new Node<Integer>(4);
        Node<Integer> n5 = new Node<Integer>(5);
        Node<Integer> n6 = new Node<Integer>(6);

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);
        n5.setNext(n6);
        n6.setNext(n3);

//        assertTrue(LinkedListsQuestions.hasLoop(n1));
        assertEquals(n3, LinkedListsQuestions.findLoopNode(n1));
    }
}
