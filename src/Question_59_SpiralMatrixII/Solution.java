package Question_59_SpiralMatrixII;

public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] nums = new int[n][n];
        int value = 1;
        int top = -1;
        int left = -1;
        int right = n;
        int down = n;
        while (down - top > 1 && right - left > 1) {
            for (int i = left + 1; i < right; i++) {
                nums[top + 1][i] = value++;
            }
            top++;
            for (int i = top + 1; (down - top > 1 && right - left > 1) && i < down; i++) {
                nums[i][right - 1] = value++;
            }
            right--;
            for (int i = right - 1; (down - top > 1 && right - left > 1) && i > left; i--) {
                nums[down - 1][i] = value++;
            }
            down--;
            for (int i = down - 1; (down - top > 1 && right - left > 1) && i > top; i--) {
                nums[i][left + 1] = value++;
            }
            left++;
        }
        return nums;
    }
}
