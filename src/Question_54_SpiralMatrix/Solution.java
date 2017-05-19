package Question_54_SpiralMatrix;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        if (matrix.length != 0) {
            int top = -1;
            int left = -1;
            int right = matrix[0].length;
            int down = matrix.length;
            while (down - top > 1 && right - left > 1) {
                for (int i = left + 1; i < right; i++) {
                    list.add(matrix[top + 1][i]);
                }
                top++;
                for (int i = top + 1; down - top > 1 && right - left > 1 && i < down; i++) {
                    list.add(matrix[i][right - 1]);
                }
                right--;
                for (int i = right - 1; down - top > 1 && right - left > 1 && i > left; i--) {
                    list.add(matrix[down - 1][i]);
                }
                down--;
                for (int i = down - 1; down - top > 1 && right - left > 1 && i > top; i--) {
                    list.add(matrix[i][left + 1]);
                }
                left++;
            }
        }
        return list;
    }
}
