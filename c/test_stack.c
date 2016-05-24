#include <stdio.h>
#include <stdbool.h>
#include <assert.h>
#include "stack.h"

list_stack_t * get_stack() {
    list_stack_t * stack = init_stack();
    push(&stack, create_node(1));
    push(&stack, create_node(2));
    push(&stack, create_node(3));
    push(&stack, create_node(4));
    push(&stack, create_node(5));

    return stack;
}

void test_is_empty() {
    list_stack_t * stack = init_stack();
    assert(is_empty_stack(stack));
}

void test_stack_pop() {
    node_t * temp;
    list_stack_t * stack = get_stack();

    temp = pop(&stack);
    assert(temp->val == 5);
    temp = pop(&stack);
    assert(temp->val == 4);
    temp = pop(&stack);
    assert(temp->val == 3);
    temp = pop(&stack);
    assert(temp->val == 2);
    temp = pop(&stack);
    assert(temp->val == 1);

    assert(pop(&stack) == NULL);
}

void test_stack_peek() {
    int i;
    node_t * temp;

    list_stack_t * stack = get_stack();

    for (i = 0; i < 5; ++i) {
        node_t * temp = peek(stack);
        assert(temp->val == 5);
    }
}

int main() {
    test_is_empty();
    test_stack_pop();
    test_stack_peek();
    return 0;
}
