package Question_520_DetectCapital;

public class Solution {
    public boolean detectCapitalUse(String word) {
        boolean likeGoogle = true;
        boolean likeUSA = true;
        boolean likeleetcode = true;
        if (Character.isLowerCase(word.charAt(0))) {
            likeGoogle = false;
            likeUSA = false;
        } else {
            likeleetcode = false;
            if (word.length() >= 2) {
                if (Character.isLowerCase(word.charAt(1))) {
                    likeUSA = false;
                } else {
                    likeGoogle = false;
                }
            }
        }
        for (int i = 1; i < word.length(); i++) {
            if (Character.isLowerCase(word.charAt(i)) && likeUSA) {
                return false;
            } else if (Character.isUpperCase(word.charAt(i)) && (likeGoogle || likeleetcode)) {
                return false;
            }
        }
        return true;
    }
}
