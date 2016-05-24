#include <assert.h>
#include "queue.h"

node_t * get_queue() {
    node_t * queue = create_node(1);
    enqueue(queue, 2);
    enqueue(queue, 3);
    enqueue(queue, 4);
    enqueue(queue, 5);

    return queue;
}

void test_queue_dequeue() {
    int val;
    node_t * queue = get_queue();

    assert(length(queue) == 5);

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
}

void test_queue_enqueue() {
    node_t * queue = get_queue();
    assert(length(queue) == 5);
    enqueue(queue, 6);
    assert(length(queue) == 6);
}

int main() {
    test_queue_dequeue();
    test_queue_enqueue();
    return 0;
}
