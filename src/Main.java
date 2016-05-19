import javax.transaction.TransactionRequiredException;

public class Main {

    public static TreeNode<String> getTree() {
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

    public static void main(String[] args) {
        TreeNode<String> root = getTree();
        System.out.println("The height of the tree is " + Algorithms.getTreeHeight(root));

        String balanced = Algorithms.isTreeBalanced(root) ? "" : " not";
        System.out.println("The tree is" + balanced + " balanced");

        System.out.print("DFS: ");
        Algorithms.dfs(root);
        System.out.print("\n");

        System.out.print("BFS: ");
        root = getTree();
        Algorithms.bfs(root);
    }

}

