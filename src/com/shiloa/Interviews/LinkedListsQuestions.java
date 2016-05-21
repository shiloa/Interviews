package com.shiloa.Interviews;

import java.util.Objects;

class LinkedListsQuestions<T> {

    /**
     * Utility to remove duplicates from a linked list
     * @param list
     * @return
     */
    static LinkedList removeDuplicates(LinkedList list) {

        for (int i = 0 ; i < list.getLength() ; i++) {
            Node current = list.getNodeAt(i);
            if (!Objects.isNull(current)) {
                for (int j = i + 1 ; j < list.getLength() ; j++) {
                    if (list.getNodeAt(j).getData() == current.getData()) {
                        list.removeNodeAt(j);
                        j--;
                    }
                }
            }
        }

        return list;
    }
}
