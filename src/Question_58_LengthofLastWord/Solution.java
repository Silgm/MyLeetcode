package Question_58_LengthofLastWord;

public class Solution {
    public int lengthOfLastWord(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int i = s.length() - 1;
        while (i > -1 && s.charAt(i) == ' ') {
            i--;
        }
        int max = 0;
        for (; i > -1 && s.charAt(i) != ' '; i--, max++) ;
        return max;
    }
}
