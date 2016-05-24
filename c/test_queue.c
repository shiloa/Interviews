#include <stdio.h>
#include <assert.h>
#include "queue.h"

queue_t * get_queue() {
    queue_t * queue = init_queue();
    assert(queue->count == 0);
    enqueue(&queue, create_node(1));
    enqueue(&queue, create_node(2));
    enqueue(&queue, create_node(3));
    enqueue(&queue, create_node(4));
    enqueue(&queue, create_node(5));

    return queue;
}

void test_queue_dequeue() {
    node_t * temp;
    queue_t * queue = get_queue();

    assert(queue->count == 5);

    temp = dequeue(&queue);
    assert(temp->val == 1);
    temp = dequeue(&queue);
    assert(temp->val == 2);
    temp = dequeue(&queue);
    assert(temp->val == 3);
    temp = dequeue(&queue);
    assert(temp->val == 4);
    temp = dequeue(&queue);
    assert(temp->val == 5);

    // checking for null pop
    assert(dequeue(&queue) == NULL);
}

void test_queue_enqueue() {
    queue_t * queue = get_queue();
    assert(queue->count == 5);
    enqueue(&queue, create_node(6));
    assert(queue->count == 6);
}

int main() {
    test_queue_dequeue();
    test_queue_enqueue();
    return 0;
}
