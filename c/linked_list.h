#ifndef linked_list_h
#define linked_list_h

#include <stdbool.h>

typedef struct node {
    struct node * next;
    int val;
} node_t;

// initialize an empty list
node_t * init_list();

// create a node and return its pointer
node_t * create_node(int);

// add a node to a list that starts at head
bool add_node(node_t * , int);

// print a list given its head
void print_list(node_t *);

#endif
