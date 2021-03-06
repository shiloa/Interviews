#ifndef BTREE_H
#define BTREE_H

#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

typedef struct tree_node {
    int val;
    bool visited;
    struct tree_node * left;
    struct tree_node * right;
} tree_node_t;


// initialize an empty tree node
tree_node_t * create_tree_node(int);

// insert a node to the tree to ensure it
// is a BST
tree_node_t * bst_insert(tree_node_t *, int);

// simple implementation of BFS that prints 
// the order nodes are visited (in-order BFS)
void bfs(tree_node_t *);
void bfs_helper(tree_node_t *, queue_t *);

// simple implementation of DFS that prints 
// the order nodes are visited (in-order DFS)
void dfs(tree_node_t *);

#endif
