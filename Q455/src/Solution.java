import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {

        int content = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        for(int i =g.length-1, j =s.length-1;i>=0 && j>=0; ) {
            if(s[j] >= g[i]) {
                content++;
                j--;
            }
            i--;
        }
     return content;

    }
}