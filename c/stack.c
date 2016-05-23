#include <stdio.h>
#include <stdlib.h>
#include "stack.h"

// a stack is basically a linked list with new nodes
// being inserted at the head
node_t * init_stack() {
    return init_list();
}

// simple detection whether the stack is empty
bool is_empty(node_t * stack) {
    return (stack == NULL) ? true : false;
}

// push new values to the stack
bool push(node_t ** stack, int newval) {

    node_t * top = create_node(newval);

    // fail early
    if (top == NULL) {
        return false;
    }

    // edge case: stack is empty, insert first
    if (is_empty(*stack)) {
        *stack = top;
        return true;
    }

    // add the new node to the top of the stack
    // and promote
    top->next = *stack;
    *stack = top;
    return true;
}

// pop the top of the stack
int * pop(node_t ** stack) {
    if (is_empty(*stack)) {
        return NULL;
    }

    // save the pointer to the top element
    node_t * top = *stack;
    int * val = &(top->val);

    // promote the stack to the next element
    *stack = top->next;

    // free the memory occupied by the popped node
    /* free(top); */

    return val;
}

// get the value at the top of the stack (w/o popping)
// (using a ptr in case the list is empty)
int * peek(node_t * stack) {
    if (is_empty(stack)) {
        return NULL;
    }

    return &(stack->val);
}
