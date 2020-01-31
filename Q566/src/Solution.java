class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {

        int[][] newNums = new int[r][c];
        int row = nums.length;
        int col = nums[0].length;

        if (r * c != row * col) {
            return nums;
        }

        int i1 = 0, j1 = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                newNums[i1][j1] = nums[i][j];
                j1++;
                if (j1 == c) {
                    j1 = 0;
                    i1++;
                }
            }
        }
        return newNums;
    }
}
