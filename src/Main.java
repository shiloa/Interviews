import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

    public static void dfs(TreeNode<String> root) {
        if (root != null) {
            root.visit();
            root.getNeighbors()
                    .stream()
                    .filter(node -> (node != null && !node.isVisited())).forEach(Main::dfs);
        }
    }

    public static void bfs(TreeNode<String> root, ArrayList<TreeNode<String>> queue) {
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
                bfs(node, queue);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode<String> root = getTree();
        dfs(root);

        root = getTree();
        System.out.println("\n");
        bfs(root, null);
    }

}

