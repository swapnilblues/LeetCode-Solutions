//class Solution {
//    public void rotate(int[] nums, int k) {
//
//        int[] c = new int[nums.length];
//
//        if (nums.length > 1) {
//            for (int i = 0; i < nums.length; i++) {
//                if ((i + k) >= nums.length) {
//                    c[(i + k) % nums.length] = nums[i];
//                } else {
//                    c[i + k] = nums[i];
//                }
//            }
//            for (int i = 0; i < nums.length; i++) {
//                nums[i] = c[i];
//            }
//        }
//    }
//}
class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int s, int e) {

        int temp;
        while (s < e) {
            temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }
}