class Solution {
    public int maxProduct(int[] nums) {
        
        int currMax = nums[0], max = nums[0], currMin = nums[0];
        
        for(int i=1; i<nums.length; i++) {
            int temp = Math.max(Math.max(currMax * nums[i], currMin * nums[i]), nums[i]);
            currMin = Math.min(Math.min(currMax * nums[i], currMin * nums[i]), nums[i]);
            currMax = temp;
            max = Math.max(max,currMax);
        }
        
       
        
        return max;
        
    }
}