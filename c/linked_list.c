#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

typedef struct node {
    struct node * next;
    int val;
} node_t;

node_t * create_node(int val) {
    node_t * new_node = (node_t *)malloc(sizeof(node_t));
    if (new_node == NULL) {
        return NULL;
    }

    new_node->val = val;
    new_node->next = NULL;
    return new_node;
}

bool add_node(node_t * head, int val) {
    node_t * current = head;

    while(current->next != NULL) {
        current = current->next;
    }

    node_t * new_node = create_node(val);

    if (new_node == NULL) {
        return false;
    }

    current->next = new_node;
    return true;
}

void print_list(node_t * head) {
    node_t * current = head;
    while(current->next != NULL) {
        printf("%d -> ", current->val);
        current = current->next;
    }
    printf("NULL");
}

int main() {
    node_t * head = create_node(1);
    add_node(head, 2);
    add_node(head, 3);
    add_node(head, 4);
    add_node(head, 5);

    print_list(head);

    return 0;
}
