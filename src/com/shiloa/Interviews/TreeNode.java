package com.shiloa.Interviews;

import java.util.Arrays;
import java.util.List;

/**
 * A naive implementation of a binary tree's node
 * @param <T> the data type for this node
 */
public class TreeNode<T> {

    private TreeNode<T> left;
    private TreeNode<T> right;
    private T data;
    private boolean isVisited;

    TreeNode(T data) {
        this.data = data;
        this.isVisited = false;
    }

    TreeNode getLeft() {
        return this.left;
    }

    TreeNode getRight() {
        return this.right;
    }

    void assign(TreeNode left, TreeNode right) {
        this.left = left;
        this.right = right;
        this.isVisited = false;
    }

    List<TreeNode<T>> getNeighbors() {
        return Arrays.asList(this.left, this.right);
    }

    void visit() {
        this.isVisited = true;
        System.out.print(this.data + " ");
    }

    boolean isVisited() {
        return this.isVisited;
    }
}
