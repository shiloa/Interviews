#ifndef linked_list_h
#define linked_list_h

#include <stdbool.h>

typedef struct node {
    struct node * next;
    int val;
} node_t;

// simple detection whether the list is empty
bool is_empty(node_t *);

// get the length of the list (by traversing the elements)
int length(node_t *);

// initialize an empty list
node_t * init_list();

// create a node and return its pointer
node_t * create_node(int);

// add a node to a list that starts at head
bool add_node(node_t * , int);

// get a string representation of the list
// char * to_string(node_t *);

// print a list given its head
void print_list(node_t *);

#endif
