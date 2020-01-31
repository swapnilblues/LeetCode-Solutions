import java.util.LinkedList;

class Solution {
    public void reverseVowels(char[] s) {

        int i = 0, j = s.length - 1;
        LinkedList<Character> vowel = new LinkedList<>();
        vowel.add('a');
        vowel.add('e');
        vowel.add('i');
        vowel.add('o');
        vowel.add('u');
        vowel.add('A');
        vowel.add('E');
        vowel.add('I');
        vowel.add('O');
        vowel.add('U');
        while (i < j) {

            if (vowel.contains(s[i])
                    || vowel.contains(s[j])) {

//                System.out.println(i+" "+s[i]);
//                System.out.println(j+" "+s[j]);
                while (i < j &&
                        !(vowel.contains(s[i]))) {
//                    System.out.println("i");
                    i++;
                }
                while (i < j &&
                        !(vowel.contains(s[j]))) {
//                    System.out.println("j");
                    j--;
                }
//                System.out.println(i+" "+s[i]);
//                System.out.println(j+" "+s[j]);

                s[i] = (char) (s[i] + s[j]);
                s[j] = (char) (s[i] - s[j]);
                s[i] = (char) (s[i] - s[j]);

            }

            i++;
            j--;
        }
    }
}