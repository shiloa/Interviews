package com.shiloa.Interviews;

public class Main {

    public static void main(String[] args) {
        TreeNode<String> root = Utils.buildTree();
        System.out.println("The height of the tree is " + TreesAndGraphs.getTreeHeight(root));

        String balanced = TreesAndGraphs.isTreeBalanced(root) ? "" : " not";
        System.out.println("The tree is" + balanced + " balanced");

        System.out.print("DFS: ");
        TreesAndGraphs.dfs(root);
        System.out.print("\n");

        System.out.print("BFS: ");
        root = Utils.buildTree();
        TreesAndGraphs.bfs(root);
    }
}

