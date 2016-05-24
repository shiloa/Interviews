#ifndef STACK_H
#define STACK_H

#include "linked_list.h"

// a stack is basically a linked list with new nodes
// being inserted at the head
node_t * init_stack();

// push new values to the stack
// - pass by reference as the list needs to change in place
bool push(node_t **, int);

// pop the top of the stack
// - using an int ptr in case the list is empty
// - also pass by reference as the list needs to change in place
int * pop(node_t **);

// get the value at the top of the stack (w/o popping)
// (using a ptr in case the list is empty)
int * peek(node_t *);

#endif
