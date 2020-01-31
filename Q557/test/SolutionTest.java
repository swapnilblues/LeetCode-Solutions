import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "Let's take LeetCode contest";
        String revString = solution.reverseWords(s);
        System.out.println(revString);
    }

}