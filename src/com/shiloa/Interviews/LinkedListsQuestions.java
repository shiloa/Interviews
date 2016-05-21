package com.shiloa.Interviews;

import sun.awt.image.ImageWatched;

import java.util.Objects;
import java.util.Stack;

class LinkedListsQuestions {

    /**
     * Utility to remove duplicates from a linked list
     * Runs in O(n^2) time, O(1) space.
     * @param list
     * @return
     */
    static LinkedList removeDuplicates(LinkedList list) {
        Node current = list.getHead();
        Node runner;

        while(!Objects.isNull(current)) {
            runner = current.getNext();
            while (!Objects.isNull(runner)) {
                if (runner.getData() == current.getData()) {
                    Node next, prev;
                    next = runner.getNext();
                    prev = runner.getPrev();
                    list.decrementLength();

                    if (!Objects.isNull(prev)) {
                        prev.setNext(next);
                    }

                    if (!Objects.isNull(next)) {
                        next.setPrev(prev);
                    }
                }
                runner = runner.getNext();
            }
            current = current.getNext();
        }

        return list;
    }

    /**
     * Finds the kth element from the end of the list for
     * a singly linked list. Runs in O(n) time, O(1) space.
     * @param list
     * @param index
     * @return
     */
    static Node findKthToLastNode(LinkedList list, int index) {
        if (index > list.getLength()) {
            return null;
        }

        // this is the list index we need
        int position = list.getLength() - index - 1;

        Node current = list.getHead();
        while (position > 0) {
            current = current.getNext();
            position--;
        }

        return current;
    }

    /**
     * detect if a linked list contains a loop
     * @param list
     * @return
     */
    static boolean hasLoop(Node node) {
        return !Objects.isNull(hasLoopHelper(node));
    }

    /**
     * Actually returns the node in which the slow and fast runners met
     * @param node
     * @return
     */
    static Node hasLoopHelper(Node node) {

        if (Objects.isNull(node)) {
            return null;
        }

        // initialize fast one step ahead of slow
        Node slow, fast;
        slow = node;
        fast = node.getNext();

        while (!Objects.isNull(fast) && !Objects.isNull(slow) && !Objects.isNull(fast.getNext())) {
            if (slow == fast) {
                return fast;
            }
            slow = slow.getNext();
            // fast always jumps 2 nodes ahead
            fast = fast.getNext().getNext();
        }

        return null;
    }

    /**
     * Find the node in a looped linked list in which the loop begins
     * @param node
     * @return Node
     */
    static Node findLoopNode(Node node) {
        if (hasLoop(node)) {
            Node slow, fast;
            slow = node;
            fast = hasLoopHelper(node);

            while (slow != fast) {
                slow = slow.getNext();
                fast = fast.getNext();
            }
            return slow;
        }

        return null;
    }

}
