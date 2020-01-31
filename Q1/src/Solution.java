import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] arr = new int[2];
        HashMap<Integer,Integer> h = new HashMap<>();
        int i=0;
        for(int j=1;j<nums.length;j++) {
            h.put(nums[i],i);
            if(h.containsKey(target - nums[j])) {
                arr[0] = h.get(target - nums[j]);
                arr[1] = j;
            }
            i++;
        }
        return arr;
    }
}