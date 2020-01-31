import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {

        List<String> paths = new ArrayList<String>();
        StringBuilder path = new StringBuilder("");

        if (root != null) {
            dfs(root, paths, path);
        }

        return paths;

    }

    public void dfs(TreeNode node, List<String> paths, StringBuilder path) {

        if (node == null) {
            return;
        }

        if (node.left == null && node.right == null) {
            path.append(node.val);
            paths.add(path.toString());
            return;
        }

        path.append(node.val);

        if (node.left != null) {
            StringBuilder leftpath = new StringBuilder(path);
            leftpath.append("->");
            dfs(node.left, paths, leftpath);
        }

        if (node.right != null) {
            StringBuilder rightpath = new StringBuilder(path);
            rightpath.append("->");
            dfs(node.right, paths, rightpath);
        }
    }
}