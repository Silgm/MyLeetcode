package Question_45_JumpGameII;

public class Solution {

    public int jump(int[] nums) {
        int step_count = 0;
        int step = 0;
        while (step < nums.length - 1) {
            step = getNextPosition(nums, step);
            step_count++;
        }
        return step_count;
    }

    private int getNextPosition(int[] num, int position) {
        int root = num[position];
        int max = Integer.MIN_VALUE;
        int nextPosition = position;
        for (int i = position + 1; i <= position + root; i++) {
            if (i >= num.length - 1) {
                return num.length - 1;
            }
            int distance = i - position;
            int loss = root - distance;
            int weight = num[i] - loss;
            if (weight > max) {
                max = weight;
                nextPosition = i;
            }
        }
        return nextPosition;
    }

}
