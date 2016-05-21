package com.shiloa.Interviews

/**
 * Created by shilo on 21/05/2016.
 */
class LinkedListsQuestionsTest extends GroovyTestCase {
    void testRemoveDuplicates() {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.addNode(new Node<Integer>(1));
        list.addNode(new Node<Integer>(2));
        list.addNode(new Node<Integer>(4));
        list.addNode(new Node<Integer>(1));
        list.addNode(new Node<Integer>(1));
        list.addNode(new Node<Integer>(3));
        list.addNode(new Node<Integer>(2));
        list.addNode(new Node<Integer>(3));
        list.addNode(new Node<Integer>(4));
        assertEquals(list.toString(), "1 2 4 1 1 3 2 3 4")
        LinkedListsQuestions.removeDuplicates(list);
        assertEquals(list.toString(), "1 2 4 3")
        System.out.println(list.toString());
    }
}
