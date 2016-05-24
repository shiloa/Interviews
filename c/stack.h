#ifndef STACK_H
#define STACK_H

#include "linked_list.h"

typedef struct stack_t {
    int count;
    node_t * head;
    node_t * tail;
} list_stack_t;

// a stack is basically a linked list with new nodes
// being inserted at the head
list_stack_t * init_stack();

// push new values to the stack
// - pass by reference as the list needs to change in place
bool push(list_stack_t **, node_t *);

// pop the top of the stack
// - using an int ptr in case the list is empty
// - also pass by reference as the list needs to change in place
node_t * pop(list_stack_t **);

// get the value at the top of the stack (w/o popping)
// (using a ptr in case the list is empty)
node_t * peek(list_stack_t *);

// check is the stack is empty
bool is_empty_stack(list_stack_t *);

#endif
