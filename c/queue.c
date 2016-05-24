#include "queue.h"
#include <stdio.h>

// initialize an empty queue
node_t * init_queue(int val) {
    node_t * queue = init_list();
    queue->val = val;
    return queue;
}

// push a value into the queue
bool enqueue(node_t * queue, int newval) {

    // simply adding to a linked list
    return add_node(queue, newval);
}

// retrieve a value from the queue
int * dequeue(node_t ** queue) {
    if (queue == NULL) {
        return NULL;
    }

    // pop the first element
    node_t * top = *queue;

    // replace the front of the queue with the next node
    *queue = top->next;

    return &(top->val);
}
