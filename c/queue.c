#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include "queue.h"

// initialize an empty queue
queue_t * init_queue() {
    queue_t * queue = (queue_t *)malloc(sizeof(queue_t));
    queue->count = 0;
    queue->head = queue->tail = NULL;
    return queue;
}

bool is_empty_queue(queue_t * queue) {
    return (queue->count == 0) ? true : false;
}

// push a value into the queue
bool enqueue(queue_t ** queue, node_t * new_node) {

    // edge case: first element
    if (is_empty_queue(*queue)) {
        (*queue)->head = (*queue)->tail = new_node;
        (*queue)->count++;
        return true;
    }

    // otherwise, insert at the end and update the tail
    // and the count
    (*queue)->tail->next = new_node;
    (*queue)->tail = new_node;
    (*queue)->count++;

    return true;
}

// retrieve a value from the queue
node_t * dequeue(queue_t ** queue) {
    if (is_empty_queue(*queue)) {
        return NULL;
    }

    // pop the first element
    node_t * top = (*queue)->head;

    (*queue)->head = top->next;
    // replace the front of the queue with the next node
    (*queue)->count--;

    // see if we've emptied the queue
    if ((*queue)->count == 0) {
        (*queue)->head = (*queue)->tail = NULL;
    }

    return top;
}
