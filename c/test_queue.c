#include <stdio.h>
#include <assert.h>
#include "queue.h"

queue_t * get_queue() {
    queue_t * queue = init_queue();
    assert(queue->count == 0);
    enqueue(&queue, 1);
    enqueue(&queue, 2);
    enqueue(&queue, 3);
    enqueue(&queue, 4);
    enqueue(&queue, 5);

    return queue;
}

void test_queue_dequeue() {
    int val;
    queue_t * queue = get_queue();

    assert(queue->count == 5);

    val = *dequeue(&queue);
    assert(val == 1);
    val = *dequeue(&queue);
    assert(val == 2);
    val = *dequeue(&queue);
    assert(val == 3);
    val = *dequeue(&queue);
    assert(val == 4);
    val = *dequeue(&queue);
    assert(val == 5);

    // checking for null pop
    assert(dequeue(&queue) == NULL);
}

void test_queue_enqueue() {
    queue_t * queue = get_queue();
    assert(queue->count == 5);
    enqueue(&queue, 6);
    assert(queue->count == 6);
}

int main() {
    test_queue_dequeue();
    test_queue_enqueue();
    return 0;
}
