#ifndef QUEUE_H
#define QUEUE_H

#include "linked_list.h"

typedef struct _queue {
    int count;
    node_t * head;
    node_t * tail;
} queue_t;

// initialize an empty queue
queue_t * init_queue();

// push a value into the queue
bool enqueue(queue_t **, int);

// retrieve a value from the queue
int * dequeue(queue_t **);

// check if queue is empty
bool is_empty_queue(queue_t *);

#endif
