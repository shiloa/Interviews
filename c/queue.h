#ifndef QUEUE_H
#define QUEUE_H

#include "linked_list.h"

// initialize an empty queue
node_t * init_queue(int);

// push a value into the queue
bool enqueue(node_t *, int);

// retrieve a value from the queue
int * dequeue(node_t **);


#endif
