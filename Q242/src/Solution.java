import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> h = new HashMap<>();
        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {

            if (h.containsKey(s.charAt(i))) {
                h.put(s.charAt(i), h.get(s.charAt(i)) + 1);
            } else {
                h.put(s.charAt(i), 1);
            }
            if (h.containsKey(t.charAt(i))) {
                h.put(t.charAt(i), h.get(t.charAt(i)) - 1);
            } else {
                h.put(t.charAt(i), -1);
            }
        }
        for (Map.Entry<Character, Integer> h1 : h.entrySet()) {
            int val = (int) h1.getValue();
            if (val != 0) {
                return false;
            }
        }
        return true;
    }
}