package Question_238_ProductofArrayExceptSelf;

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int cnt = 1;
        boolean hasZero = false;
        for (int value : nums) {
            if (value != 0 || hasZero) {
                cnt *= value;
            } else {
                hasZero = true;
            }
        }
        int position = 0;
        for (int value : nums) {
            if (hasZero) {
                if (value == 0) {
                    nums[position] = cnt;
                } else {
                    nums[position] = 0;
                }
            } else {
                nums[position] = cnt / value;
            }
            position++;
        }
        return nums;
    }
}
