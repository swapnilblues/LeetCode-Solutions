import java.util.Arrays;

class Solution {
    public boolean validPalindrome(String s) {


//        String s1;
//        int counter;

//        for (int k = 0; k < s.length(); k++) {
//            counter = 0;
//            s1 = "";
//            s1 = s.substring(0, k) + s.substring(k + 1);
//            int i = 0, j = s1.length() - 1;
//            while (i < j) {
//                if (s1.charAt(i) != s1.charAt(j)) {
//                    counter++;
//                    break;
//                }
//                i++;
//                j--;
//            }
//            if (counter == 0) {
//                return true;
//            }
//        }
//        return false;

        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                String s1 = s.substring(0, i) + s.substring(i + 1);
                String s2 = s.substring(0, j) + s.substring(j + 1);
                return palCheck(s1) || palCheck(s2);
            }
            i++;
            j--;
        }
        return true;

    }

    private boolean palCheck(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

