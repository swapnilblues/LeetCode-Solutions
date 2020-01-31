class Solution {
    public String reverseWords(String s) {

        char ch;
        String s1 = "", word = "";
        s += " ";
        for (int i = 0; i < s.length(); i++) {

            ch = s.charAt(i);
            if (ch == ' ') {
                s1 += word + " ";
                word = "";
            } else {
                word = ch + word;
            }
        }
        return s1.trim();
    }

}