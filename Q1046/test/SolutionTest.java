import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] stones = {2, 7, 4, 1, 8, 1};
        System.out.println(solution.lastStoneWeight(stones));
    }
}