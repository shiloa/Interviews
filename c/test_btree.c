#include "btree.h"

tree_node_t * get_tree() {
    tree_node_t * root = create_tree_node(1);
    root->left = create_tree_node(2);
    root->right = create_tree_node(3);

    root->left->left = create_tree_node(4);
    root->left->right = create_tree_node(5);
    root->left->left->left = create_tree_node(6);

    return root;
}

tree_node_t * get_search_tree() {
    tree_node_t * root = create_tree_node(3);
    bst_insert(root, 0);
    bst_insert(root, 1);
    bst_insert(root, 2);
    bst_insert(root, 4);
    bst_insert(root, 5);
    bst_insert(root, 6);
    bst_insert(root, 60);

    return root;
}

int main() {
    tree_node_t * root = get_tree();
    tree_node_t * bst = get_search_tree();

    dfs(root);
    puts("");
    dfs(bst);
    return 0;
}
