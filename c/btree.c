#include "btree.h"
#include "queue.h"

// initialize an empty tree node
tree_node_t * create_tree_node(int val) {
    tree_node_t * new_node = (tree_node_t *)malloc(sizeof(tree_node_t));

    if (new_node == NULL) {
        return NULL;
    }

    new_node->val = val;
    new_node->visited = false;
    new_node->left = new_node->right = NULL;
    return new_node;
}

// insert a node to the tree to ensure it
// is a BST
tree_node_t * bst_insert(tree_node_t * root, int newval) {
    if (root == NULL) {
        return create_tree_node(newval);
    } else if (root->val >= newval) {
        // insert left
        root->left = bst_insert(root->left, newval);
    } else {
        // insert right
        root->right = bst_insert(root->right, newval);
    }
    return root;
}

// simple implementation of BFS that prints 
// the order nodes are visited (in-order BFS)
void bfs_helper(tree_node_t * root, queue_t * queue) {

    if (root != NULL) {
        printf("%d ", root->val);
    }

    enqueue(&queue, root->left->val);
    enqueue(&queue, root->right->val);

    if (root->left != NULL) {
        printf("%d")
        dfs(root->left);
    }

    if (root != NULL) printf("%d ", root->val);
    if (root->right != NULL) dfs(root->right);

}

// simple implementation of DFS that prints 
// the order nodes are visited (in-order DFS)
void dfs(tree_node_t * root) {
    if (root->left != NULL) dfs(root->left);

    if (root != NULL) printf("%d ", root->val);

    if (root->right != NULL) dfs(root->right);
}
