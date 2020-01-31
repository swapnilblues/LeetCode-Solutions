import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    public static void main(String[] args) {
        int[] g = {1,2};
        int[] s = {1,2,3};
        Solution solution = new Solution();
        int count = solution.findContentChildren(g,s);
        System.out.println(count);
    }
}