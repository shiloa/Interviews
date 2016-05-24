#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "linked_list.h"

// simple detection whether the list is empty
bool is_empty(node_t * head) {
    return (!head || head == NULL) ? true : false;
}

// get the length of the list (by traversing the elements)
int length(node_t * head) {
    int counter = 0;
    node_t * current = head;

    while (current != NULL) {
        counter++;
        current = current->next;
    }

    return counter;
}

// initialize an empty list
node_t * init_list() {
    node_t * head = (node_t *)malloc(sizeof(node_t));

    if (head == NULL) {
        return NULL;
    }

    head->next = NULL;

    return head;
}

// get list length
int get_length(node_t * head) {
    int counter = 0;

    if (head == NULL) {
        return counter;
    }

    node_t * current = head;

    while (current->next != NULL) {
        counter++;
        current = current->next;
    }

    return counter;
}

// create a node and return its pointer
node_t * create_node(int val) {
    node_t * new_node = (node_t *)malloc(sizeof(node_t));
    if (new_node == NULL) {
        return NULL;
    }

    new_node->val = val;
    new_node->next = NULL;
    return new_node;
}

// add a node to a list that starts at head
bool add_node(node_t * head, int val) {
    node_t * current = head;
    node_t * new_node = create_node(val);

    // if node creation failed
    if (new_node == NULL) {
        return false;
    }

    // edge case - the list is empty: add to head
    if (head == NULL) {
        head = new_node;
        return true;
    }

    // normal case - seek the end of the list
    while (current->next != NULL) {
        current = current->next;
    }

    current->next = new_node;
    return true;
}

/**
 *
// get a string representation of the list
char * to_string(node_t * head) {
    // get the length of the list to know the size
    // of buffer to allocate
    int len = length(head) * 5 + 10;
    char buf[len];

    node_t * current = head;

    while(current->next != NULL) {
        char str[5];
        sprintf(str, "%d -> ", current->val);
        strcpy(buf, str);
        current = current->next;
    }

    strcpy(buf, "NULL");

    return buf;
}
*/

// print a list given its head
void print_list(node_t * head) {
    node_t * current = head;
    while(current->next != NULL) {
        printf("%d -> ", current->val);
        current = current->next;
    }

    printf("NULL");
}
