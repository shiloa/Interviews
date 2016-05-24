#include <stdio.h>
#include <assert.h>
#include "linked_list.h"

node_t * get_list() {
    node_t * head = create_node(1);
    add_node(head, 2);
    add_node(head, 3);
    add_node(head, 4);
    add_node(head, 5);

    return head;
}

void test_is_empty() {
    assert(is_empty(NULL));
}

void test_length() {
    node_t * head = get_list();
    assert(5 == length(head));
}

void test_create_node() {
    node_t * head = get_list();
    add_node(head, 6);
    add_node(head, 7);
    assert(7 == length(head));
}

int main() {
    test_is_empty();
    test_length();
}
