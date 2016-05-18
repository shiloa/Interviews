import java.util.ArrayList;

public class Algorithms {

    public static void dfs(TreeNode<String> root) {
        if (root != null) {
            root.visit();
            root.getNeighbors()
                    .stream()
                    .filter(node -> (node != null && !node.isVisited())).forEach(Algorithms::dfs);
        }
    }

    public static void bfs(TreeNode<String> root) {
        ArrayList<TreeNode<String>> queue = new ArrayList<TreeNode<String>>();
        bfsHelper(root, queue);
    }

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
}
