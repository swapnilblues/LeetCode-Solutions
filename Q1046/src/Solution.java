import java.util.Arrays;

class Solution {
    public int lastStoneWeight(int[] stones) {

        if (stones.length == 1) {
            return stones[0];
        }
        if (stones.length == 0) {
            return 0;
        }

        Arrays.sort(stones);
        int i = stones.length - 1;
        while (stones[i - 1] != 0) {
            if (stones[i] == stones[i - 1]) {
                stones[i] = 0;
            } else {
                stones[i] -= stones[i - 1];
            }
            stones[i - 1] = 0;
            Arrays.sort(stones);
        }
        return stones[i];
    }
}