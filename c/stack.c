#include <stdio.h>
#include <stdlib.h>
#include "stack.h"

// a stack is basically a linked list with new nodes
// being inserted at the head
list_stack_t * init_stack() {
    list_stack_t * stack = (list_stack_t *)malloc(sizeof(list_stack_t));
    stack->count = 0;
    stack->head = stack->tail = NULL;
    return stack;
}

// check is the stack is empty
bool is_empty_stack(list_stack_t * stack) {
    return (stack->count == 0);
}

// push new values to the stack
bool push(list_stack_t ** stack, node_t * new_node) {

    if (is_empty_stack(*stack)) {
        (*stack)->head = (*stack)->tail = new_node;
        (*stack)->count++;
        return true;
    }

    // add the new node to the top of the stack
    // and promote counter
    new_node->next = (*stack)->head;
    (*stack)->head = new_node;
    (*stack)->count++;

    return true;
}

// pop the top of the stack
node_t * pop(list_stack_t ** stack) {

    // empty stack returns null
    if (is_empty_stack(*stack)) {
        return NULL;
    }

    // save the pointer to the top element
    node_t * top = (*stack)->head;

    // replace the front of the stack with the next node
    (*stack)->head = top->next;
    (*stack)->count--;

    // see if we've emptied the stack
    if ((*stack)->count == 0) {
        (*stack)->head = (*stack)->tail = NULL;
    }

    return top;
}

// get the value at the top of the stack (w/o popping)
// (using a ptr in case the list is empty)
node_t * peek(list_stack_t * stack) {
    if (is_empty_stack(stack)) {
        return NULL;
    }

    node_t * top = (stack)->head;

    return top;
}
