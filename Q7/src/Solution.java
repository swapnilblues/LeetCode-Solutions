class Solution {
    public int reverse(int x) {

        long y = 0;
        int copy = Math.abs(x);

        while (copy > 0) {
            y = y * 10 + copy % 10;
            copy /= 10;
        }
        if (y > Integer.MAX_VALUE) {
            return 0;
        }

        if (x < 0) {
            y *= -1;
        }


        return (int) y;
    }
}