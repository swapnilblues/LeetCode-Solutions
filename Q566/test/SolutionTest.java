import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] nums = {{1,2},{3,4}};
        int[][] newNums = solution.matrixReshape(nums,2,4);
        System.out.println(Arrays.deepToString(newNums));
    }


}