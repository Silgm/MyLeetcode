package Question_53_MaximumSubarray;

public class Solution {
    public int maxSubArray(int[] a) {
        int max = Integer.MIN_VALUE;
        int position = 0;
        for (int x : a) {
            if (x >= 0) {
                max = x;
                position++;
                break;
            } else {
                if (x > max) {
                    max = x;
                }
            }
            position++;
        }
        int value = max;
        while (position < a.length) {
            if (a[position] >= 0) {
                value += a[position];
                if (value > max) {
                    max = value;
                }
            } else {
                if ((value + a[position]) < 0) {
                    value = 0;
                } else {
                    value += a[position];
                    if (value > max) {
                        max = value;
                    }
                }
            }
            position++;
        }
        return max;
    }

}
