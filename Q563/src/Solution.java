import javax.swing.tree.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int findTilt(TreeNode root) {
        return findTiltHelp(root);

    }

    private int findTiltHelp(TreeNode root) {

        if(root.isLeaf()) {
            return 0;
        }
        int x = findTiltHelp(root.);

    }
}