#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

typedef struct tree_node {
    int val;
    struct tree_node * left;
    struct tree_node * right;
} tree_node_t;


tree_node_t * create_tree_node(int val) {
    tree_node_t * new_node = (tree_node_t *)malloc(sizeof(tree_node_t));

    if (new_node == NULL) {
        return NULL;
    }

    new_node->val = val;
    new_node->left = new_node->right = NULL;
    return new_node;
}

void dfs(tree_node_t * root) {
}
