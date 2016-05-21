package com.shiloa.Interviews;

public class Main {

    public static void main(String[] args) {
        String hello = "hello";

        System.out.println(new Integer('a'));
        for (int i = 0 ; i < hello.length() ; i++) {
            int val = hello.charAt(i) - 'a';
            System.out.println(val);
        }
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

