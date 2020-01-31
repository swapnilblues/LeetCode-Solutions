import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    public static void main(String[] args) {

        Solution solution = new Solution();
        int sum = 22;
        TreeNode treeNode = new TreeNode(5);
        treeNode.left = new TreeNode(4);
        treeNode.right = new TreeNode(8);
        treeNode.left.left = new TreeNode(11);
        treeNode.left.left.left = new TreeNode(7);
        treeNode.left.left.right = new TreeNode(2);
        treeNode.right.left = new TreeNode(13);
        treeNode.right.right = new TreeNode(4);
        treeNode.right.right.right = new TreeNode(1);
        System.out.println(solution.hasPathSum(treeNode,sum));
    }

}