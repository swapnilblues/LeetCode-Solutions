import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] arr = {"dog","racecar","car"};
        System.out.println(solution.longestCommonPrefix(arr));
    }

}