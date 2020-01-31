import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {0,0,2,2};
        int[] b = {1,1,3,3};
        boolean bool = solution.isRectangleOverlap(a,b);
        System.out.println(bool);
    }

}