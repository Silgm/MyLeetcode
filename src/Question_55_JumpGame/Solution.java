package Question_55_JumpGame;

public class Solution {
    public boolean canJump(int[] nums) {
        boolean t = true;
        int position = 0;
        while (position < nums.length-1 && t) {
            position = getNextPosition(nums, position);
            if (position == -1) {
                t = false;
            }
        }
        return t;
    }

    private int getNextPosition(int[] nums, int position) {
        if (position + nums[position] >= nums.length - 1) {
            return nums.length - 1;
        }
        int nextPosition = -1;
        int max_weight = 0;
        for (int i = position + nums[position], loss = 0; i > position; i--, loss--) {
            int weight = nums[i] + loss;
            if (weight > max_weight) {
                nextPosition = i;
                max_weight = weight;
            }
        }
        return nextPosition;
    }

}
