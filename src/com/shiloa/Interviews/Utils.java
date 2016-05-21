package com.shiloa.Interviews;

class Utils {

    static TreeNode<String> buildTree() {
        TreeNode<String> A = new TreeNode<String>("A");
        TreeNode<String> B = new TreeNode<String>("B");
        TreeNode<String> C = new TreeNode<String>("C");
        TreeNode<String> D = new TreeNode<String>("D");
        TreeNode<String> E = new TreeNode<String>("E");
        TreeNode<String> F = new TreeNode<String>("F");

        A.assign(B, C);
        B.assign(D, E);
        D.assign(F, null);

        return A;
    }

    /**
     * Builds a weighted, directed graph for testing.
     *
     *        B
     *      /   \
     *     6     2
     *   /
     * A
     *   \
     *    3
     *     \
     *      C
     * @return
     */
    static Graph<String> buildGraph() {
        // wip
        Vertex<String> A = new Vertex<String>("A");
        Vertex<String> B = new Vertex<String>("B");
        Vertex<String> C = new Vertex<String>("C");
        Vertex<String> D = new Vertex<String>("D");
        Vertex<String> E = new Vertex<String>("E");
        Vertex<String> F = new Vertex<String>("F");
        Vertex<String> G = new Vertex<String>("G");

        Edge<String> AB = new Edge<String>(6, A, B);
        Edge<String> AC = new Edge<String>(3, A, C);
        Edge<String> BD = new Edge<String>(2, B, D);
        Edge<String> CD = new Edge<String>(3, C, D);
        Edge<String> DE = new Edge<String>(5, D, E);
        Edge<String> DF = new Edge<String>(4, D, F);
        Edge<String> FE = new Edge<String>(3, F, E);
        Edge<String> EG = new Edge<String>(1, E, G);

        Graph<String> graph = new Graph<String>();

        return graph;
    }
}
