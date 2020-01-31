class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) {
            return "";
        }

        int c;
        String prefix = "";
        int index = 0;
        for (int j = 0; j < strs[0].length(); j++) {
            c = 1;
            for (int i = 1; i < strs.length; i++) {

                if (j >= strs[i].length()) {
                    break;
                }
                if (strs[0].charAt(j) == strs[i].charAt(j)) {
                    c++;
                }else {
                    break;
                }
            }
            if(c == strs.length) {
                index++;
            }else {
                break;
            }
        }
        return strs[0].substring(0, index);
    }
}
