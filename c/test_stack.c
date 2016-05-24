#include <stdio.h>
#include <stdbool.h>
#include <assert.h>
#include "stack.h"

list_stack_t * get_stack() {
    list_stack_t * stack = init_stack();
    push(&stack, 1);
    push(&stack, 2);
    push(&stack, 3);
    push(&stack, 4);
    push(&stack, 5);

    return stack;
}

void test_is_empty() {
    list_stack_t * stack = init_stack();
    assert(is_empty_stack(stack));
}

void test_stack_pop() {
    int val;
    list_stack_t * stack = get_stack();

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

    assert(pop(&stack) == NULL);
}

void test_stack_peek() {
    int val, i;
    list_stack_t * stack = get_stack();

    for (i = 0; i < 5; ++i) {
        val = *peek(stack);
        assert(val == 5);
    }
}


int main() {
    test_is_empty();
    test_stack_pop();
    test_stack_peek();
    return 0;
}
