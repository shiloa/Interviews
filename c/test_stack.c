#include <stdio.h>
#include <stdbool.h>
#include <assert.h>
#include "stack.h"

node_t * get_stack() {
    node_t * stack = init_stack();
    push(&stack, 1);
    push(&stack, 2);
    push(&stack, 3);
    push(&stack, 4);
    push(&stack, 5);

    return stack;
}

void test_is_empty() {
    assert(is_empty(NULL));
}

void test_stack() {
    int val;
    node_t * stack = get_stack();

    val = *pop(&stack);
    assert(val == 5);
    val = *pop(&stack);
    assert(val == 4);
    val = *pop(&stack);
    assert(val == 3);
    val = *pop(&stack);
    assert(val == 2);
    val = *pop(&stack);
    assert(val == 1);
}

int main() {
    /* test_is_empty(); */
    test_stack();
    return 0;
}
