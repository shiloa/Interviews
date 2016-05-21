package com.shiloa.Interviews;

import java.util.ArrayList;

public class TreesAndGraphs {

    /**
     * Depth First Search
     * @param root
     */
    public static void dfs(TreeNode<String> root) {
        if (root != null) {
            root.visit();
            root.getNeighbors()
                    .stream()
                    .filter(node -> (node != null && !node.isVisited())).forEach(TreesAndGraphs::dfs);
        }
    }

    /**
     * Breadth First Search
     * @param root
     */
    public static void bfs(TreeNode<String> root) {
        ArrayList<TreeNode<String>> queue = new ArrayList<TreeNode<String>>();
        bfsHelper(root, queue);
    }

    /**
     * Helper to make the BFS signature cleaner
     * @param root
     * @param queue
     */
    public static void bfsHelper(TreeNode<String> root, ArrayList<TreeNode<String>> queue) {
        if (root != null) {

            if (queue == null) {
                queue = new ArrayList<TreeNode<String>>();
            }

            root.visit();
            root.getNeighbors()
                    .stream()
                    .filter(node -> (node != null && !node.isVisited()))
                    .forEach(queue::add);

            while (!queue.isEmpty()) {
                TreeNode<String> node = queue.remove(0);
                bfsHelper(node, queue);
            }
        }
    }

    /**
     * Check to see if a certain BTree is balanced.
     * @param TreeNode<T> root
     */
    public static boolean isTreeBalanced(TreeNode<String> root) {
        if (root == null) return true;

        // get the height difference between the left and right sub-trees
        TreeNode<String> left = root.getLeft();
        TreeNode<String> right = root.getRight();
        int diff = Math.abs(getTreeHeight(left) - getTreeHeight(right));

        // return the union of the recursion calls
        return diff <= 1 && isTreeBalanced(left) && isTreeBalanced(right) ;
    }

    /**
     * Utility method to find the height of a given tree
     * @param TreeNode<T> root
     * @return int height
     */
    public static int getTreeHeight(TreeNode<String> root) {
        if (root == null) return -1;
        return Integer.max(
                getTreeHeight(root.getLeft()),
                getTreeHeight(root.getRight())
        ) + 1;
    }
}
