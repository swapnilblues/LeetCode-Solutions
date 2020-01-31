import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode treeNode = new TreeNode(5);
        treeNode.left.val = 3;
        treeNode.right.val = 4;
        System.out.println(solution.binaryTreePaths(treeNode));
    }

}