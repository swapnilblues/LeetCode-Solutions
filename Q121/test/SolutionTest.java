import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] prices = {7,6,4,3,1};
        int profit = solution.maxProfit(prices);
        System.out.println(profit);
    }


}