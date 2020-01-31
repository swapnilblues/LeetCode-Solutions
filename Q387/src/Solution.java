import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int firstUniqChar(String s) {

        int[] freq = new int[26];
        Arrays.fill(freq,0);

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)-97] ++;
        }
        for(int i = 0; i < s.length(); i++) {
            if(freq[s.charAt(i)-97] == 1) {
                return i;
            }
        }
        return -1;
    }
}