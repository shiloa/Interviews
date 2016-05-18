import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A naive implementation of a binary tree's node
 * @param <T> the datatype for this node
 */
public class TreeNode<T> {

    private TreeNode<T> left;
    private TreeNode<T> right;
    private T data;
    private boolean isVisited;

    public TreeNode(T data) {
        this.data = data;
        this.isVisited = false;
    }

    public void assign(TreeNode left, TreeNode right) {
        this.left = left;
        this.right = right;
        this.isVisited = false;
    }

    public List<TreeNode<T>> getNeighbors() {
        return Arrays.asList(this.left, this.right);
    }

    public void visit() {
        this.isVisited = true;
        System.out.print(this.data + " ");
    }

    public boolean isVisited() {
        return this.isVisited;
    }
}
